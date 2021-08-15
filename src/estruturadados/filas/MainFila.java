package estruturadados.filas;

public class MainFila {

    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();
        Fila<Integer> minhaFilaInteger = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        minhaFilaInteger.enqueue(1);
        minhaFilaInteger.enqueue(2);
        minhaFilaInteger.enqueue(3);
        minhaFilaInteger.enqueue(4);

        System.out.println(minhaFila);
        System.out.println(minhaFilaInteger);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFilaInteger.dequeue());

        System.out.println(minhaFila);
        System.out.println(minhaFilaInteger);

        minhaFila.enqueue("ultimo");
        minhaFilaInteger.enqueue(999999);

        System.out.println(minhaFila);
        System.out.println(minhaFilaInteger);

        System.out.println(minhaFila.first());
        System.out.println(minhaFilaInteger.first());

        System.out.println(minhaFila);
        System.out.println(minhaFilaInteger);
    }
}
