const persona = {
    nombre: "Tito",
    edad: 28
}

console.log(persona)

function getDobleEdad(edad) {
    return edad * 2
}

const dobleEdad = getDobleEdad(persona.edad)
console.log(dobleEdad)

let arrayNums = []

function getArray(edad) {
    for (let i = 0; i < 10; i++) {
        const numero = persona.edad + i;
        console.log(numero);
        arrayNums = [...arrayNums, numero]
    }
    
    return arrayNums
}

const array = getArray(persona.edad)
console.log(array)