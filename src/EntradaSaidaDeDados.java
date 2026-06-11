import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

        //        System.out.print("Óla eu faço impressao na mesma linha");
//        System.out.println("Óla eu faço impressao e pulo a linha");
//        System.out.printf("Óla eu faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Óla, digite seu nome: ");

        String nome = scanner.next();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite se você estiver empregado sim(true) ou não(false)");
        boolean empregado = scanner.nextBoolean();

        System.out.println("Óla, sou " + nome + " tenho " + idade + " anos, e" + " estou empregado " +  empregado);

    }
}
