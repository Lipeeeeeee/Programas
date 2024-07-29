const scanner = require("readline");
const data = scanner.createInterface({input: process.stdin, output: process.stdout});
data.question("", (numeros) =>{
    nums = numeros.split(" ");
    console.log(`TRIANGULO: ${(nums[0] * nums[2] / 2).toFixed(3)}`);
    console.log(`CIRCULO: ${(3.14159 * nums[2] * nums[2]).toFixed(3)}`);
    console.log(`TRAPEZIO: ${((nums[0] + nums[1]) * nums[2] / 2).toFixed(3)}`);
    console.log(`QUADRADO: ${(nums[1] * nums[1]).toFixed(3)}`);
    console.log(`RETANGULO: ${(nums[0] * nums[1]).toFixed(3)}`);
    data.close();
});