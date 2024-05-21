package com.example.contactcaller;

import com.example.contactcaller.dto.PersonDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE , makeFinal = true)
@RequiredArgsConstructor
public class ContactCaller implements CommandLineRunner {

    RestTemplate restTemplate ;

    @Override
    public void run(String... args) throws Exception {
        String baseUrl ="http://localhost:8080";
        String number = "1234";

        String url = baseUrl+"/getPerson/"+number;
        ResponseEntity<PersonDto> response =restTemplate.getForEntity(url,PersonDto.class);

        PersonDto body = response.getBody();

        System.out.println(body);

    }

}
