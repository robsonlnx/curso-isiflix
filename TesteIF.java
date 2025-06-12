import java.util.Scanner;

public class TesteIF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1, n2, media;
        System.out.println("Digite a N1: ");
        n1 = teclado.nextDouble();
        System.out.println("Digite a N2: ");
        n2 = teclado.nextDouble();
        media = (n1 + n2) / 2;

        System.out.println("Sua média vale " + media);

        if (n1 >= 5.0 && media >= 6.0){
            System.out.println("Parabéns!! Aprovado");
        }
        else{
            System.out.println("Que pena!! Reprovado");
        }

        teclado.close();
    }
}
