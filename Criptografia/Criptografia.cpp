#include <bits/stdc++.h>

using namespace std;

int main(){
    string line;
    getline(cin, line);
    int n = stoi(line);
    for(int i = 0; i < n; ++i){
        getline(cin, line);
        for(int j = 0; j < line.size(); ++j){
            if(isalpha(line[j])) line[j] += 3;
        }
        reverse(line.begin(), line.end());
        for(int j = line.size() / 2; j < line.size(); ++j) line[j] -= 1;
        cout << line << endl;
    }
}