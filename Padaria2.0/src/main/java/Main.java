import java.util.Scanner; // Importa a classe Scanner para ler entradas do teclado

public class Main {
    public static void main(String[] args) {

        // Preço de cada produto
        double paoFrances = 1.0;
        double rosquinha = 5.0;
        double presunto = 3.50;
        double queijo = 4.0;

        int opcao; // Guarda a escolha do usuário
        double carrinho = 0; // Total da compra

        // Percentuais de desconto
        double percentual = 10.0 / 100;     // 10%
        double percentual100 = 5.0 / 100;   // 5% adicional se compra >= 100R$

        // Cria o scanner uma única vez para evitar vazamento de recursos
        Scanner sc = new Scanner(System.in);

        // Início do loop principal
        while (true) {

            // Mostra o menu de compras
            System.out.println("================================================");
            System.out.println("==========|     Menu Padaria 1.0     |==========");
            System.out.println("==========|     Itens disponiveis    |==========");
            System.out.println("==========|                          |==========");
            System.out.println("==========| 1. Pão Francês | 1R$     |==========");
            System.out.println("==========| 2. Rosquinha   | 5R$     |==========");
            System.out.println("==========| 3. Presunto    | 3.50R$  |==========");
            System.out.println("==========| 4. Queijo      | 4R$     |==========");
            System.out.println("==========| 0. Terminar              |==========");
            System.out.println("==========|                          |==========");
            System.out.println("================================================");
            System.out.println();

            // Lê a opção do usuário
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("==========================================");
                    System.out.println("Quantos pães deseja comprar?");
                    int qtd = sc.nextInt();
                    System.out.println("Pão frances adicionado ao carrinho!");
                    System.out.println("+ 1R$");
                    carrinho += paoFrances * qtd; // Atualiza o total
                    System.out.println("==========================================");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("==========================================");
                    System.out.println("Quantas rosquinhas deseja comprar?");
                    int qtdR = sc.nextInt();
                    System.out.println("Rosquinha adicionado ao carrinho!");
                    System.out.println("+ 5R$");
                    carrinho += rosquinha * qtdR;
                    System.out.println("==========================================");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("==========================================");
                    System.out.println("Quantos presuntos deseja comprar?");
                    int qtdP = sc.nextInt();
                    System.out.println("Presunto (100g) adicionado ao carrinho!");
                    System.out.println("+ 3.50R$");
                    carrinho += presunto * qtdP;
                    System.out.println("==========================================");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("==========================================");
                    System.out.println("Quantos queijos deseja comprar?");
                    int qtdQ = sc.nextInt();
                    System.out.println("Queijo (100g) adicionado ao carrinho!");
                    System.out.println("+ 4R$");
                    carrinho += queijo * qtdQ;
                    System.out.println("==========================================");
                    System.out.println();
                    break;

                case 0:
                    // Finaliza a compra se o carrinho não estiver vazio
                    if (carrinho > 0) {
                        System.out.println("=========================================================================");
                        System.out.println("O valor total foi de: " + carrinho + "R$ Qual sera o metodo de pagamento?");
                        System.out.println("1. Credito");
                        System.out.println("2. Debito");
                        System.out.println("=========================================================================");

                        int pagamento = sc.nextInt();

                        // Opção: Crédito
                        if (pagamento == 1) {
                            if (carrinho >= 100) {
                                // Aplica desconto de 15% (10% + 5%)
                                double valorDesconto = carrinho - ((percentual + percentual100) * carrinho);
                                System.out.println("==============================================================================================");
                                System.out.println("O valor foi de: " + valorDesconto + "R$ e a opção de pagamento foi: Crédito, Obrigado pela compra!");
                                System.out.println("==============================================================================================");
                                System.out.println();
                                return; // Encerra o programa
                            } else {
                                // Apenas 10% de desconto
                                double valorDesconto = carrinho - (percentual * carrinho);
                                System.out.println("==================================================================================================");
                                System.out.println("O valor foi de: " + valorDesconto + "R$ e a opção de pagamento foi: Crédito, Obrigado pela compra!");
                                System.out.println("==================================================================================================");
                                System.out.println();
                                return;
                            }
                        }

                        // Opção: Débito
                        if (pagamento == 2) {
                            if (carrinho >= 100) {
                                // 5% de desconto
                                double valorDesconto = carrinho - (percentual100 * carrinho);
                                System.out.println("==================================================================================================");
                                System.out.println("O valor foi de: " + valorDesconto + "R$ e a opção de pagamento foi: Débito, Obrigado pela compra!");
                                System.out.println("==================================================================================================");
                                System.out.println();
                                return;
                            } else {
                                // Sem desconto
                                System.out.println("==================================================================================================");
                                System.out.println("O valor foi de: " + carrinho + "R$ e a opção de pagamento foi: Débito, Obrigado pela compra!");
                                System.out.println("==================================================================================================");
                                System.out.println();
                                return;
                            }
                        }

                        // Caso o usuário digite um número inválido
                        else {
                            System.out.println("Digite uma opção válida");
                            System.out.println();
                            break;
                        }

                    } else {
                        // Carrinho vazio
                        System.out.println("Seu carrinho está vazio!");
                        System.out.println();
                        break;
                    }

                default:
                    // Opção do menu inválida
                    System.out.println("A opção " + opcao + " não é válida!");
                    System.out.println();
            }
            
        }
    }
}
