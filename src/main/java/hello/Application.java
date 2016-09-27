package hello;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) throws UnirestException, IOException {
        HttpResponse<JsonNode> jsonResponse = Unirest.post("http://pm.od.court.gov.ua/new.php")
                .header("Host", "pm.od.court.gov.ua")
                .header("Accept", "application/json, text/javascript, */*; q=0.01")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("X-Requested-With", "XMLHttpRequest")
                .header("Referer", "http://pm.od.court.gov.ua/sud1522/csz/")
                .body("q_court_id=1522")
                .asJson();

        String requestString = jsonResponse.getBody().toString();
        JSONArray jsonArray = jsonResponse.getBody().getArray();
        JsonNode node = new JsonNode(jsonArray.get(0).toString());

        List<CourtCase> caseList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){
            caseList.add(parseCourtCaseFromJson(new JsonNode(jsonArray.get(i).toString()).getObject()));

        }

        System.out.println(caseList.get(7).toString());
        //System.out.println(jsonArray.get(0).toString());

        //writeToFile(requestString);


    }

    private static CourtCase parseCourtCaseFromJson(JSONObject jsonCase) {
        return new CourtCase(
                jsonCase.getString("date"),
                jsonCase.getString("number"),
                jsonCase.getString("involved"),
                jsonCase.getString("description"),
                jsonCase.getString("judge"),
                jsonCase.getString("forma"),
                jsonCase.getString("add_address")
                );
    }


    private static void writeToFile(String requestString) throws IOException {
        File file = new File("/home/igor/Development/garbage/restOutput.txt");
        OutputStream out = new FileOutputStream(file);

        byte[] buffer = requestString.getBytes();
        out.write(buffer, 0, buffer.length);
        out.close();
    }
}