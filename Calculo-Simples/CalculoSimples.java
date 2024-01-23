import java.util.Scanner;

public class CalculoSimples{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String peca1 = in.nextLine();
        String peca2 = in.nextLine();
        String[] valores1 = peca1.split(" ");
        String[] valores2 = peca2.split(" ");
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", Integer.parseInt(valores1[1]) * Double.parseDouble(valores1[2]) + Integer.parseInt(valores2[1]) * Double.parseDouble(valores2[2]));
    }
}