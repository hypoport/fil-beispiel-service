package de.hypoport.fil.example;

import de.hypoport.fil.example.model.InData;
import de.hypoport.fil.example.model.OutData;
import de.hypoport.fil.example.soap.SoapDokStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.WebEndpoint;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller("/inout")
public class JsonInOutController {

  static final Logger log = Logger.getLogger(JsonInOutController.class.getName());

  Integer counter = 0;

  @Value("${teststring}")
  private String teststring;

  @Autowired
  SoapDokStoreService dokStore;

  @RequestMapping(method = POST, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
  public
  @ResponseStatus(OK)
  @ResponseBody
  OutData gibWasZurueck(@RequestBody InData indata) {

    log.info("InData: " + indata.getMessage());

//    dokStore.createEmptyDokument("")


    OutData outData = new OutData();
    outData.setMessage("Da hast du was " + teststring);
    outData.setNummer(counter ++);
    return outData;
  }


}
