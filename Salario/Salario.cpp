#include <bits/stdc++.h>

using namespace std;

int main(){
    int number, hours;
    double money;
    cin >> number >> hours >> money;
    cout << fixed << setprecision(2) << "NUMBER = " << number << endl << "SALARY = U$ " << hours * money << endl;
}