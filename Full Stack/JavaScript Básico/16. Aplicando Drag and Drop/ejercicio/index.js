const parrafos = document.querySelectorAll(".parrafo")
const secciones = document.querySelectorAll(".seccion")
const papelera = document.querySelector(".papelera")

parrafos.forEach(parrafo => {
    parrafo.addEventListener("dragstart", event => {
        console.log("Estoy arrastrando el párrafo: " + parrafo.innerText)
        parrafo.classList.add("dragging")
        event.dataTransfer.setData("id", parrafo.id)
    })

    parrafo.addEventListener("dragend", () => {
        // console.log("He terminado de arrastrar")
        parrafo.classList.remove("dragging")
    })
})

secciones.forEach(seccion => {
    seccion.addEventListener("dragover", event => {
        event.preventDefault()
        event.dataTransfer.dropEfect = "copy" // copy por defecto
        // console.log("Drag Over")
        //
    })

    seccion.addEventListener("drop", event => {
        console.log("Drop")
        const id_parrafo = event.dataTransfer.getData("id")
        // console.log("Párrafo id: " + id_parrafo)
        const parrafo = document.getElementById(id_parrafo)
        seccion.appendChild(parrafo)
    })
})

papelera.addEventListener("dragover", event => {
    event.preventDefault()
    const id_parrafo = event.dataTransfer.getData("id")
    // console.log("Párrafo id: " + id_parrafo)
    const parrafo = document.getElementById(id_parrafo)
    papelera.appendChild(parrafo)
})

papelera.addEventListener("drop", event => {
    const id_parrafo = event.dataTransfer.getData("id")
    // console.log("Párrafo id: " + id_parrafo)
    const parrafo = document.getElementById(id_parrafo)
    papelera.appendChild(parrafo)
})