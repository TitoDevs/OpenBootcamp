// localStorage.setItem("nombre", "Tito")
// localStorage.setItem("nombre", "Juan")

// console.log(localStorage.getItem("nombre"))

// localStorage.setItem("persona", JSON.stringify({nombre: "Tito", edad: 28}))

// console.log(JSON.parse(localStorage.getItem("persona")))

// JSON.stringify -> Convierte un objeto/array en String
// JSON.parse -> Convierte un objeto/array convertido a través de stringify en un objeto Javascript

localStorage.removeItem("nombre")

sessionStorage.setItem("nombre-sesion", "Tito")

/* Cookies */
document.cookie = "nombreCookie=TitoCookie"

document.cookie = "nombreCaducidad=Nombre;expires=" + new Date(2023, 0, 1).toUTCString()
console.log(document.cookie)