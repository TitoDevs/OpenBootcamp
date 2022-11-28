public class Arrays {
    public static void main(String[] args) {

        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        int array[] = {1,2,3,4,5};

        for (int i : arrayUno) {
            System.out.println(i);
        }

        String nombres[] = {
                "Pepe",
                "Juan",
                "Maria",
                "Pereira"
        };
        System.out.println("Longitud del array " + nombres.length);

        for (String nombre : nombres){
            System.out.println("Nombre actual: " + nombre);
        }

        String ultimoNombre = "";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre actual: " + nombres[i] + " en posición: " + i);
            ultimoNombre = nombres[i];
        }

        int contador = 0;
        while (contador < nombres.length){
            System.out.println("Nombre actual: " + nombres[contador] + " en posición: " + contador);
        }

        int arrayBidi[][] = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;
        arrayBidi[1][0] = 5;
        arrayBidi[1][1] = 6;
        arrayBidi[1][2] = 7;
        arrayBidi[1][3] = 8;

        int arrayBi[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        int enteros[] = new int[100];

        String nombres1[] = {"Pepe", "Juan"};
        nombres[0] = "Victor";
        nombres[1] = "Paco";
        for (String nombre :  nombres1) {
            System.out.println(nombre);
        }
    }
}
