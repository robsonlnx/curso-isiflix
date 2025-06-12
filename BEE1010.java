import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cod1, cod2, numPeca1, numPeca2;
        double valorPeca1, valorPeca2, resultado;
        cod1 = teclado.nextInt();
        numPeca1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();
        cod2 = teclado.nextInt();
        numPeca2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();
        resultado = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);

        teclado.close();
    }
}
