package de.hypoport.fil.example.model;

import java.util.Date;

public class OutData {

  String message;
  int nummer;
  Date datum = new Date();

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getNummer() {
    return nummer;
  }

  public void setNummer(int nummer) {
    this.nummer = nummer;
  }

  public Date getDatum() {
    return datum;
  }

  public void setDatum(Date datum) {
    this.datum = datum;
  }
}
