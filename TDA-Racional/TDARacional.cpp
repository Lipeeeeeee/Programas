#include <bits/stdc++.h>

using namespace std;

int main(){
    string operacao;
    getline(cin, operacao);
    int n = stoi(operacao);
    for(int i = 0; i < n; ++i){
        getline(cin, operacao);
        int N1 = stoi(operacao.substr(0, operacao.find('/')));
        int D1 = stoi(operacao.substr(operacao.find('/') + 1, operacao.find_first_of("+-*/", operacao.find('/') + 1)));
        int N2 = stoi(operacao.substr(operacao.find_first_of("+-*/", operacao.find('/') + 1) + 1, operacao.rfind('/')));
        int D2 = stoi(operacao.substr(operacao.rfind('/') + 1, operacao.size()));
        if(operacao.find('+') != -1){
            N1 = N1 * D2 + N2 * D1;
            D1 *= D2;
        }
        else if(operacao.find('-') != -1){
            N1 = N1 * D2 - N2 * D1;
            D1 *= D2;
        }
        else if(operacao.find('*') != -1){
            N1 *= N2;
            D1 *= D2;
        }
        else{
            N1 *= D2;
            D1 *= N2;
        }
        cout << N1 << '/' << D1 << " = ";
        int menor = N1 <= D1 ? N1 : D1;
        for(int j = 2; j <= abs(menor); ++j){
            while(N1 % j == 0 && D1 % j == 0){
                N1 /= j;
                D1 /= j;
            }
            menor = N1 <= D1 ? N1 : D1;
        }
        cout << N1 << '/' << D1 << endl;
    }
}