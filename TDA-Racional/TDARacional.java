import java.util.Scanner;

public class TDARacional{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; ++i){
            String operacao = in.nextLine();
            String[] valores = operacao.split(" ");
            int N1 = Integer.parseInt(valores[0]);
            int D1 = Integer.parseInt(valores[2]);
            int N2 = Integer.parseInt(valores[4]);
            int D2 = Integer.parseInt(valores[6]);
            if(valores[3].equals("+")){
                N1 = N1 * D2 + N2 * D1;
                D1 *= D2;
            }
            else if(valores[3].equals("-")){
                N1 = N1 * D2 - N2 * D1;
                D1 *= D2;
            }
            else if(valores[3].equals("*")){
                N1 *= N2;
                D1 *= D2;
            }
            else{
                N1 *= D2;
                D1 *= N2;
            }
            System.out.print(N1 + "/" + D1 + " = ");
            int menor = N1 <= D1 ? N1 : D1;
            for(int j = 2; j <= Math.abs(menor); ++j){
                while(N1 % j == 0 && D1 % j == 0){
                    N1 /= j;
                    D1 /= j;
                }
                menor = N1 <= D1 ? N1 : D1;
            }
            System.out.println(N1 + "/" + D1);
        }
    }
}