#include <bits/stdc++.h>

using namespace std;

int main(){
    int a, b, c;
    cin >> a >> b >> c;
    int MaiorAB = (a + b + abs(a - b)) / 2;
    cout << (MaiorAB + c + abs(MaiorAB - c)) / 2 << " eh o maior" << endl;
}