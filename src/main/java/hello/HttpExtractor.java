package hello;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

//jsonResponse = Unirest.post("http://pm.od.court.gov.ua/new.php")
//        .header("Host", "pm.od.court.gov.ua")
//        .header("Accept", "application/json, text/javascript, */*; q=0.01")
//        .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
//        .header("Accept-Encoding", "gzip, deflate")
//        .header("Content-Type", "application/x-www-form-urlencoded")
//        .header("X-Requested-With", "XMLHttpRequest")
//        .header("Referer", "http://pm.od.court.gov.ua/sud1522/csz/")
//        .body("q_court_id=1522")
//        .asJson();

public class HttpExtractor {

    public List<CourtCase> getCourtCases (String url, String referer, int courtId) throws  IOException {
        List<CourtCase> caseList = new ArrayList<CourtCase>();
        RestTemplate restTemplate = new RestTemplate();

        url = "http://pm.od.court.gov.ua/new.php";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Host", "pm.od.court.gov.ua");
        headers.set("Accept", "application/json, text/javascript, */*; q=0.01");
        headers.set("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3");
        headers.set("Accept-Encoding", "gzip, deflate");
        headers.set("Content-Type", "application/x-www-form-urlencoded");
        headers.set("X-Requested-With", "XMLHttpRequest");
        headers.set("Referer", "http://pm.od.court.gov.ua/sud1522/csz/");
        String body = "q_court_id=1522";

        HttpEntity<String> httpEntity = new HttpEntity<>(body, headers);

        ResponseEntity<String> response = restTemplate.exchange(url,HttpMethod.POST, httpEntity, String.class);

        System.out.println(response.toString());

        return caseList;
    }

}