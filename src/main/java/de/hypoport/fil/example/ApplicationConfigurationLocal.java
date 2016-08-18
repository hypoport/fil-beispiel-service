package de.hypoport.fil.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.hypoport.fil.example.mapping.FilObjectMapper;
import de.hypoport.fil.example.soap.SoapDokStoreService;
import de.hypoport.fil.example.soap.SoapDokStoreServiceImplService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class ApplicationConfigurationLocal {

  @Bean
  SoapDokStoreService dokStore() {

    // configuration der Service URL
    SoapDokStoreServiceImplService service = new SoapDokStoreServiceImplService();

    return service.getSoapDokStoreServiceImplPort();
  }


  @Bean
  ObjectMapper objectMapper() {
    ObjectMapper objectMapper = new FilObjectMapper();
    return objectMapper;
  }
}
