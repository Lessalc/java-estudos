package collections.list;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Olimpiadas {

    // Inspirados pela Olimpiada vamos criar algumas funções e manipular listas
    static List<Double> notasSkate(List<Double> notasTotais, int notasRetiradas){
        int n = 1;
        while(n<=notasRetiradas){
            double menorNota = Collections.min(notasTotais);
            notasTotais.remove(menorNota);
            n++;
        }
        return notasTotais;
    }

    static List<Double> pontuacaoAcima(List<Double> pontuacoes, int minValor){
        pontuacoes.removeIf(pontuacao -> pontuacao < minValor);
        return pontuacoes;
    }

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(3.45);
        notas.add(2.85);
        notas.add(4.50);
        notas.add(0.0);
        notas.add(1.45);
        notas.add(4.25);

        System.out.println("Notas da Competição: "+notas);
        List<Double> notasClassificacao = notasSkate(notas, 3);
        System.out.println("Notas de Classificação"+notasClassificacao);

        // Calculando média
        Iterator<Double> iterator = notasClassificacao.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Pontuação acumulada: "+soma);
        System.out.printf("Média :%4.2f%n",soma/notasClassificacao.size());

        /*Três atletas realizam 5 provas, na qual apenas notas acima de 1 valor são contabilizadas e o total é
        * somado para ser a nota final. Nota 0-10, corte 5 */
        List<Double> atleta01 = Stream.of(5d, 8.5, 7d, 9d, 4d).collect(Collectors.toList());
        List<Double> atleta02 = Stream.of(3d, 7d, 6d, 6d, 8d).collect(Collectors.toList());
        List<Double> atleta03 = Stream.of(4.8, 10d, 8d, 9d, 4d).collect(Collectors.toList());
        List<Double> atleta01NotasValidas = pontuacaoAcima(atleta01, 5);
        List<Double> atleta02NotasValidas = pontuacaoAcima(atleta02, 5);
        List<Double> atleta03NotasValidas = pontuacaoAcima(atleta03, 5);

        System.out.println("Nota Final Atleta01: "+atleta01NotasValidas.stream().reduce(0d, Double::sum));
        System.out.println("Nota Final Atleta02: "+atleta02NotasValidas.stream().reduce(0d, Double::sum));
        System.out.println("Nota Final Atleta03: "+atleta03NotasValidas.stream().reduce(0d, Double::sum));


    }
}
