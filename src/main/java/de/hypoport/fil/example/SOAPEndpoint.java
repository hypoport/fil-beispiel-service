package de.hypoport.fil.example;

import de.hypoport.fil.example.model.OutData;
import org.springframework.stereotype.Service;

import javax.xml.ws.WebEndpoint;

@Service
public class SOAPEndpoint {


  @WebEndpoint(name = "/endpoint")
  OutData outEndPoint() {
    return new OutData();
  }
}
