package questao14Collections;

import java.util.HashMap;
import java.util.Map;

import questao06Collections.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana", 20, "222-222-222.22");
        Pessoa bruno = new Pessoa("Bruno", 21, "111-111-111.11");
        Pessoa carla = new Pessoa("Carla", 34, "333-333-333.33");

        HashMap<String, Pessoa> apoio = new HashMap<>();

        apoio.put(bruno.getCpf(), bruno);
        apoio.put(ana.getCpf(), ana);
        apoio.put(carla.getCpf(), carla);



        System.out.println(apoio);


        System.out.println("Busca pelo CPF: " + apoio.get("222-222-222.22"));

        Pessoa bruna = new Pessoa("Bruna", 23, "222-222-222.22");

        Pessoa antes = apoio.put(bruna.getCpf(), bruna);


        System.out.println("Put retornou: " + antes );
        System.out.println("Tamanho do mapa: " + apoio.size());


    }
}
