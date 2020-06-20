import express from 'express';
import CepApi from './api/CepApi.js';

const routes = express.Router();

routes.get('/', CepApi.index);
routes.get('/v1/cep/:cep', CepApi.getAddressInfo);

export default routes;
