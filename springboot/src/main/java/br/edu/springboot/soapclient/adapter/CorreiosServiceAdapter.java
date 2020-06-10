package br.edu.springboot.soapclient.adapter;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.edu.springboot.soapclient.correios.ConsultaCEPResponse;

public class CorreiosServiceAdapter extends WebServiceGatewaySupport {

  public ConsultaCEPResponse getAddressByCep(String url, Object request) {
    JAXBElement response = (JAXBElement) getWebServiceTemplate()
      .marshalSendAndReceive(url, request);
    return (ConsultaCEPResponse) response.getValue();
  }

}
