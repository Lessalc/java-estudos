package desafiosbootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Uniformes {
//
//    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    static PrintWriter out = new PrintWriter(System.out);
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int linhas = Integer.parseInt(st.nextToken());
//        List<Tshirt> uniformes = new ArrayList<>();
//
//        for (int i = 0; i <= linhas; i++) {
//            var next = br.readline();
//            if(next.equals("0")) {
//                break;
//            }
//            Tshirt uniforme = new Tshirt();
//            uniforme.setOwner(next);
//            var camiseta = br.readline().split(" ");
//            uniforme.setColor(camiseta[0]);
//            uniforme.setSize(camiseta[1]);
//            uniformes.add(uniforme);
//        }
//        Comparator<Tshirt> comparator = Comparator
//                .comparing(Tshirt::getColor).reversed()
//                .thenComparing(Tshirt::getSize).reversed()
//                .thenComparing(Tshirt::getOwner);
//
//        uniformes.stream().sorted(comparator).forEach(System.out::println);
//    }
//
//    private static String read() throws IOException {
//        return in.readLine();
//    }
//
//    private static int toInt(String s) {
//        return Integer.parseInt(s);
//    }
//}
//
//class Tshirt {
//
//    private String size;
//    private String color;
//    private String owner;
//
//    public Tshirt() {
//    }
//
//    public Tshirt(String size, String color, String owner) {
//        this.size = size;
//        this.color = color;
//        this.owner = owner;
//    }
//
//    public String getSize() {
//        return size;
//    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }
//
//    @Override
//    public String toString() {
//        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
//    }
}