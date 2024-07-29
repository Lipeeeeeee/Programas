#include <bits/stdc++.h>

using namespace std;

int main(){
    int n, q, casos = 1;
    cin >> n >> q;
    while(n != 0 && q != 0){
        vector<int> pecas(n);
        for(int i = 0; i < n; ++i) cin >> pecas[i];
        sort(pecas.begin(), pecas.end());
        int consultas[q];
        for(int i = 0; i < q; ++i) cin >> consultas[i];
        cout << "CASE# " << casos++ << ":\n";
        for(int i = 0; i < q; ++i){
            for(int j = 0; j < n; ++j){
                if(pecas[j] == consultas[i]){
                    cout << consultas[i] << " found at " << j + 1 << endl;
                    break;
                }
                else if(j == n - 1 && pecas[j] != consultas[i]) cout << consultas[i] << " not found\n";
            }
        }
        cin >> n >> q;
    }
}