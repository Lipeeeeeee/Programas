using System;

public class TDARacional{
    public static void Main(){
        int n = int.Parse(Console.ReadLine());
        for(int i = 0; i < n; ++i){
            string[] operacao = Console.ReadLine().Split(' ');
            int N1 = int.Parse(operacao[0]);
            int D1 = int.Parse(operacao[2]);
            int N2 = int.Parse(operacao[4]);
            int D2 = int.Parse(operacao[6]);
            if(operacao[3] == "+"){
                N1 = N1 * D2 + N2 * D1;
                D1 *= D2;
            }
            else if(operacao[3] == "-"){
                N1 = N1 * D2 - N2 * D1;
                D1 *= D2;
            }
            else if(operacao[3] == "*"){
                N1 *= N2;
                D1 *= D2;
            }
            else{
                N1 *= D2;
                D1 *= N2;
            }
            Console.Write($"{N1}/{D1} = ");
            int menor = N1 <= D1 ? N1 : D1;
            for(int j = 2; j <= Math.Abs(menor); ++j){
                while(N1 % j == 0 && D1 % j == 0){
                    N1 /= j;
                    D1 /= j;
                }
                menor = N1 <= D1 ? N1 : D1;
            }
            Console.WriteLine($"{N1}/{D1}");
        }
    }
}