package beck.end;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double paoFrances = 1.0;
        double rosquinha = 5.0;
        double presunto = 3.50;
        double queijo = 4.0;
        int opcao;
        double carrinho = 0;



        while (true){

        System.out.println("=========================================");
        System.out.println("==========| Menu Padaria 1.0  |==========");
        System.out.println("==========| Itens disponiveis |==========");
        System.out.println("==========|                   |==========");
        System.out.println("==========| 1. Pão Francês    |==========");
        System.out.println("==========| 2. Rosquinha      |==========");
        System.out.println("==========| 3. Presunto       |==========");
        System.out.println("==========| 4. Queijo         |==========");
        System.out.println("==========| 0. Terminar       |==========");
        System.out.println("==========|                   |==========");
        System.out.println("=========================================");
        System.out.println();

            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Pão frances adicionado ao carrinho!");
                    System.out.println("+ 1R$");
                    carrinho = (carrinho + paoFrances);
                    System.out.println();

                    break;

                case 2:
                    System.out.println("Rosquinha adicionado ao carrinho!");
                    System.out.println("+ 5R$");
                    carrinho = (carrinho + rosquinha);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Presunto (100g) adicionado ao carrinho!");
                    System.out.println("+ 3.50R$");
                    carrinho = (carrinho + presunto);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Queijo (100g) adicionado ao carrinho!");
                    System.out.println("+ 4R$");
                    carrinho = (carrinho + queijo);
                    System.out.println();
                    break;

                case 0:
                    if (carrinho > 0){
                    System.out.println("O valor total foi de: " + carrinho + "R$, Qual sera o metodo de pagamento?");
                    System.out.println("1. Credito");
                    System.out.println("2. Debito");
                    int pagamento = sc.nextInt();

                    if (pagamento == 1){
                        double percentual = 10.0 / 100;
                       double valorDesconto = carrinho - (percentual * carrinho);
                        System.out.println("O valor foi de: " + valorDesconto + "R$ Obrigado pela compra!");
                        System.out.println();
                    }
                    if (pagamento == 2){
                        System.out.println("O valor foi de: " + carrinho + "R$ Obrigado pela compra!");
                        System.out.println();
                    }
                    else {
                        System.out.println("Digite uma opçao válida");
                        System.out.println();
                        break;
                    }


                    return;
                 }
                    else {
                        System.out.println("Seu carrinho esta vazio!");
                        System.out.println();
                        break;
                    }


                default:
                    System.out.println("A opçao " + opcao + " não é valida!");
                    System.out.println();
            }

            }
        }
    }