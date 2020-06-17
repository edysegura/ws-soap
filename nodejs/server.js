'use strict';

const express = require('express');
const getAddressInfo = require('./cep');

const PORT = 3333;
const HOST = 'localhost';
const app = express();

app.get('/', async (request, response) => {
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
