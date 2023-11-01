import com.diccionario.Diccionario;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();

        diccionario.agregarPalabra("manzana", "apple");
        diccionario.agregarPalabra("carro", "car");
        diccionario.agregarPalabra("perro", "dog");
        diccionario.agregarPalabra("gato", "cat");
        diccionario.agregarPalabra("libro", "book");
        diccionario.agregarPalabra("casa", "house");
        diccionario.agregarPalabra("árbol", "tree");
        diccionario.agregarPalabra("computadora", "computer");
        diccionario.agregarPalabra("sol", "sun");
        diccionario.agregarPalabra("luna", "moon");
        diccionario.agregarPalabra("flor", "flower");
        diccionario.agregarPalabra("agua", "water");
        diccionario.agregarPalabra("pluma", "pen");
        diccionario.agregarPalabra("amigo", "friend");
        diccionario.agregarPalabra("familia", "family");
        diccionario.agregarPalabra("música", "music");
        diccionario.agregarPalabra("playa", "beach");
        diccionario.agregarPalabra("ciudad", "city");
        diccionario.agregarPalabra("montaña", "mountain");
        diccionario.agregarPalabra("guitarra", "guitar");
        diccionario.agregarPalabra("feliz", "happy");
        Scanner entradas = new Scanner(System.in);
        System.out.println("escribe las siguentes palabas en ingles:");
       ArrayList<String> aleatorias =  diccionario.seleccionarPalabras();
       ArrayList<String> valorAleatorias = new ArrayList<>();
        for (int i = 0; i < aleatorias.size(); i++) {

            System.out.println(aleatorias.get(i));
            String clave = aleatorias.get(i);
            valorAleatorias.add(diccionario.getTraduccionAlIngles(clave));

        }



        for (int i = 0; i <valorAleatorias.size() ; i++) {
            String respuesta = entradas.nextLine();

            if (respuesta.toLowerCase().equals(valorAleatorias.get(i))) {
                System.out.println("tu respuesta es correcta " + aleatorias.get(i) + ": " + valorAleatorias.get(i) );
            }else {
                System.out.println("tu respuesta es incorrecta " + aleatorias.get(i) + ": " + valorAleatorias.get(i) );
            }
        }
















    }
}