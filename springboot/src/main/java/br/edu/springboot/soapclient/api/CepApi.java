package br.edu.springboot.soapclient.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.springboot.soapclient.adapter.CorreiosServiceAdapter;
import br.edu.springboot.soapclient.config.Constants;
import br.edu.springboot.soapclient.correios.ConsultaCEP;
import br.edu.springboot.soapclient.correios.ConsultaCEPResponse;
import br.edu.springboot.soapclient.correios.EnderecoERP;
import br.edu.springboot.soapclient.correios.ObjectFactory;

@RestController
@RequestMapping("/v1/cep")
public class CepApi {

  @Autowired
  CorreiosServiceAdapter correiosServiceAdapter;

  @GetMapping("{cep}")
  public EnderecoERP getAddressInfo(@PathVariable String cep) {
    ObjectFactory objectFactory = new ObjectFactory();
    ConsultaCEP consultaCEP = new ConsultaCEP();
    consultaCEP.setCep(cep);
    ConsultaCEPResponse response = correiosServiceAdapter
      .getAddressByCep(Constants.CORREIOS_URL, objectFactory.createConsultaCEP(consultaCEP));
    return response.getReturn();
  }

}
