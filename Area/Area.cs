using System;
using System.Linq;

public class Area{
    public static void Main(){
        double[] valores = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
        Console.WriteLine($"TRIANGULO: {valores[0] * valores[2] / 2:0.000}\nCIRCULO: {3.14159 * Math.Pow(valores[2], 2):0.000}\nTRAPEZIO: {(valores[0] + valores[1]) * valores[2] / 2:0.000}\nQUADRADO: {Math.Pow(valores[1], 2):0.000}\nRETANGULO: {valores[0] * valores[1]:0.000}");
    }
}