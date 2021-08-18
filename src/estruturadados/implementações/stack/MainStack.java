package estruturadados.implementações.stack;

import estruturadados.implementações.equalshashcode.Carro;

import java.util.Stack;

public class MainStack {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println("Pilha inicial: "+stackCarros);

        // Tirando o último elemento da pilha
        System.out.println("Carro retirado: "+stackCarros.pop());
        System.out.println("Pilha restante: "+stackCarros);

        // Podemos também exibir sem que seja retirado
        System.out.println("Último carro atual: "+stackCarros.peek());
        System.out.println("Pilha restante: "+stackCarros);

        System.out.println("A pilha está vazia? "+stackCarros.empty());
    }
}
