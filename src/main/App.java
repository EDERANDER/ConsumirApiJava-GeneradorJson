package main;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import caracteristicas.StarWars;
import dto.DTO;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();
    ArrayList<StarWars> peliculas = new ArrayList<>();

    ArrayList<String> numeroPeliculas = new ArrayList<>();


        while (true) {
            
            try{
                System.out.println("Ingrese pelicula que desees buscar: ");
                String numero = scanner.nextLine();
                if(numero == null || numero.trim().isEmpty()){
                    throw new NullPointerException();
                }
                for (int i = 0; i < numeroPeliculas.size(); i++) {
                    if(numeroPeliculas.get(i).equals(numero)){
                        System.out.println("Ya buscaste esa pelicula");
                        System.out.println("Ingrese otra pelicula: ");
                        numero = scanner.nextLine();
                    }
                }
                numeroPeliculas.add(numero);

                if(numero.equalsIgnoreCase("salir")){
                    break;
                }
        
                String direccion = "https://swapi.py4e.com/api/films/"+numero+"/";
        
                //cliente
                HttpClient cliente = HttpClient.newHttpClient();
        
                //request
        
                HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
        
                //response
                HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                DTO dto = gson.fromJson(json, DTO.class);
                StarWars starWars = new StarWars(dto);
                System.out.println(starWars);

                peliculas.add(starWars);

            }catch(NumberFormatException e){
                System.out.println("No se encontro la pelicula");
            }catch(NullPointerException e){
                System.out.println("No ingresaste nada");
            }
        FileWriter file = new FileWriter("peliculas.json");
        file.write(gson.toJson(peliculas));
        file.close();
    
        }
        scanner.close();
          
        
    }
}
