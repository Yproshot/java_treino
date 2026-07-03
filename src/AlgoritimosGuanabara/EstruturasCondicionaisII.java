package AlgoritimosGuanabara;

import java.util.Scanner;

public class EstruturasCondicionaisII {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("----- FAÇA SUA DOAÇÃO -----");
        System.out.println("---------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite [ 1 ] para doar R$ 10,00");
        System.out.println("Digite [ 2 ] para doar R$ 25,00");
        System.out.println("Digite [ 3 ] para doar R$ 50,00");
        System.out.println("Digite [ 4 ] para doar outro valor.");
        System.out.println("Digite [ 9 ] para cancelar.");

        int valor = sc.nextInt();


        switch (valor){
            case 1:
                System.out.println("---------------------------");
                System.out.println("Obrigado pela doação de R$ 10,00");
                System.out.println("---------------------------");
                break;
            case 2:
                System.out.println("---------------------------");
                System.out.println("Obrigado pela doação de R$ 25,00");
                System.out.println("---------------------------");
                break;
            case 3:
                System.out.println("---------------------------");
                System.out.println("Obrigado pela doação de R$ 50,00");
                System.out.println("---------------------------");
                break;
            case 4:
                System.out.println("digite o valor que deseja doar: R$ ");
                int valorDoacao = sc.nextInt();

                System.out.println("---------------------------");
                System.out.println("Obrigado pela doação de R$ " +  valorDoacao);
                System.out.println("---------------------------");
                break;

            case 9:
                System.out.println("---------------------------");
                System.out.println("---- Doação cancelada. ----");
                System.out.println("---------------------------");
                break;

                default:
                    System.out.println("---------------------------");
                    System.out.println("---- Comando invalido -----");
                    System.out.println("---------------------------");


        }
    }
}
