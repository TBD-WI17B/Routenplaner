package core.Controller;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser {
	
	public JSONParser() {
		
	}
	
	public JSONObject getJSONfromURL(String url)
	{
		try {
			return Requesthandler.sendRequest(url);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

}
