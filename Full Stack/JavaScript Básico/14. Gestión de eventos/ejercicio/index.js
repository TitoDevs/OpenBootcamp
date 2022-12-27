// Botón con getElementById
const boton = document.getElementById("btn")

boton.addEventListener("click", () => {
    alert("click en el botón")
})

// Botón jQuery
const botonjQ = document.querySelector("#btn")

botonjQ.addEventListener("click", () => {
    console.log("Hola, estoy utilizando jQuery")
})