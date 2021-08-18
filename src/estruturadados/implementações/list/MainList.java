package estruturadados.implementações.list;

import estruturadados.implementações.equalshashcode.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros);

        System.out.println("A lista contém a marca de carro Ford? "+listCarros.contains(new Carro("Ford")));

        System.out.println("Conteudo da lista no índice 2: "+listCarros.get(2));

        System.out.println("Qual o índice do Chevrolet? "+listCarros.indexOf(new Carro("Chevrolet")));

        System.out.println(listCarros.remove((2)));
        System.out.println(listCarros);

    }
}
