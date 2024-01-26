using System;

public class IdadeEmDias{
    public static void Main(){
        int n = int.Parse(Console.ReadLine());
        Console.WriteLine(n / 365 + " ano(s)\n" + n % 365 / 30 + " mes(es)\n" + n % 365 % 30 + " dia(s)");
    }
}