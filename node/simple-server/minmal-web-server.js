'use strict';

var http = require('http');
var url = require('url');

function handleGet(request, response) {
  var body = '<html><body><p>Hello World!</p></body></html>';
  response.writeHead(200, {
    'Content-Type' : 'text/html'
  });
  response.end(body);
}

function handlePost(request, response) {}

var server = http.createServer(
  function(request, response) {
    switch (request.method) {
      case 'GET':
        handleGet(request, response);
        break;
      case 'POST':
        handlePost(request, response);
        break;
      default:
        console.log("Unknow reqeust method");
    }
  }
);

server.listen(3000);

console.log("Server is listening on port 3000");
