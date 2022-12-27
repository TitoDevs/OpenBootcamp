const boton = document.querySelector("#btn")
console.log(boton)

boton.addEventListener("click", () => {
    // alert("Se ha hecho click")
    // confirm("Estás de acuerdo?") && console.log("OK")
    // confirm("Estás de acuerdo?") ? console.log("OK") :  console.log("NO!");

    const respuesta = confirm("Seguro?")
    if (respuesta) {
        console.log("Estás de acuerdo");
    } else {
        console.log("No estás de acuerdo");
    }
})

const botonInfo = document.querySelector("#info")

botonInfo.addEventListener("click", () => {
    const nombre = prompt("¿Cuál es tu nombre?")
    if (nombre) {
        console.log("Tu nombre es " + nombre)
    } else {
        console.log("No has introducido nada");
    }
})

const lista = [{
    nombre: "Tito",
    edad: 28
}, {
    nombre: "Julen",
    edad: 23
}, {
    nombre: "Amaia",
    edad: 43
}]

// console.log(lista)
console.table(lista)