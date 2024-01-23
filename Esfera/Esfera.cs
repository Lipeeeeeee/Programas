using System;

public class Esfera{
    public static void Main(){
        double r = double.Parse(Console.ReadLine());
        Console.WriteLine($"VOLUME = {4.0 / 3 * 3.14159 * Math.Pow(r, 3):0.000}");
    }
}