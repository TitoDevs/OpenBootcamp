// Formas de importar/exportar módulos
// 1. CommonJS - require
// 2. Import ES6 - import

// const moduloMatematicas = require("./modulos/matematicas")
// console.log(moduloMatematicas)
// const factorial = moduloMatematicas.factorial;
// const { factorial } = moduloMatematicas;
// const suma = moduloMatematicas.suma;

const {factorial, suma} = require("./modulos/matematicas")

const fact = factorial(5);
console.log(fact);

const sum = suma(12, 90);
console.log(sum);

// console.log(module)