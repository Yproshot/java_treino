package AlgoritimosGuanabara;

import java.util.Scanner;

public class EstruturaDeRepeticaoI {
    public static void main(String[] args) {
//        for (int i = 10; i >= 0 ; i-= 3){
//
//            System.out.println("Contagem:" + i);
//        }

        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o valor deseja contar:");
//        int valor = sc.nextInt();
//        System.out.println("digite quantos numeros deseja pular na contagem:");
//        int salto = sc.nextInt();
//
//        for(int i = 0; i <= valor; i += salto){
//            System.out.println("contagem:" + i);
//        }

        int n = 0, s = 0, max = 0;

        for (int i = 1; i <= 5; i += 1 ){
            System.out.println("digite o " + i + "o. valor: ");
            n = sc.nextInt();
            s = s + n;
            if(n > max){
                max = n;
            }
        }
            System.out.println("A soma de todos os valores foi: " + s);
            System.out.println("O maior numero digitado foi: " + max);




    }
}
