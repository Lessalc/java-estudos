package collections.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        System.out.println("Criando uma lista e adicionando 5 notas: ");
        List<Double> notas = new ArrayList<>();
        for(int i=0; i<5; i++){
            System.out.println("Entre com o "+(i+1)+"º valor:");
            Scanner scanner = new Scanner(System.in);
            notas.add(scanner.nextDouble());
        }
        System.out.println(notas);

        // Algumas operações
        System.out.println("Exiba a posição da nota 5.0: "+notas.indexOf(5.0));
        System.out.println("Adicione na Lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está na lista: "+notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        // Iterando sobre uma lista
        Iterator<Double> iterator =  notas.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double novoValor = iterator.next();
            soma += novoValor;
        }
        System.out.println("Exiba a soma das notas: "+soma);
        System.out.println("Exiba a média das notas: "+(soma/notas.size()));

    }
}
