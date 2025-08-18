import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args){
        Scanner verificador = new Scanner(System.in);
        System.out.print("Diga um número: ");
        int numero = verificador.nextInt();
        if (numero % 7 == 0){
            System.out.println("O número é múltiplo de 7!");
        }
        else{
            System.out.println("O número não é múltiplo de 7!");
        }


    }
}