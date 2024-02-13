import java.util.Scanner;

public class Criptografia{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; ++i){
            StringBuilder texto = new StringBuilder(in.nextLine());
            for(int j = 0; j < texto.length(); ++j){
                if(Character.isLetter(texto.charAt(j))) texto.setCharAt(j, (char)(texto.charAt(j) + 3));
            }
            for(int j = 0; j < texto.length() / 2; ++j){
                char aux = texto.charAt(j);
                texto.setCharAt(j, texto.charAt(texto.length() - 1 - j));
                texto.setCharAt(texto.length() - 1 - j, aux);
            }
            for(int j = texto.length() / 2; j < texto.length(); ++j) texto.setCharAt(j, (char)(texto.charAt(j) - 1));
            System.out.println(texto);
        }
        in.close();
    }
}