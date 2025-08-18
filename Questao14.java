import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args){
        Scanner verificador = new Scanner(System.in);
        System.out.println("Diga um número: ");
        int numero = verificador.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número é par!");

        }
        else{
            System.out.println("O número é ímpar!");
        }
    }
}
