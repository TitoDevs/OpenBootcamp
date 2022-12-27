let nombre = "Tito"
let apellido = "Guardado"

const obj = {nombre, apellido}

// Almacena el objeto anterior en SessionStorage
sessionStorage.setItem("persona", JSON.stringify(obj))


// Almacena el objeto anterior en LocalStorage
localStorage.setItem("persona", JSON.stringify(obj))

// Crea una cookie que caduque en 2 minutos con los datos del objeto anterior
document.cookie = "personaCaducidad=Persona;expires=" + new Date(2022, 11, 27, 14, 2, 0).toUTCString();