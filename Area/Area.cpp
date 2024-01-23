#include <bits/stdc++.h>

using namespace std;

int main(){
    double a, b, c;
    cin >> a >> b >> c;
    cout << fixed << setprecision(3) << "TRIANGULO: " << a * c / 2 << endl << "CIRCULO: " << 3.14159 * pow(c, 2) << endl << "TRAPEZIO: " << (a + b) * c / 2 << endl << "QUADRADO: " << pow(b, 2) << endl << "RETANGULO: " << a * b << endl;
}