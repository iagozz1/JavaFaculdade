package questao10Collections;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet <Integer> numeros = new TreeSet<>();


        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);
        numeros.add(30);


        System.out.println(numeros);

        System.out.println("Menor: " + numeros.first());
        System.out.println("Maior: " + numeros.last());
}}
