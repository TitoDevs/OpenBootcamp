package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */
public class EmpleadoCRUDV1 {

    // estructura de datos
    private List<Empleado> empleadoList = new ArrayList<>();

    // OPERTACIONES CRUD


    // CREATE - guardar un empleado
    public void save(Empleado empleado){
        empleadoList.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleadoList;
    }
}
