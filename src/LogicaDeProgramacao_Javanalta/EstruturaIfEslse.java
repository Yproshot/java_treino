package LogicaDeProgramacao_Javanalta;

public class EstruturaIfEslse {
    public static void main(String[] args) {

//        int idade = 17;
//
//        if (idade >= 18) {
//            System.out.println("você é maior de idade");
//        } else {
//            System.out.println("você é menor de idade");
//        }
//        boolean estaChovendo = true;
//
//        if (!estaChovendo) {
//            System.out.println("vamos sair para passear");
//        }
//        else  {
//            System.out.println("vamos ficar em casa");
//        }

        boolean temDinheiro = true;
        boolean temCartao = true;

//        if (temDinheiro && temCartao) {
//            System.out.println("Pede im ifood e um zé delivery");
//        }
//        else if (temDinheiro || temCartao) {
//            System.out.println("pede ifood");
//        }
//        else {
//            System.out.println("não pede nada");
//        }

        String mensagem = (temDinheiro)?"pede um ifood":"não compra nada";
        System.out.println(mensagem);

        if (temDinheiro) {
            System.out.println("pede um ifood");
        }
        else {
            System.out.println("não compra nada");
        }

    }
}
