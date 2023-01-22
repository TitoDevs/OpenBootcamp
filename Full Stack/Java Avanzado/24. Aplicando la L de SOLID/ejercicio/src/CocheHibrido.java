public class CocheHibrido extends CocheExtension {
    String tipo = "híbrido";
    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getModelo() {
        return "familiar";
    }
}
