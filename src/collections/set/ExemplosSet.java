package collections.set;

import java.util.*;

public class ExemplosSet {

    public static void main(String[] args) {

        System.out.println("Mantendo o raciocínio de Listas, vamos ver um Set com algumas notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3 ,5d, 7d, 0d, 3.6));

        System.out.println(notas);
        System.out.println("Ordem aleatória dos elementos e sem elementos repetidos, no caso o 7.0 só entrou uma vez");
        System.out.println("----------------------------------------------------");

        System.out.println("Confira se a nota 5.0 esta no conjunto: "+notas.contains(5.0));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ notas.stream().reduce(Double::max));
        System.out.println("Quantidade de elementos: "+notas.size());
        System.out.printf("Soma das notas: %4.2f%n", notas.stream().reduce(0.0, Double::sum));
        System.out.printf("Media das notas: %4.2f%n", notas.stream().reduce(0.0, Double::sum)/ notas.size());

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0); // Acusa erro por ser elemento igual. Só sera adicionado uma vez
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todos os elementos em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: "+notas.isEmpty());
        System.out.println("Confira se o conjunto está vazio: "+notas2.isEmpty());

    }
}
