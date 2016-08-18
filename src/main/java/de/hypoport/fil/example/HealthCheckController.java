package de.hypoport.fil.example;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HealthCheckController {

  @RequestMapping(method = GET, path = "/health")
  @ResponseStatus(OK)
  public
  @ResponseBody
  String getHealth() {
    return "ok";
  }
}
