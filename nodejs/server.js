'use strict';

const express = require('express');
const getAddressInfo = require('./cep');

// Constants
const PORT = 8080;
const HOST = 'localhost';

// App
const app = express();
app.get('/v1/cep', async (req, res) => {
  res.json(await getAddressInfo());
});

app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);
