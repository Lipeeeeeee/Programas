import java.util.Scanner;

public class OMaior{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String valores = in.nextLine();
        String[] numeros = valores.split(" ");
        int MaiorAB = (Integer.parseInt(numeros[0]) + Integer.parseInt(numeros[1]) + Math.abs(Integer.parseInt(numeros[0]) - Integer.parseInt(numeros[1]))) / 2;
        System.out.println(((MaiorAB + Integer.parseInt(numeros[2]) + Math.abs(MaiorAB - Integer.parseInt(numeros[2]))) / 2) + " eh o maior");
    }
}