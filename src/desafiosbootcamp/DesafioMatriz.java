package desafiosbootcamp;

import java.io.IOException;
import java.util.Scanner;


public class DesafioMatriz {
    /*
        1º Desafio para calculo de valores acima ou abaixo de um diagonal
        Fiz para teste com dimensões menores.
     */

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[4][4];
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                if (i+j<4) soma += M[i][j];
            }
        }

        System.out.println(M.length);
        if (O == 'M') soma /= ((M.length * M.length) - 4) / 2; // 66
        System.out.println(String.format("%.1f", soma));
    }


}
