// Variable que contenga tu altura en centimetros (entero)
let altura = 169;
console.log(altura);

// Variable que contenga tu altura en metros (número de coma flotante)
let altura_metros = altura / 100;
console.log(altura_metros);

// Variable que contenga tu peso en kilogramos (número de coma flotante)
let peso_kg = 79.80;
console.log(peso_kg);

// Variable que contenga tu altura en metros redondeada hacia arriba
let altura_redondeada = Math.round(altura_metros);
console.log(altura_redondeada);

// Variable que contenga tu peso en kilogramos redondeado hacia abajo
let peso_redondeado = Math.floor(peso_kg);
console.log(peso_redondeado);

// Variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript
let min_valor_JS = Number.MIN_VALUE + 1;
let max_valor_JS = Number.MAX_VALUE;
let res = min_valor_JS === max_valor_JS ? true : false;
console.log(res);