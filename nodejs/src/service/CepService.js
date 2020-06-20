import soap from 'soap';

const WSDL_ENDPOINT = 'https://apphom.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl';

export default class CepService {

  static async getAddressInfo(cep) {
    const args = { cep };
    const client = await soap.createClientAsync(WSDL_ENDPOINT);
    const [result] = await client.consultaCEPAsync(args);
    return result;
  }

}
