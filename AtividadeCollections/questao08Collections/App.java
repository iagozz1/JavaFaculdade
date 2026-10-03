package questao08Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> cidades = new HashSet<>();
        
        cidades.add("Recife");
        cidades.add("Salvador");
        cidades.add("Natal");
        cidades.add("São Luís");
        cidades.add("Fortaleza");
        
        for (String c : cidades) {
            System.out.println("Todas as cidades: " + c);
        }

        Iterator <String> iterator = cidades.iterator();
        
        cidades.removeIf(cidade -> cidade.startsWith("S"));

        System.out.println("Cidades restantes: " + cidades);

    }
}
