#include <bits/stdc++.h>

using namespace std;

int main(){
    int cod1, qtd1, cod2, qtd2;
    double valor1, valor2;
    cin >> cod1 >> qtd1 >> valor1 >> cod2 >> qtd2 >> valor2;
    cout << fixed << setprecision(2) << "VALOR A PAGAR: R$ " << qtd1 * valor1 + qtd2 * valor2 << endl;
}