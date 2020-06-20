import express from 'express';
import cors from 'cors';

import routes from './routes.js';

const PORT = process.env.PORT || 3000;
const HOST = process.env.HOST || 'localhost';

const app = express();
app.use(cors());
app.use(routes);

app.listen(PORT, () => {
  console.log(`Running on http://${HOST}:${PORT}`);
});
