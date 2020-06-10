const soap = require('soap');

const url = 'https://apphom.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl';
const args = { cep: '37540000' };

(async () => {
  const client = await soap.createClientAsync(url);
  const [ result ] = await client.consultaCEPAsync(args);
  console.log(result);
})();
