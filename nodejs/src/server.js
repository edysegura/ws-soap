import express from 'express';
import cors from 'cors';

import getAddressInfo from './cep.js';

const PORT = 3333;
const HOST = 'localhost';

const app = express();
app.use(cors());

app.get('/', async (_, response) => {
  response.send(`
    <a href="http://${HOST}:${PORT}/v1/cep/37540000">
      http://${HOST}:${PORT}/v1/cep/37540000
    </a>
  `);
});

app.get('/v1/cep/:cep', async (request, response) => {
  const cep = request.params.cep;
  response.json(await getAddressInfo(cep));
});

app.listen(PORT, () => {
  console.log(`Running on http://${HOST}:${PORT}`);
});
