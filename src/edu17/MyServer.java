package edu17;

import com.sun.net.httpserver.HttpServer;

import java.io.OutputStream;
import java.net.InetSocketAddress;

public class MyServer {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 100);
        server.createContext("/hello", request -> {
                    System.out.println("Request from: ' " +
                            request.getRemoteAddress() + " "
                            + request.getRequestMethod() + " "
                            + request.getRequestURI());
                    byte[] response = "Hello, HTTP world from port 8080!".getBytes();
                    request.sendResponseHeaders(200, response.length);
                    try (OutputStream result = request.getResponseBody()) {
                        result.write(response);
                    }
                }
        );
        server.createContext("/stop", request -> {
            System.out.println("Stopping our server. Good bye!!");
            byte[] response = "Good bye from port 8080!".getBytes();
            request.sendResponseHeaders(200, response.length);
            try (OutputStream result = request.getResponseBody()) {
                result.write(response);
            }
            server.stop(1);
        });
        server.start();

    }
}

class MyServer1 {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 100);
        server.createContext("/hello", request -> {
                    System.out.println("Request from: ' " +
                            request.getRemoteAddress() + " "
                            + request.getRequestMethod() + " "
                            + request.getRequestURI());
                    byte[] response = "Hello, HTTP world from port 8081!".getBytes();
                    request.sendResponseHeaders(200, response.length);
                    try (OutputStream result = request.getResponseBody()) {
                        result.write(response);
                    }
                }
        );
        server.createContext("/stoping", request -> {
            System.out.println("Stopping our server. Good bye!!");
            byte[] response = "Good bye from port 8080!".getBytes();
            request.sendResponseHeaders(200, response.length);
            try (OutputStream result = request.getResponseBody()) {
                result.write(response);
            }
            server.stop(1);
        });
        server.start();

    }
}
