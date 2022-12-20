// Funcion sin parámetros que devuelva siempre "true"
function alwaysTrue(){
    return true;
}
console.log(alwaysTrue())

// Función asíncrona que utilice un setTimeOut y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado
const funcionAsincrona = setTimeout(() => {
    console.log("Hola soy una promesa");
}, "5000")

// Función generadora de índices pares automáticos
function* generaId() {
    let id = 0;
    while (true) {
        id+=2;
        yield id; // Esperando hasta que se vuelva a llamar
    }
}

const gen = generaId();

console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)