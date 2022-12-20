class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Daniel");
        System.out.println("Mi nombre es " + persona.getNombre());
        persona.setEdad(12);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(738393839);
        System.out.println("Y mi número de teléfono es " + persona.getTelefono());
    }
}
