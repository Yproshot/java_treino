package AlgoritimosGuanabara;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Em que ano estamos?");
//        int ano  = sc.nextInt();
//
//        System.out.println("Em que ano voce nasceu?");
//        int anonc = sc.nextInt();
//
//        int idade = ano - anonc;
//
//        System.out.println("em " + ano + " voce tera " + idade + " anos.");
//
//        if( idade >= 18){
//            System.out.println("Voce antingiu a maioridade.");
//        }else{
//            System.out.println("Voce ainda não tem maioridade.");
//        }

        System.out.println("digite um numero: ");
        int N = sc.nextInt();

        if(N % 2 == 0){
            System.out.println("O numero é par!");
        }else{
            System.out.println("O numero é impar!");
        }
    }
}
