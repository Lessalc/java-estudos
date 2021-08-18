package estruturadados.implementações.set;

import estruturadados.implementações.equalshashcode.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeu"));

        // Não segue uma ordem
        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeu"));

        // Implementei o comparable por ordem alfabetica, ignorando Upper e Lower Case
        System.out.println(treeSetCarros);
    }
}
