using System;
using System.Linq;

public class NotasEMoedas{
    public static void Main(){
        int[] n = Console.ReadLine().Split('.').Select(int.Parse).ToArray();
        Console.WriteLine($"NOTAS:\n{n[0] / 100} nota(s) de R$ 100.00\n{n[0] % 100 / 50} nota(s) de R$ 50.00\n{n[0] % 100 % 50 / 20} nota(s) de R$ 20.00\n{n[0] % 100 % 50 % 20 / 10} nota(s) de R$ 10.00\n{n[0] % 100 % 50 % 20 % 10 / 5} nota(s) de R$ 5.00\n{n[0] % 100 % 50 % 20 % 10 % 5 / 2} nota(s) de R$ 2.00\nMOEDAS:\n{n[0] % 100 % 50 % 20 % 10 % 5 % 2} moeda(s) de R$ 1.00\n{n[1] / 50} moeda(s) de R$ 0.50\n{n[1] % 50 / 25} moeda(s) de R$ 0.25\n{n[1] % 50 % 25 / 10} moeda(s) de R$ 0.10\n{n[1] % 50 % 25 % 10 / 5} moeda(s) de R$ 0.05\n{n[1] % 50 % 25 % 10 % 5} moeda(s) de R$ 0.01");
    }
}