var variable;
let variableLet;

const constante = "Hola soy una constante";
console.log(constante);
// constante = "Adiós";  // Nos da un error

var a = 1;
console.log(a);

a = 4;
console.log(a);

let b = 3;
console.log(b);

b = 5;
console.log(b);

var variable = "Hola soy una variable VAR"

for (var i = 0; i < 3; i++) {
    var variable = "Soy la segunda variable"
}

console.log(variable)

let variableLet1 = "Hola soy una variable VAR"

for (var i = 0; i < 3; i++) {
    let variableLet1 = "Soy la segunda variable"
}

console.log(variableLet1)

var num = 4
console.log(typeof num)

num = "Hola soy un num"
console.log(typeof num)