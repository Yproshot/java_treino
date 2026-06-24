package AlgoritimosGuanabara;

import java.time.LocalDate;
import java.util.Scanner;

public class ExerciciosResolvidosI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Em que ano você nasceu?");
//        int ano = sc.nextInt();
//        int AnoAtual = LocalDate.now().getYear();
//        int idade = AnoAtual - ano;
//
//        System.out.println("Você tem " +  idade + " anos.");


        //conversor moeda
//        System.out.println("Quantos reais eu tenho?");
//        double reais = sc.nextDouble();
//        double CotacaoDolar = 5.20;
//
//        double dolar = reais / CotacaoDolar;
//
//        System.out.println("Eu vou ter " + dolar + " dolares.");


        // conversor temperatura

//        System.out.println("Quantos graus está fazendo aqui?");
//        double F =  sc.nextDouble();
//
//        double C = (int)((F - 32)/1.8);
//
//        System.out.println("No brasil estaria fazendo " + C + "°C.");

        //calculando imposto

//        System.out.println("digite o valor do produto : ");
//        double produto = sc.nextDouble();
//        double imp = (int)((produto * 60)/100);
//        System.out.println("O valor do imposto do produto é de R$ " + imp);

        // calculando emprestimo

        System.out.println("digite o valor que voce quer pegar: ");
        double valor = sc.nextDouble();
        double ValorEmps = valor * 1.2;
        System.out.println("Em quantas parcelas voce quer dividir?");
        int parcelas = sc.nextInt();
        double ValorPcl = ValorEmps / parcelas;
        double juros = ValorEmps - valor;

        System.out.println("O valor do seu emprestimo é de R$ " + ValorEmps + " .");
        System.out.println("ficaram " + parcelas + " de R$ " + ValorPcl +" .");
        System.out.println("com o juros total de R$ " + juros + " .");
    }
}
