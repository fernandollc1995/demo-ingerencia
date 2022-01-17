package com.test.ingerencia.service.impl;

import com.test.ingerencia.model.response.New;
import com.test.ingerencia.model.response.Response;
import com.test.ingerencia.service.ExternalService;
import com.utils.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;

@Service
public class ExternalServiceImpl implements ExternalService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    @Override
    public Response<New> getHackerNews() {

        Response<New> response = new Response<>();

        try {
            String urlHackerNews = env.getProperty("url.hacker-news");

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<New> responseEntity =
                    restTemplate.exchange(
                            urlHackerNews,
                            HttpMethod.GET,
                            entity,
                            New.class);

            New news = responseEntity.getBody();
            response.setData(news);
            response.setStatus(StatusEnum.STATUS_SUCCESSFULL.create());

        } catch (Exception e) {
            System.out.println(e);
            response.setStatus(StatusEnum.STATUS_FAIL.create());
        }

        return response;
    }
}
