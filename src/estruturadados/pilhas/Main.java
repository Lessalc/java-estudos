package estruturadados.pilhas;

public class Main {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);

        minhaPilha.pop();
        // Retirou o último valor
        System.out.println(minhaPilha);
        // Criamos outro objeto com o valor do nó de topo, sem excluir
        No ultimoNo = minhaPilha.top();
        System.out.println(ultimoNo);

        // Acrescentando um novo Nó e verificando que o último no ainda é 5
        minhaPilha.push(new No(9999));
        System.out.println(minhaPilha);

    }
}
