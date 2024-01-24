using System;

public class GastoDeCombustivel{
    public static void Main(){
        double tempo = double.Parse(Console.ReadLine());
        double kmh = double.Parse(Console.ReadLine());
        Console.WriteLine($"{tempo * kmh / 12:0.000}");
    }
}