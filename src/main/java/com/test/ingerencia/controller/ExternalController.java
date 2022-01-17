package com.test.ingerencia.controller;

import com.test.ingerencia.model.response.New;
import com.test.ingerencia.model.response.Response;
import com.test.ingerencia.service.ExternalService;
import com.utils.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/new")
public class ExternalController {

    @Autowired
    private ExternalService externalService;

    @GetMapping(value = "/hacker")
    public ResponseEntity<Response<New>> getHackerNews() {
        Response<New> news = externalService.getHackerNews();

        return (StatusEnum.STATUS_SUCCESSFULL.isCode(news.getStatus()))
                ? new ResponseEntity<>(news, HttpStatus.OK)
                : new ResponseEntity<>(news, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
