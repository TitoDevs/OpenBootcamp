package Factory;

public class PrecioFactory {
    Precio precio;

    private PrecioFactory(){}

    public PrecioFactory(String pais){
        if (pais.equalsIgnoreCase("España")){
            System.out.println("España, precio en EUR");
            precio = new PrecioEUR();
        } else {
            System.out.println("Otro pais, precio en USD");
            precio = new PrecioUSD();
        }
    }
}
