package estruturadados.listacirculares;

public class MainListaCircular {

    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        minhaListaCircular.add("C0");
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("C0");
        minhaListaCircular.add("C1");
        minhaListaCircular.add("C2");
        minhaListaCircular.add("C3");

        System.out.println(minhaListaCircular);

        for(int i = 0; i <10; i++){
            System.out.println("Conteúdo índice "+i+" = "+minhaListaCircular.get(i));
        }
    }
}
