import java.util.Scanner;
import java.util.Arrays;

public class OndeEstaOMarmore{
    public static void quickSort(int[] a, int init, int fim){
        if(init >= fim) return;
        int i = init, j = fim, pivot = a[(init + fim) / 2], aux;
        while (i <= j){
            while (a[i] < pivot) ++i;
            while (a[j] > pivot) --j;
            if (i <= j){
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                ++i;
                --j;
            }
        }
        quickSort(a, init, j);
        quickSort(a, i, fim);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] nq = in.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        int casos = 1;
        while(n != 0 && q != 0){
            int[] pecas = new int[n];
            for(int i = 0; i < n; ++i){
                pecas[i] = in.nextInt();
                in.nextLine();
            }
            quickSort(pecas, 0, n - 1);
            int[] consultas = new int[q];
            for(int i = 0; i < q; ++i){
                consultas[i] = in.nextInt();
                in.nextLine();
            }
            System.out.println("CASE# " + casos++ + ":");
            for(int i : consultas){
                int index = Arrays.binarySearch(pecas, i);
                if(index >= 0) System.out.println(i + " found at " + (index + 1));
                else System.out.println(i + " not found");
            }
            String[] newnq = in.nextLine().split(" ");
            n = Integer.parseInt(newnq[0]);
            q = Integer.parseInt(newnq[1]);
        }
        in.close();
    }
}