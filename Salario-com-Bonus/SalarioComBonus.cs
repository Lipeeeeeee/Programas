using System;

public class SalarioComBonus{
    public static void Main(){
        string nome = Console.ReadLine();
        double salario = double.Parse(Console.ReadLine());
        double vendas = double.Parse(Console.ReadLine());
        Console.WriteLine($"TOTAL = R$ {salario + vendas * 0.15:0.00}");
    }
}