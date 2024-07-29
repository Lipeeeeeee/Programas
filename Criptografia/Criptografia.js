const scanner = require("readline");
const data = scanner.createInterface({input: process.stdin, output: process.stdout});
data.question("", (n) =>{
    let contador = 0;
    const criptografar = () => {
        if(contador != n){
            data.question("", (char) =>{
                var charArray = char.split('');
                for(var j = 0; j < charArray.length; ++j){
                    if(charArray[j] >= 'A' && charArray[j] <= 'z') charArray[j] = String.fromCharCode(charArray[j].charCodeAt(0) + 3);
                }
                charArray.reverse();
                for(var j = (charArray.length / 2) | 0; j < charArray.length; ++j) charArray[j] = String.fromCharCode(charArray[j].charCodeAt(0) - 1);
                console.log(charArray.join(""));
                ++contador;
                criptografar();
            });
        }
        else data.close();
    }
    criptografar();
});