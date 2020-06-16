package br.edu.springboot.soapclient.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.springboot.soapclient.correios.EnderecoERP;
import br.edu.springboot.soapclient.service.CepService;

@RestController
@RequestMapping("/v1/cep")
public class CepApi {

  @Autowired
  private CepService cepService;

  @GetMapping("{cep}")
  public EnderecoERP getAddressInfo(@NonNull @PathVariable String cep) {
    return cepService.getAddressInfo(cep);
  }

}
