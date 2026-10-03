package questao16Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Ana", "Carla", "Bruno", "Diego");
        List<String> semRepetir = new ArrayList<>(new LinkedHashSet<>(nomes));

        System.out.println(semRepetir);

    }
}
