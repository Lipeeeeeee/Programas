import java.util.Scanner;

public class ProdutoSimples{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("PROD = " + (x * y));
    }
}