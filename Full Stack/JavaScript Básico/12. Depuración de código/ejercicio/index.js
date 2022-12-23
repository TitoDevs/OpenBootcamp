// Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la
// secuencia Fibonacci
function fibonacci(num) {
    var array = [];
    array[0] = 1;
    array[1] = 1;
    
    for(let i = 2; i < num; i++) {
        array[i] = array[i - 2] + array[i - 1]
    }
    return array
}

console.log(fibonacci(6));