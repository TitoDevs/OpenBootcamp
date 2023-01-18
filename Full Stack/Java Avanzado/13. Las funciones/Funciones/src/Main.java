import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        boolean bmayor = esMayor(4, 2);

        // Como la funcion es muy pequeña, podríamos evitar la función
        boolean mayor = 3 > 5 ? true : false;
        boolean bEsLaborable = esLaborable(5);
        determinaFruta("Manzana");

        int[] iNumeros = {1, 2, 3, 4, 5};
        int resultado = sumaNumeros(iNumeros);
        int resultadoDos = sumarCuatroValors(2,4,5,6);
        System.out.println(sumarInfinitamente(2,35,56,4,63,3,34,5,346,34,56,345));

        Usuarios usuarios = new Usuarios();
        Usuario usuario = new Usuario();
        usuario.nombre = "Pepe";
        usuario.apellidos = "Bolle";
        usuario.edad = 23;
        usuario.puedeConducir = true;

        Usuario usuario2 = new Usuario();
        usuario2.nombre = "Pepe";
        usuario2.apellidos = "Bolle";
        usuario2.edad = 23;
        usuario2.puedeConducir = true;

        try {
            usuarios.añadirUsuarios(usuario, usuario2);
        } catch (UserException e) {
            System.out.println("Error al añadir objeto de usuario: " + e.getMessage());
        }
    }

    // Función monádica
    public static int sumaNumeros(int[] numeros) {
        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;

        // Refactorizado
        // return Arrays.stream(numeros).reduce(0, (a, b) -> a + b);
    }

    // Función diádica
    public static int sumarValores(int valorA, int valorB) {
        return valorA + valorB;
    }

    // Función triádica
    public static int sumarTresValores(int valorA, int valorB, int valorC) {
        return valorA + valorB + valorC;
    }

    // Función poliática
    public static int sumarCuatroValors(int valorA, int valorB, int valorC, int valorD) {
        return valorA + valorB + valorC + valorD;
    }

    public static int sumarInfinitamente(int ...numeros) {
        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static void determinaFruta(String sFruta) {
        // String sFruta = "Manzana";

        // Con if
        if (sFruta == "Pera") {
            System.out.println("Es una pera");
        } else if (sFruta == "Melocotón") {
            System.out.println("Es un melocotón");
        } else if (sFruta == "Banana") {
            System.out.println("Es una banana");
        } else if (sFruta == "Manzana") {
            System.out.println("Es una manzana");
        } else {
            System.out.println("Es otra cosa");
        }

        // Con switch
        switch (sFruta) {
            case "Pera":
                System.out.println("Es una pera");
                break;
            case "Melocoton":
                System.out.println("Es un melocotón");
                break;
            case "Banana":
                System.out.println("Es una banana");
                break;
            case "Manzana":
                System.out.println("Es una manzana");
                break;
            default:
                System.out.println("Es otra cosa");
                break;
        }
    }

    public static boolean esLaborable (int dia) {

        // Con if
        // if(dia > 1 && dia < 6) {
        //     return true;
        // } else {
        //     return false;
        // }

        // Refactorizado
        // return dia > 1 && dia < 6;

        // Con switch
        switch (dia) {
            case 1:
                return true;
                break;
            case 2:
                return true;
                break;
            case 3:
                return true;
                break;
            case 4:
                return true;
                break;
            case 5:
                return true;
                break;
            case 6:
                return false;
                break;
            case 7:
                return false;
                break;
            case 0:
                return false;
                break;

            // Manera más corta
            // case 1:
            // case 2:
            // case 3:
            // case 4:
            // case 5:
            //     return true;
            //     break;
            // case 6:
            // case 7:
            // case 0:
            //     return false;
            //     break;
        }
        return false;
    }

    private static boolean esMayor(int a, int b) {
        // Función normal
        if (a > b) {
            return true;
        }
        return false;

        // Refacturizado
        // return a > b ? true : false;
    }

    // Esto no se hace
    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        d();
    }

    public static void d() {
        e();
    }

    public static void e() {
        System.out.println("Estoy en e");
    }
}