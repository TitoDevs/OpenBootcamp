public class CocheElectrico extends CocheExtension {
    String tipo = "eléctrico";

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getModelo() {
        return "berlina";
    }
}
