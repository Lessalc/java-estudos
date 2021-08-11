package desafiosbootcamp;

import java.io.IOException;
import java.util.Scanner;

public class DesafiosTempoDeAtraso {
    /*
        Desafio para cálculo do tempo de atraso baseado no tempo em que acordou,
        considerando 60min entre acordar e chegar
     */

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case (7) -> System.out.println("Atraso maximo: " + min);
                case (8) -> System.out.println("Atraso maximo: " + (60 + min));
                case (9) -> System.out.println("Atraso maximo: " + (60 * 2 + min));
                default -> System.out.println("Atraso maximo: 0");
            }
        }

    }
}
