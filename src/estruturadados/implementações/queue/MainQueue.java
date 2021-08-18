package estruturadados.implementações.queue;

import estruturadados.implementações.equalshashcode.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        // Tenta adicionar, se der erro retorna Falso. Já o add retorna um erro
        System.out.println(queueCarros.offer(new Carro("Renault")));

        // Peek não remove
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        // Poll remove
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

    }
}
