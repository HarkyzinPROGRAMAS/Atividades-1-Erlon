public class Questao10 {
    public static void main(String[] args){
        double saldo = 500.50;
        double deposito = 300.25;
        double saque = 150.75;
        double fezDepo = saldo + deposito;
        double fezSaq = fezDepo - saque;
        System.out.println("O saldo é de: " + fezSaq);
    }
}
