package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                HttpClientBuilder.create().build());
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
        ObjectMapper mapper = new ObjectMapper();

        String url = "http://pm.od.court.gov.ua/new.php";
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

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
        List<CourtCase> cases = Arrays.asList(mapper.readValue(response.getBody(), CourtCase[].class));
        //System.out.println(cases.get(45).toString());
    }



}
