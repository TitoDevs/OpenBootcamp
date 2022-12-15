// Variable que contenga la lista de la compra (mínimo 5 elementos)
const listaCompra = ["Pan", "Cebolla", "Pollo", "Coca-cola", "Arroz"]
console.log(listaCompra)

// Modifica la lista de la compra y añádele "Aceite de Girasol"
listaCompra.push("Aceite de Girasol")
console.log(listaCompra)

// Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
listaCompra.pop()
console.log(listaCompra)

// Una lista de tus 3 películas favoritas (objectos con propiedades: titulo, director, fecha)
const listaPeliculas = [
    { titulo: "Rey León", director: "Rob Minkoff", fecha: new Date(1994, 0, 8)},
    { titulo: "Harry Potter", director: "J. K. Rowling", fecha: new Date(2005, 10, 25)},
    { titulo: "In time", director: "Andrew Niccol", fecha: new Date(2011, 11, 02)}
]
console.log(listaPeliculas)

// Una nueva lista que contenga las peliculas posteriores al 1 de enero de 2010 (utilizando filter)
const listaPeliculasPos = listaPeliculas.filter(pelicula => pelicula.fecha > new Date(2010, 0, 1))
console.log(listaPeliculasPos)

// Una nueva lista que contenga los directores de la lista de peliculas original (utilizando map)
const listaDirectores = listaPeliculas.map(nombre => nombre.director)
console.log(listaDirectores)

// Una nueva lista que contenga los titulos de la lista de películas original (utilizando map)
const listaTitulos = listaPeliculas.map(pelicula => pelicula.titulo)
console.log(listaTitulos)

// Una nueva lista que concatene la lista de directores y la lista de los titulos (utilizando concat)
const listaConc = listaDirectores.concat(listaTitulos)
console.log(listaConc)

// Una nueva lista que concatene la lista de directores y la lista de los titulos (utilizando el factor de propagación)
const listaFactPro = [...listaDirectores, ...listaTitulos]
console.log(listaFactPro)