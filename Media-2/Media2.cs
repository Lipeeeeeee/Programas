using System;

public class Media2{
    public static void Main(){
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());
        Console.WriteLine($"MEDIA = {(a * 2 + b * 3 + c * 5) / 10:0.0}");
    }
}