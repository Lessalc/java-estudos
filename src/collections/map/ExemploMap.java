package collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {
        System.out.println("Meus filmes favoritos e Notas no IMDB");
        Map<String, Double> filmesImdb = new HashMap<>(){{
            put("Interstellar", 8.6);
            put("The Good, The Bad and The Ugly", 8.8);
            put("Matrix", 8.7);
            put("Rocky", 8.1);
            put("O Auto da Compadecida", 8.6);
        }};

        System.out.println(filmesImdb);
        System.out.println("Subistituindo uma nota. 'O Auto da compadecida' por 8.85");
        filmesImdb.put("O Auto da Compadecida", 8.85);
        System.out.println(filmesImdb);

        System.out.println("Matrix 2 está incluso? "+filmesImdb.containsKey("Matrix 2"));
        System.out.println("Mas o primeiro esta incluso? "+filmesImdb.containsKey("Matrix"));

        System.out.println("Qual a nota de Interstellar? "+filmesImdb.get("Interstellar"));

        System.out.println("Os filmes escolhidos para esta lista foram: ");
        filmesImdb.keySet().forEach(System.out::println);

        System.out.println("Os notas dadas foram: ");
        filmesImdb.values().forEach(System.out::println);

        System.out.println("--------------------------");
        System.out.println("A melhor nota foi: "+ Collections.max(filmesImdb.values()));

        System.out.println("Filme e sua nota");
        filmesImdb.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println("Filme: "+e.getKey()+" ---- Nota: "+e.getValue()));

    }
}
