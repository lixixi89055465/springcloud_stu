package com.bjsxt.service.imp;

import com.bjsxt.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String client() {
        return restTemplate.getForObject("http://APPLICATION-SERVICE/demo", String.class);
    }
}
