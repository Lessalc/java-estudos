package estruturadados.projetono;

public class MainNo {

    public static void main(String[] args) {

        // NOÇÕES SOBRE ENCADEAMENTO DE NÓS

        //Criando objetos tipo NO
        No<String> no1 = new No<>("Conteudo No1");
        No<String> no2 = new No<>("Conteudo No2");
        // Definindo o atributo ProximoNo como o nó criado em seguida
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo No3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo No4");
        no3.setProximoNo(no4);

        No<Integer> no5 = new No<>(5);
        System.out.println(no5.getConteudo());

        // no1-> no2-> no3-> no4-> null
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println("-----------------");
        // Acessando outro Nó a partir de um nó
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
