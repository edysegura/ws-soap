import CepService from '../service/CepService.js';

export default class CepApi {

  static async index(_, response) {
    response.send(`
      <a href="/v1/cep/37540000">
        /v1/cep/37540000
      </a>
    `);
  }

  static async getAddressInfo(request, response) {
    const cep = request.params.cep;
    response.json(await CepService.getAddressInfo(cep));
  }

}
