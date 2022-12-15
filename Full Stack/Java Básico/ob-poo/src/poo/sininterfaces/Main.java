package poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        System.out.println(juanito);

        // guardar empleados
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(roberto);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
