package LogicaDeProgramacao_Javanalta;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 2.00;
        int totalDias = 7;

        double valorTotal = pao + queijo + acucar;

        System.out.println("Valor total = R$ " + valorTotal);

        double valorComDesconto = valorTotal - desconto;
        System.out.println("Valor desconto = R$ " + valorComDesconto);

        double valorMensalDaPadaria = valorTotal * totalDias;

        System.out.println("Valor mensal = R$ " + valorMensalDaPadaria);

    }
}
