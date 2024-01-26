import java.util.Scanner;

public class IdadeEmDias{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n / 365 + " ano(s)\n" + n % 365 / 30 + " mes(es)\n" + n % 365 % 30 + " dia(s)");
    }
}