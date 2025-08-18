import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args){
        Scanner verifica = new Scanner(System.in);
        System.out.println("Diga um número: ");
        int numero = verifica.nextInt();
        if (numero > 0 && numero < 10) {
            System.out.println("O número está entre 0 e 10!");
        }
        else {
            System.out.print("Não está entre 0 e 10!");
        }
    }
}
