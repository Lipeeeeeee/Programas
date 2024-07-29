const scanner = require("readline");
const data = scanner.createInterface({input: process.stdin, output: process.stdout});
data.question("", (tempo) =>{
    console.log(`${(tempo / 3600) | 0}:${(tempo % 3600 / 60) | 0}:${tempo % 3600 % 60}`);
    data.close();
});