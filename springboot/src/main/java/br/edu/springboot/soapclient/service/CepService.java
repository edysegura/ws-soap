package br.edu.springboot.soapclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.springboot.soapclient.adapter.CorreiosServiceAdapter;
import br.edu.springboot.soapclient.config.Constants;
import br.edu.springboot.soapclient.correios.ConsultaCEP;
import br.edu.springboot.soapclient.correios.ConsultaCEPResponse;
import br.edu.springboot.soapclient.correios.EnderecoERP;
import br.edu.springboot.soapclient.correios.ObjectFactory;

@Service
public class CepService {

  @Autowired
  CorreiosServiceAdapter correiosServiceAdapter;

  public EnderecoERP getAddressInfo(String cep) {
    ObjectFactory objectFactory = new ObjectFactory();

    ConsultaCEP consultaCEP = new ConsultaCEP();
    consultaCEP.setCep(cep);

    ConsultaCEPResponse response = correiosServiceAdapter
      .getAddressByCep(
        Constants.CORREIOS_URL,
        objectFactory.createConsultaCEP(consultaCEP)
      );

      return response.getReturn();
  }

}
