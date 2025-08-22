import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora simples");

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextInt();
        
        System.out.println("Digite o segundo numero: ");
         double num2 = sc.nextInt();

         System.out.println("Digite a operação: (+, -, *, /)");
         String operacao = sc.next();

         double resultado = 0 ;

         switch (operacao){
            case "+": 
            System.out.println("Voce escolheu a opçao: " + operacao);
            resultado = num1 + num2;
            System.out.println("O resultado é: " + resultado);
            break;

            case "-":
            System.out.println("Voce escolheu a opçao: " + operacao);
            resultado = num1 - num2;
            System.out.println("O resultado é: " + resultado);
            break;

             case "*":
            System.out.println("Voce escolheu a opçao: " + operacao);
            resultado = num1 * num2;
            System.out.println("O resultado é: " + resultado);
            break;

             case "/":
            System.out.println("Voce escolheu a opçao: " + operacao);
            resultado = num1 / num2;

            if (num2 == 0 ) {
                System.out.println("Erro: Divisão por zero");

            }
            else {
                  System.out.println("O resultado é: " + resultado); 
                   break;
            }
          sc.close();
          
         }
    }
}