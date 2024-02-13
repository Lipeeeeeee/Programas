using System;
using System.Text;

public class Criptografia{
    public static void Main(){
        int n = int.Parse(Console.ReadLine());
        for(int i = 0; i < n; ++i){
            StringBuilder texto = new StringBuilder(Console.ReadLine());
            for(int j = 0; j < texto.Length; ++j){
                if(char.IsLetter(texto[j])) texto[j] = (char)(texto[j] + 3);
            }
            for(int j = 0; j < texto.Length / 2; ++j){
                char aux = texto[j];
                texto[j] = texto[texto.Length - 1 - j];
                texto[texto.Length - 1 - j] = aux;
            }
            for(int j = texto.Length / 2; j < texto.Length; ++j) texto[j] = (char)(texto[j] - 1);
            Console.WriteLine(texto);
        }
    }
}