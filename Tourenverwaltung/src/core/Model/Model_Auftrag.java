package core.Model;

import java.util.HashMap;
import java.util.Map;

import core.Controller.Connector;

public class Model_Auftrag {

	public Model_Auftrag() {
		
	}
	public String[] getList() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT auftragId FROM auftrag");
			String[] ids = result.get("auftragId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public Map<String,String> getDataFromAuftrag(int id) {
		try {
			Map<String,String[]> auftrag = 
					Connector.getQueryResult("SELECT auftrag.auftragId,auftrag.entfernung,auftrag.datum, "
										+ "ziel.plz as zielPlz,ziel.stadt as zielStadt,ziel.straﬂe as zielStraﬂe,ziel.hausnummer as zielHausnummer,ziel.adresszusatz as zielAdresszusatz, "
										+ "startAdresse.plz as startPlz,startAdresse.stadt as startStadt,startAdresse.straﬂe as startStraﬂe,startAdresse.hausnummer as startHausnummer,startAdresse.adresszusatz as startAdresszusatz, "
										+ "kunde.name, kunde.vorname "
										+ "FROM `auftrag` "
										+ "LEFT JOIN adresse ziel on auftrag.zielAdressId = ziel.adressId "
										+ "LEFT JOIN kunde on auftrag.kundenId=kunde.kundenId "
										+ "LEFT JOIN adresse startAdresse on kunde.adressId = startAdresse.adressId "
										+ "WHERE auftrag.auftragId = "+id);
			
			Map<String,String> mapResult = new HashMap<String, String>();
			mapResult.put("auftragsnummer",auftrag.get("auftragId")[0]);
			mapResult.put("kunde",auftrag.get("name")[0]+", "+auftrag.get("vorname")[0]);
			mapResult.put("start",auftrag.get("startPlz")[0]+", "+auftrag.get("startStadt")[0]);
			mapResult.put("ziel",auftrag.get("zielPlz")[0]+", "+auftrag.get("zielStadt")[0]);
			
			return mapResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
