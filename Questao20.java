import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args){
        Scanner verificador = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora?: ");
        float ganhaHora = verificador.nextInt();
        System.out.println("Quantas horas trabalhadas por mês?: ");
        float horaMes = verificador.nextInt();
        float salarioBruto = ganhaHora * horaMes;
        float descontoRenda = salarioBruto * (11f/100f);
        float descontoINSS = salarioBruto * (8f/100f);
        float descontoSindicato = salarioBruto * (5f/100f);
        float descontoTotalParc = descontoRenda + descontoINSS + descontoSindicato;
        float descontoTotal = salarioBruto - descontoTotalParc;
        System.out.println("O seu salário bruto é: " + salarioBruto + "\nDescontos;" + "\nImposto de Renda: " + descontoRenda + "\nINSS: " + descontoINSS + "\nSindicato: " + descontoSindicato + "\nSalário Líquido: " + descontoTotal);

    }
}
