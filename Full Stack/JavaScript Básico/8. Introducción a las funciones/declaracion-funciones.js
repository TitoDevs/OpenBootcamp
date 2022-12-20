// Qué son las funciones, cómo se declaran y cómo se utilizan
const nom = "Tito"

// saludar("Tito")
saludar(nom)

function saludar(nombre){
    // console.log(nom)
    console.log(`Hola ${nombre}`)
}

////

let nombre_2 = "Juan"
console.log(nombre_2)

despedir(nombre_2)
console.log(nombre_2)

function despedir(nombre) {
    nombre = "Diego"
    console.log(`Adios ${nombre}`)
}

////

let persona = {nombre: "Juan", apellido: "Gonzale"}

saludarPersona(persona)

console.log(persona)

function saludarPersona(objeto) {
    objeto.apellido = "Vilasr"
    console.log(`Hola ${objeto.nombre} ${objeto.apellido}`)
}

saludar()

////

function imprimenNumero(numero = 7) {  // Parámetros por defecto
    console.log(numero)
}

imprimenNumero()
imprimenNumero(9)

////

function imprimir(...parametros) {
    console.log(parametros)
}

imprimir(1, 3, 5, 6, "hola", {id: 3})

////

function suma(...nums) {
    return nums.reduce((a, b) => a + b)
}

const s = suma(1, 2, 4, 6, 4, 5, 4)

console.log(s)

////
let variable = "Hola"

function multiplicar(a = 0, b = 0) {
    console.log(variable)
    let var_interna = "Adios"
    console.log(var_interna)
    return a * b
}

// console.log(var_interna)

console.log(multiplicar(4, 5))