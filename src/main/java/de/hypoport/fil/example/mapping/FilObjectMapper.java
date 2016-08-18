package de.hypoport.fil.example.mapping;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.Date;

public class FilObjectMapper extends ObjectMapper {

  public FilObjectMapper() {

    SimpleModule module = new SimpleModule("FIL Mapper");
    module.addSerializer(Date.class, new DateConverter.Serializer());
    module.addDeserializer(Date.class, new DateConverter.Deserializer());

    this.registerModule(module);
  }
}
