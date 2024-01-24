using System;
using System.Linq;

public class OMaior{
    public static void Main(){
        int[] valores = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
        int MaiorAB = (valores[0] + valores[1] + Math.Abs(valores[0] - valores[1])) / 2;
        Console.WriteLine($"{(MaiorAB + valores[2] + Math.Abs(MaiorAB - valores[2])) / 2} eh o maior");
    }
}