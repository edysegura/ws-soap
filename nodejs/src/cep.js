import soap from 'soap';

const url = 'https://apphom.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl';

async function getAddressInfo (cep = '37540000') {
  const args = { cep };
  const client = await soap.createClientAsync(url);
  const [ result ] = await client.consultaCEPAsync(args);
  return result;
};

export default getAddressInfo;
