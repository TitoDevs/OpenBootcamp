// Importamos controller.js
import * as moduloMatematicas from './modulos/controller.js'

// Importamos chalk
import chalk from "chalk"

const mult = moduloMatematicas.multiplica(moduloMatematicas.suma(1,2), moduloMatematicas.suma(1,2))
const sum = moduloMatematicas.suma(4,5)
console.log(mult);

// Color verde
console.log(chalk.green(sum))