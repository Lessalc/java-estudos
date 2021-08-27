package desafiosbootcamp;

import java.util.Scanner;

public class StringConcat {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());
        for (int i = 0; i < N; i++) {
            StringBuilder analise = new StringBuilder();
            String plr = leitor.nextLine();
            String[] palavras = plr.split(" ");
//            String[] palavras = {"aA", "Bb"};
            String palavraMenor, palavraMaior;
            if (palavras[0].length() > palavras[1].length()) {
                palavraMenor = palavras[1];
                palavraMaior = palavras[0];
            } else {
                palavraMenor = palavras[0];
                palavraMaior = palavras[1];
            }
            for (int j = 0; j < palavraMenor.length(); j++) {
                analise.append(palavras[0].charAt(j));
                analise.append(palavras[1].charAt(j));
            }
            analise.append(palavraMaior.substring(palavraMenor.length(), palavraMaior.length()));
            System.out.println(analise.toString());
        }
    }
}
