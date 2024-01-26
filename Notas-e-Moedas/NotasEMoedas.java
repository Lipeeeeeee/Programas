import java.util.Scanner;

public class NotasEMoedas{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String[] valores = n.split("\\.");
        int nota = Integer.parseInt(valores[0]);
        int moeda = Integer.parseInt(valores[1]);
        System.out.println("NOTAS:\n" + (nota / 100) + " nota(s) de R$ 100.00\n" + (nota % 100 / 50) + " nota(s) de R$ 50.00\n" + (nota % 100 % 50 / 20) + " nota(s) de R$ 20.00\n" + (nota % 100 % 50 % 20 / 10) + " nota(s) de R$ 10.00\n" + (nota % 100 % 50 % 20 % 10 / 5) + " nota(s) de R$ 5.00\n" + (nota % 100 % 50 % 20 % 10 % 5 / 2) + " nota(s) de R$ 2.00\nMOEDAS:\n" + (nota % 100 % 50 % 20 % 10 % 5 % 2) + " moeda(s) de R$ 1.00\n" + (moeda / 50) + " moeda(s) de R$ 0.50\n" + (moeda % 50 / 25) + " moeda(s) de R$ 0.25\n" + (moeda % 50 % 25 / 10) + " moeda(s) de R$ 0.10\n" + (moeda % 50 % 25 % 10 / 5) + " moeda(s) de R$ 0.05\n" + (moeda % 50 % 25 % 10 % 5) + " moeda(s) de R$ 0.01");
    }
}