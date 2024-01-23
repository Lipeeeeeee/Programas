import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String informacoes = in.nextLine();
        String[] valores = informacoes.split(" ");
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", Double.parseDouble(valores[0]) * Double.parseDouble(valores[2]) / 2, 3.14159 * Math.pow(Double.parseDouble(valores[2]), 2), (Double.parseDouble(valores[0]) + Double.parseDouble(valores[1])) * Double.parseDouble(valores[2]) / 2, Math.pow(Double.parseDouble(valores[1]), 2), Double.parseDouble(valores[0]) * Double.parseDouble(valores[1]));
    }
}