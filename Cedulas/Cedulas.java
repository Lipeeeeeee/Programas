import java.util.Scanner;

public class Cedulas{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a + "\n" + (a / 100) + " nota(s) de R$ 100,00\n" + (a % 100 / 50) + " nota(s) de R$ 50,00\n" + (a % 100 % 50 / 20) + " nota(s) de R$ 20,00\n" + (a % 100 % 50 % 20 / 10) + " nota(s) de R$ 10,00\n" + (a % 100 % 50 % 20 % 10 / 5) + " nota(s) de R$ 5,00\n" + (a % 100 % 50 % 20 % 10 % 5 / 2) + " nota(s) de R$ 2,00\n" + (a % 100 % 50 % 20 % 10 % 5 % 2 / 1) + " nota(s) de R$ 1,00");
    }
}