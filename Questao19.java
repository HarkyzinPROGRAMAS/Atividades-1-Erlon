import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args){
        Scanner verificador = new Scanner(System.in);
        System.out.print("Diga um número: ");
        float numero1 = verificador.nextInt();
        System.out.print("Diga um  Segundo número: ");
        float numero2 = verificador.nextInt();
        System.out.print("Diga um Terceiro número: ");
        float numero3 = verificador.nextInt();
        System.out.print("Diga um Quarto número: ");
        float numero4 = verificador.nextInt();
        float mediaProv = numero1 + numero2 + numero3 + numero4;
        float mediaTot = mediaProv / 4;
        System.out.println("A média é: " + mediaTot);




    }
}