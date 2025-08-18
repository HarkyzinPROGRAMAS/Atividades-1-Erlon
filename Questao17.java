import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args){
        Scanner verificador = new Scanner(System.in);
        System.out.print("Diga um número: ");
        int numero = verificador.nextInt();
        if (numero % 5 == 0){
            System.out.println("O número é múltiplo de 5!");
        }
        else{
            System.out.println("O número não é múltiplo de 5!");
        }


    }
}
