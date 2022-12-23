const persona = {
    nombre: "Tito",
    edad: 28,
    isDeveloper: true,
    saludo: function() {
        console.log(`Hola`)
    }
}

console.log(persona);

persona.saludo()

const otra_persona = {
    nombre: "Miguel",
    edad: 23,
    isDeveloper: false,
    saludo: function() {
        console.log("Hola")
    }
}

otra_persona.saludo()

const creaPersona = (nombre, edad, isDeveloper) => {
    return {
        nombre,
        edad,
        isDeveloper,
        saludo: function() {
            console.log("Hello");
        }
    }
}

const nueva_persona = creaPersona("Juan", 23, true);
console.log(nueva_persona)

const nueva_persona_2 = creaPersona("Maria", 44, false);