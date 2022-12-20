// Función con error personalizado
const miFuncion = val => {
    if (typeof val === "number") {
        return 2 * val
    }
    // return false;
    throw new Error("El valor debe ser de tipo número")
}

const numero = "8";

const winston = require("winston");

const logger = winston.createLogger({
  level: "error",
  format: winston.format.json(),
  //   defaultMeta: { service: 'user-service' },
  transports: [
    //
    // - Write all logs with importance level of `error` or less to `error.log`
    // - Write all logs with importance level of `info` or less to `combined.log`
    //
    new winston.transports.Console(),
    new winston.transports.File({ filename: "error.log", level: "error" }),
    new winston.transports.File({ filename: "combined.log" }),
  ],
});

try {
    // Código que puede fallar
    console.log("Está ejecutandose de manera correcta")
    const doble = miFuncion(numero)
    console.log(doble)
} catch (e) {
    // En caso de fallar, quiero que ejecutes
    console.log("ERROR!")
    logger.error(`El valor de e es: ${e}`)
}