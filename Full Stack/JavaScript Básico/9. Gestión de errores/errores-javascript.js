const miFuncion = val => {
    if (typeof val === "number") {
        return 2 * val
    }
    // return false;
    throw new Error("El valor debe ser de tipo número")
}

// const miFuncion = val => 2 * val
// console.log(miFuncion(2))
// const elDoble = console.log(miFuncion("a1a")) // NaN

const numero = "8";

try {
    // Código que puede fallar
    console.log("Está ejecutandose de manera correcta")
    const doble = miFuncion(numero)
    console.log(doble)
} catch (e) {
    // En caso de fallar, quiero que ejecutes
    console.log("ERROR!")
    console.error(`El valor de e es: ${e}`)
} finally {
    console.log("Esto se va a ejecutar tanto si se produce un error, como si no existe ninguno")
}

// InternalError, SyntaxError, TypeError, RangeError y ReferenceError
// https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Global_Objects/Error