const scanner = require("readline");
const data = scanner.createInterface({input: process.stdin, output: process.stdout});
data.question("", (produto1) =>{
    data.question("", (produto2) =>{
        produto1 = produto1.split(" ");
        produto2 = produto2.split(" ");
        console.log(`VALOR A PAGAR: R$ ${(produto1[1] * produto1[2] + produto2[1] * produto2[2]).toFixed(2)}`);
        data.close();
    });
});