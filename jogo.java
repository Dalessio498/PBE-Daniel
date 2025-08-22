import java.util.Scanner;
import java.util.Random;

public class jogo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int ad = 0, contador = 0;
        int numero = random.nextInt(100);

        while( numero != ad){
            System.out.println("Digite o numero para adivinhar");
            ad = sc.nextInt();

            if( ad < numero){
                System.out.println("Digite um numero maior");
                contador++;
            }
            else if (ad > numero){
                System.out.println("Digite um numero menor");
                contador++;
            }
            else {
                System.out.println("Pabens voce acertouu! o numero era: " + numero);
                break;
            }
        }
        System.out.println("Tentativas " + contador);
    }
}