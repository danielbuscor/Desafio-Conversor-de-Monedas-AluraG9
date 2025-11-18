package com.danielbuscor.challengeconversor.alurag9.operaciones;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIServicios {

    public double realizaConversion(String moneda1, String moneda2, double cantidad) {

        var direccion = "https://v6.exchangerate-api.com/v6/efc6ba7655fddc42e3144d05/pair/"
                + moneda1 +"/" + moneda2 + "/"+ cantidad;


        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = null;
        try {
            response = cliente
                    .send(solicitud, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonResponse = new Gson().fromJson(response.body(), JsonObject.class);
            //Encontre la siguiente opcion en Gson para que retorne el valor de la conversion como un double en vez
            //de String
            return jsonResponse.get("conversion_result").getAsDouble();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}



