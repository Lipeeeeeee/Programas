const scanner = require("readline");
const data = scanner.createInterface({input: process.stdin, output: process.stdout});
data.question("", (valor) =>{
    console.log(`${valor}\n${(valor / 100) | 0} nota(s) de R$ 100,00\n${(valor % 100 / 50) | 0} nota(s) de R$ 50,00\n${(valor % 100 % 50 / 20) | 0} nota(s) de R$ 20,00\n${(valor % 100 % 50 % 20 / 10) | 0} nota(s) de R$ 10,00\n${(valor % 100 % 50 % 20 % 10 / 5) | 0} nota(s) de R$ 5,00\n${(valor % 100 % 50 % 20 % 10 % 5 / 2) | 0} nota(s) de R$ 2,00\n${valor % 100 % 50 % 20 % 10 % 5 % 2} nota(s) de R$ 1,00`);
    data.close();
});