package com.test.ingerencia.service;

import com.test.ingerencia.model.response.New;
import com.test.ingerencia.model.response.Response;

public interface ExternalService {

    Response<New> getHackerNews();
}
