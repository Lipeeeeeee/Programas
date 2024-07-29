const scanner = require("readline");
const data = scanner.createInterface({input: process.stdin, output: process.stdout});
data.question("", (raio) =>{
    console.log(`A=${(3.14159 * raio * raio).toFixed(4)}`);
    data.close();
});