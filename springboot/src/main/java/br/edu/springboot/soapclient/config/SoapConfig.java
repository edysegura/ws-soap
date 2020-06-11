package br.edu.springboot.soapclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import br.edu.springboot.soapclient.adapter.CorreiosServiceAdapter;

@Configuration
public class SoapConfig {

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath(Constants.WSDL_PACKAGE);
    return marshaller;
  }

  @Bean
  public CorreiosServiceAdapter soapConnector(Jaxb2Marshaller marshaller) {
    CorreiosServiceAdapter client = new CorreiosServiceAdapter();
    client.setDefaultUri(Constants.CORREIOS_URL);
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }

}
