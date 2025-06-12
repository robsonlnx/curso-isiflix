import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, diferanca;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        diferanca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferanca);

        teclado.close();
    }
}
