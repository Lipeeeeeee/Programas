import java.util.Scanner;

public class ConversaoDeTempo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n / 3600 + ":" + n % 3600 / 60 + ":" + n % 3600 % 60);
    }
}