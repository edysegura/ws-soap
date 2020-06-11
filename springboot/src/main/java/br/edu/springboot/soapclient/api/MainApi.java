package br.edu.springboot.soapclient.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainApi {

  @GetMapping
  public String index() {
    return "<a href=\"v1/cep/37540000\">/v1/cep/37540000</a>";
  }

}