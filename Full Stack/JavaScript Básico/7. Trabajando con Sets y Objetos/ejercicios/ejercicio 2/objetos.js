// Ejercicio 2

// Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
const datosPersonales = {
    nombre: "Daniel",
    apellido: "Guardaddo",
    edad: 28,
    altura: 169,
    isDeveloper: true
}
console.log(datosPersonales)

// Una variable que obtenga tu edad a partir del objeto anterior
const edad = datosPersonales.edad
console.log(edad)

// Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
const nuevaLista = [
    datosPersonales,
    {nombre: "Alejandro", apellido: "Ja", edad: 24, altura: 175, isDeveloper: false},
    {nombre: "Francisco", apellido: "Ro", edad: 27, altura: 182, isDeveloper: false}
]
console.log(nuevaLista)

// Una nueva lista con los objetos de la lista anterior ordenador por edad, de mayor a menor
nuevaLista.sort((a, b) => b.edad - a.edad)
console.log(nuevaLista)