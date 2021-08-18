package estruturadados.implementações.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        System.out.println(listaAlunos);
        System.out.println(listaAlunos.size());


        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Carlos");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.8");
        aluno2.put("Turma", "3a");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println("Verificando se há uma determinada chave 'Nome' em aluno: "+aluno.containsKey("Nome"));

    }
}
