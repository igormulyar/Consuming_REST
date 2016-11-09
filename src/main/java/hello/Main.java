package hello;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        RestTemplate restTemplate = new RestTemplate();

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
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        messageConverters.add(new MappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);

        List<CourtCase> list = Arrays.asList(restTemplate.postForObject(url, httpEntity, CourtCase[].class));
        //ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);

        System.out.println(list.toString());
    }

}
