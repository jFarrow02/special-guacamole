FROM node:18-alpine

WORKDIR /testapp-b

COPY ./package.json /testapp-b/

RUN mkdir -p /testapp-b/app

COPY ./app /testapp-b/app

RUN ls -l

RUN npm install

CMD ["node", "./app/index.js"]
