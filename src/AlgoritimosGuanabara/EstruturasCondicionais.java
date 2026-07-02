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

//        System.out.println("digite um numero: ");
//        int N = sc.nextInt();
//
//        if(N % 2 == 0){
//            System.out.println("O numero é par!");
//        }else{
//            System.out.println("O numero é impar!");
//        }

        System.out.println("Digte a massa em KG:");
        double massa = sc.nextDouble();
        System.out.println("Digite a altura:");
        double altura = sc.nextDouble();

        double imc = massa / (Math.pow(altura, 2));

        System.out.println("IMC: " + String.format("%.2f", imc));

//        if(imc >= 18.5 && 25 >= imc){
//            System.out.println("seu indice de massa corporia está ideal.");
//
//        } else if (imc > 25) {
//            System.out.println("seu indice de massa corporia está acima do normal");
//
//        }
//        else{
//            System.out.println("seu indice de massa corporia está a baixo do normal");
//        }

        String Calculoimc = (imc >= 18.5 && 25 >= imc)?"seu indice de massa corporia está ideal.":
                (imc > 25)?"seu indice de massa corporia está acima do normal":
                        "seu indice de massa corporia está a baixo do normal";
        System.out.println("IMC: " + Calculoimc);
    }



    
}
