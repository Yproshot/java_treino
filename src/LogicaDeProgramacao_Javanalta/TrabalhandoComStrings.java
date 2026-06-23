package LogicaDeProgramacao_Javanalta;

public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Maicon";
        String nome2 = "Joao";

        int tamanho = nome.length();
        boolean saoIguais = nome.equals(nome2);

        System.out.println("Óla " + nome.toLowerCase() + " seu nome tem " + tamanho + " caracteres.");
        System.out.println("Os nomes são iguais: " + saoIguais);


    }
}
