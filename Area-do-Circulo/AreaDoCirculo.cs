using System;

public class AreaDoCirculo{
    public static void Main(){
        double raio = double.Parse(Console.ReadLine());
        Console.WriteLine($"A={3.14159 * raio * raio:.0000}");
    }
}