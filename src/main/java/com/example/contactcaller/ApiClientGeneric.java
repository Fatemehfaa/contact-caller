package com.example.contactcaller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ApiClientGeneric {

    RestTemplate restTemplate;


    public <T> T fetchEntity(String url, Class<T> responseType) {

        ResponseEntity<T> response = restTemplate.getForEntity(url, responseType);
        return response.getBody();

    }
}

