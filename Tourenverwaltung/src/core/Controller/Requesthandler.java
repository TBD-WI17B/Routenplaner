package core.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Requesthandler {

	private static final String URL = "https://api.openrouteservice.org/";
	private static final String token = "5b3ce3597851110001cf62480ff1ca98a26c4b13a279928bac75350b";
	public Requesthandler() {
		
	}
	
	/**
	 * Sendet eine URL GET-Request an OpenRoute Service.
	 * @param request URL mit GET-Parameter
	 * @return JSONObject
	 * @throws IOException
	 * @throws JSONException
	 */
	public static JSONObject sendRequest(String request) throws IOException, JSONException {
		InputStream is = new URL(request).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	    }
		
	}
	/**
	 * Hilfsmethode um Ergbeniss des URL-Request in JAVA JsonObject zu konvertieren
	 * @param rd BufferedReader des Inputstreams
	 * @return String mit inhalt des JSON
	 * @throws IOException
	 */
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) 
	    {
		      sb.append((char) cp);
	    }
	    return sb.toString();
	}
	  
	  /**
	   * Gibt die Koordinaten einer Adresse zurueck. Geocoding erfogt bei externen Serviceprovider
	   * @param adr Die gesuchte Adresse. Die Hausnummer muss vor der Stra�e stehen, getrennt mit einem Leerzeichen. Andere Daten werden mit einem Komma getrent
	   * @return JSONArray index 0: LON (L�ngengrad)  index 1: LAT(Breitengrad)
	   */
	  public static JSONArray getGeocoding(String adr) {
		  try {
			  String request = URL + "geocode/search" + "?api_key=" + token + "&text=" + URLEncoder.encode(adr, "UTF-8") ;	  
			 return sendRequest(request).getJSONArray("features").getJSONObject(0).getJSONObject("geometry").getJSONArray("coordinates");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		  return null;
	  }
	  /**
	   * Frag bei externen Serviceprovider nach der Route zwischen zwei Koordinaten und gibt die Distanz in Metern zur�ck
	   * @param startLAT Breitengrad des Startpunktes
	   * @param startLON L�ngengrad des Startpunktes
	   * @param zielLAT Breitengrad des Zielpunktes
	   * @param zielLON L�ngengrad des Zielpunktes
	   * @return Distanz in Meter
	   */
	  public static JSONObject getSummary(double startLAT, double startLON, double zielLAT, double zielLON) {
		  try {
			  String request = URL + "directions" + "?api_key=" + token + "&coordinates=" + startLAT + "," + startLON + "%7C" + zielLAT + "," + zielLON + "&profile=driving-car&language=de&geometry=false&instructions=false";			
			  return sendRequest(request).getJSONArray("routes").getJSONObject(0).getJSONObject("summary");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	  }
	  /**
	   * URL Request mit einer Matrix (many-to-one) Anfrage Serviceprovider. Es wird die Eintferung und die Zeit zu einem Punkt von meheren anderen Punkten angefragt.
	   * @param standortLAT Breitengrad des Ausgangpunktes
	   * @param standortLON L�ngengrad des Ausgangpuntes
	   * @param startLAT Breitengrad angefragten Punkte
	   * @param startLON L�ngengrad der angefragten Punkte
	   * @return JSONObject mit distance[[]] und duration[[]]
	   */
	  public static JSONObject getMatrix(double standortLAT, double standortLON, double[] startLAT, double[] startLON) {
		  try {
			  String request = URL + "matrix" + "?api_key=" + token + "&locations=" ;			  
			  StringBuilder param = new StringBuilder(standortLAT+","+standortLON);
			  for(int i=0;i < startLAT.length;i++) {
				  param.append("|"+startLAT[i]+","+startLON[i]);
			  }			  
			  String end = "&sources=0&metrics=distance|duration&profile=driving-car";			  
			  request = request + param + end;
			  System.out.println("Requesent send: "+request);
			  return sendRequest(request);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		  return null;
	  }

}
