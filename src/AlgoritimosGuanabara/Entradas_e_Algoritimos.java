package AlgoritimosGuanabara;

import java.util.Locale;
import java.util.Scanner;

public class Entradas_e_Algoritimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        scanner.useLocale(Locale.US);

        double  N1 = scanner.nextDouble();
        System.out.println("Primeiro numero é = " + N1);

        System.out.println("Digite outro numero: ");

        double  N2 = scanner.nextDouble();
        System.out.println("Segundo numero é = " + N2);

        double A = Math.sin(N1) * Math.cos(N2);

        System.out.println("Digite um angulo: ");
        double Angulo = scanner.nextDouble();
        double Seno = Math.sin(Math.toRadians(Angulo));
        System.out.println("O seno de " + Angulo + " é igual à " + Seno);





    }


}
