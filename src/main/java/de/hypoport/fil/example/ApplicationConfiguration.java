package de.hypoport.fil.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.hypoport.fil.example.mapping.FilObjectMapper;
import de.hypoport.fil.example.soap.ObjectFactory;
import de.hypoport.fil.example.soap.SoapDokStoreService;
import de.hypoport.fil.example.soap.SoapDokStoreServiceImplService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.validation.ObjectError;

@Configuration
@Profile("!local")
public class ApplicationConfiguration {

  @Bean
  SoapDokStoreService dokStore() {

    // configuration der Service URL
    SoapDokStoreServiceImplService service = new SoapDokStoreServiceImplService();

    return service.getSoapDokStoreServiceImplPort();
  }

}
