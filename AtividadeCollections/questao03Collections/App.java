package AtividadeCollections.questao03Collections;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> alimentos = new ArrayList<>();


        alimentos.add("Banana");
        alimentos.add("Maçã");
        alimentos.add("Laranja");
        alimentos.add("Abacaxi");



        int indice = alimentos.indexOf("Banana");


        if(indice == 0){
            System.out.println("Banana encontrada no indice: " + indice );
        }
        else{
            System.out.println("Banana não encontrada");
        }


        int indice2 = alimentos.indexOf("Uva");
        
        if(indice2 != -1){
            System.out.println("Uva encontrada no indice: " + indice);
        }
        else{
            System.out.println("Uva não encontrada");
        }
    }
}
