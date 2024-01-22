using System;

public class Salario{
    public static void Main(){
        int number = int.Parse(Console.ReadLine());
        int hours = int.Parse(Console.ReadLine());
        double money = double.Parse(Console.ReadLine());
        Console.WriteLine($"NUMBER = {number}\nSALARY = U$ {hours * money:0.00}");
    }
}