using System;
using System.Linq;

public class OndeEstaOMarmore{
    public static void Main(){
        int[] nq = Console.ReadLine().Split().Select(int.Parse).ToArray();
        int casos = 1;
        while(nq[0] != 0 && nq[1] != 0){
            int[] pecas = new int[nq[0]];
            for(int i = 0; i < nq[0]; ++i) pecas[i] = int.Parse(Console.ReadLine());
            Array.Sort(pecas);
            int[] consultas = new int[nq[1]];
            for(int i = 0; i < nq[1]; ++i) consultas[i] = int.Parse(Console.ReadLine());
            Console.WriteLine($"CASE# {casos++}:");
            for(int i = 0; i < nq[1]; ++i){
                for(int j = 0; j < nq[0]; ++j){
                    if(pecas[j] == consultas[i]){
                        Console.WriteLine($"{consultas[i]} found at {j + 1}");
                        break;
                    }
                    else if(j == nq[0] - 1 && pecas[j] != consultas[i]) Console.WriteLine($"{consultas[i]} not found");
                }
            }
            int[] newnq = Console.ReadLine().Split().Select(int.Parse).ToArray();
            nq[0] = newnq[0];
            nq[1] = newnq[1];
        }
    }
}