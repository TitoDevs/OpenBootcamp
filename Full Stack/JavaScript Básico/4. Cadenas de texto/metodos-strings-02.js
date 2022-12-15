// Métodos de cadenas de texto (parte 2)
let input = "CaPricORnio";
let db = "capricornio";

// toLowerCase() - toUpperCase()
console.log(input.toLowerCase());
console.log(input.toUpperCase());
console.log(input.toLocaleLowerCase());
console.log(input.toLowerCase() === db.toLowerCase());
console.log(input.toUpperCase() === db.toUpperCase());

// Formas de concatenar dos cadenas de caracteres
let str_1 = "Hola soy la primera cadena.";
let str_2 = "Hola soy la segunda cadena.";

console.log(str_1.concat(" ", str_2));
console.log(str_1 + " " + str_2);
console.log(`${str_1} ${str_2}`);

// Eliminar espacios al inicio y al final
let str_3 = "    Hola soy un string con espacios al final.   ";
console.log(str_3.length);
// trim()
console.log(str_3.trim().length);
console.log(str_3.trimStart().length);
console.log(str_3.trimEnd().length);

// Obtener el caracter que hay en ciera posición
let str_4 = "Hola soy el string número 4"; // ["H", "o", "l", "a"....]

console.log(str_4.charAt(3));
console.log(str_4[3]);

// Obtener la posición de una palabra dentro de una cadena de caracteres
let srt_5 = "Hola soy Tito y me gusta el surf. Mi nombre es Tito y mi apellido es Dev";
console.log(srt_5.indexOf("Tito"));
console.log(srt_5.charAt(9));
console.log(srt_5.lastIndexOf("Tito"));