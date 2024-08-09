## REST API
Rest api or restful API stands for representational state transfer application programming interface allows various software applications to communicate with each other over the internet using standard HTTP methods such as GET,POST,PUT, DELETE etc

## why rest is used?
They allow different software systems to communicate with each other over the internet, regardless of the underlying architecture or technology.It supports scalable system design.it separates the client and server concerns, allowing them to evolve independently.

## Client-Server Communication
Client-server communication is a model where a client generally a web browser or app requests services or resources from a server. The server processes the request and sends back a response. This model is fundamental to web development, where clients and servers communicate over the internet.

## HTTP Protocol
HTTP (HyperText Transfer Protocol) is the foundation of data communication on the web. It defines how messages are formatted and transmitted, and how web servers and browsers should respond to various commands.

## HTTP Methods
HTTP methods are the verbs that indicate the desired action to be performed on a resource. The most common methods are:

GET: Retrieve data from a server at the specified resource.
POST: Send data to the server to create a new resource.
PUT: Update an existing resource on the server.
DELETE: Remove a resource from the server.
HEAD: Similar to GET, but only retrieves the headers.
OPTIONS: Describe the communication options for the target resource.
PATCH: Partially update a resource on the server.

## cURL Commands for HTTP Methods
GET:
curl -X GET http://example.com/resource
POST:
curl -X POST http://example.com/resource -d '{"key":"value"}' -H "Content-Type: application/json"
PUT:
curl -X PUT http://example.com/resource/1 -d '{"key":"new_value"}' -H "Content-Type: application/json"
DELETE:
curl -X DELETE http://example.com/resource/1
HEAD:
curl -I http://example.com/resource
OPTIONS:
curl -X OPTIONS http://example.com/resource
PATCH:
curl -X PATCH http://example.com/resource/1 -d '{"key":"updated_value"}' -H "Content-Type: application/json"

## TCP (Transmission Control Protocol)
It is protocol of the Internet Protocol Suite.  It is used for data integrity and delivery reliability  ex. web browsing, email, and file transfers.

## Template design pattern

The Template design pattern is a behavioral design pattern that defines the skeleton of an algorithm in base class.It allows subclasses to override specific steps of the algorithm without changing its structure. This pattern provides a way to define  some parts of an algorithm once and allows subclasses to define the behavior of some of its steps.

## Strategy Design Pattern

The Strategy design pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. The pattern lets the algorithm vary independently from clients that use it. This approach promotes flexibility in the selection of algorithms at runtime.