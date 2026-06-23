package AlgoritimosGuanabara;

import java.util.Scanner;

public class OperadoresLogicosRacionais {
    public static void main(String[] args) {

        int a = 2, b = 5 ,c = 3;

        double resultado = Math.pow(a , b);

        System.out.println(resultado == c);

        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um numero: ");

        System.out.println("Digite o primeiro lado: ");
        int L1 = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        int L2 = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int L3 = sc.nextInt();

        boolean EQ = (L1 == L2) && (L2 == L3);
        boolean ES = (L1 != L2) && (L1 != L3) && (L2 != L3);
        boolean TRI = (L1 < L2 + L3) && (L2 < L1 + L3) && (L3 < L1 + L2);


        System.out.println("O triangulo é equilatero? " + EQ);
        System.out.println("O triangulo é esquilatero? " + ES);
        System.out.println("Pode ser um triangulo? " + TRI);



    }
}
