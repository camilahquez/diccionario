package com.diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    private HashMap< String,String> palabras;
    public Diccionario() {
        this.palabras = new HashMap<>();
    }

    public HashMap<String, String> getPalabras(Object o) {
        return palabras;
    }

   public String getTraduccionAlIngles(String clave) {
        return palabras.get(clave);
    }

    public void setPalabras(HashMap<String, String> palabras) {
        this.palabras = palabras;

    }
    public void agregarPalabra(String español, String ingles) {
        palabras.put(español, ingles);
    }
    public ArrayList<String> seleccionarPalabras() {
        Random random = new Random();
        ArrayList<String> seleccion = new ArrayList<>(palabras.keySet());
        ArrayList<String> palabrasAleatorias = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int indice = random.nextInt(seleccion.size());
            String aleatroria = seleccion.get(indice);
            palabrasAleatorias.add(aleatroria);
            seleccion.remove(indice);


        }
        return palabrasAleatorias;

    }


}
