using System;

public class ConversaoDeTempo{
    public static void Main(){
        int n = int.Parse(Console.ReadLine());
        Console.WriteLine(n / 3600 + ":" + n % 3600 / 60 + ":" + n % 3600 % 60);
    }
}