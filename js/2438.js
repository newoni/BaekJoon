/*
<21.02.23>
made by KH

problem number: 2438
source: https://www.acmicpc.net/problem/2438
reference
-  https://velog.io/@bathingape/JavaScript-var-let-const-%EC%B0%A8%EC%9D%B4%EC%A0%90
-  https://velog.io/@exploit017/%EB%B0%B1%EC%A4%80Node.js-Node.js-%EC%9E%85%EB%A0%A5-%EB%B0%9B%EA%B8%B0

*/
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split(' ');
let num = Number(input);

const star = "*";

for(let i=0; i<num ; i++){
    let str = "";
    for(let j=0; j<=i; j++){
        
        str += star;
    }
    console.log(str);
}