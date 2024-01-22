using System;

public class Diferenca{
    public static void Main(){
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());
        int c = int.Parse(Console.ReadLine());
        int d = int.Parse(Console.ReadLine());
        Console.WriteLine($"DIFERENCA = {a * b - c * d}");
    }
}