using System;
using System.Linq;

public class CalculoSimples{
    public static void Main(){
        double[] peca1 = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
        double[] peca2 = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
        Console.WriteLine($"VALOR A PAGAR: R$ {peca1[1] * peca1[2] + peca2[1] * peca2[2]:0.00}");
    }
}