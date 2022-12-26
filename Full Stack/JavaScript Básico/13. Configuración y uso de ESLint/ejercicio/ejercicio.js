// Cadena de texto con nombre
nombre = "Daniel"

// Cadena de texto con apellido
apellidos = "Guardado"

// Cadena de texto concatenando noombre y apellido
estudiante = nombre + " " + apellidos
console.log(estudiante)

// Cadena de texto "estudiante" en MAYÚSCULAS
estudianteMayus = estudiante.toUpperCase()
console.log(estudianteMayus)

// Cadena de texto "estudiante" en minúsculas
estudianteMinus = estudiante.toLowerCase()
console.log(estudianteMinus)

// Variable con numero de letras de "estudiantes"
length_estudiantes = estudiante.length
console.log(length_estudiantes)

// Variable con la primera letra de nonbre
first_char = nombre[0]
console.log(first_char)

// Variable con la última letra de apellido
last_char = nombre[nombre.length-1]
console.log(last_char)

// Cadena de texto que elimine espacios de "estudiante"
estudiante_trim = estudiante.trim()
console.log(estudiante_trim)
estudiante_all_trim = estudiante.replace(" ", "")
console.log(estudiante_all_trim)

// Variable booleana que diga si el Nombre está contenido en la variable "estudiante"
isNamed = estudiante.includes(nombre)
console.log(isNamed)