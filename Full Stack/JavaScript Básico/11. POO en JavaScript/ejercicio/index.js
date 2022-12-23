// Una clase llamada "Estudiante"
class Estudiante {

    // Variables
    _nombre = "Tito";
    _asignaturas = ["JavaScript", "HTML", "CSS"];

    // Método
    obtenDatos() {
        var obj = {
            nombre: this._nombre,
            asignaturas: this._asignaturas
        };
        return obj;
    }
}

// Instancia
const estudiante = new Estudiante()

// Llamada al método
estudiante.obtenDatos()
console.log(estudiante.obtenDatos())