// Ejercicio 3

// Fecha de hoy
const fechaHoy = new Date()
console.log(fechaHoy)

// Fecha de tu nacimiento
const fechaNaciemiento = new Date(1994, 0, 8)
console.log(fechaNaciemiento)

// Una variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento
const masTarde = fechaHoy > fechaNaciemiento
console.log(masTarde)

// Una variable que contenga el día de tu nacimiento
const diaNaciemiento = fechaNaciemiento.getDate()
console.log(diaNaciemiento)

// Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)
const mesNacimiento = fechaNaciemiento.getMonth() + 1
console.log(mesNacimiento)

// Una variable que contenga el año de tu nacimiento (con 4 dígitos)
const anyoNacimiento = fechaNaciemiento.getFullYear()
console.log(anyoNacimiento)