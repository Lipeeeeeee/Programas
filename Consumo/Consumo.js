const scanner = require("readline");
const data = scanner.createInterface({input: process.stdin, output: process.stdout});
data.question("", (distancia) =>{
    data.question("", (combustivel) =>{
        console.log(`${(distancia / combustivel).toFixed(3)} km/l`);
        data.close();
    });
});