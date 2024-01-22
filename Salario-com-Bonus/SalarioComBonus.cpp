#include <bits/stdc++.h>

using namespace std;

int main(){
    string nome;
    double salario, vendas;
    cin >> nome >> salario >> vendas;
    cout << fixed << setprecision(2) << "TOTAL = R$ " << salario + vendas * 0.15 << endl;
}