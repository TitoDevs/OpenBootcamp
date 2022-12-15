// Factorial de 10 con Bucle While, una bifurcación if y una sentencia break
let num = 1;
let max = 1;
while(true) {
    num = num * max;
    console.log(num)
    max++;
    if(max === 11) {
        break;
    }
}