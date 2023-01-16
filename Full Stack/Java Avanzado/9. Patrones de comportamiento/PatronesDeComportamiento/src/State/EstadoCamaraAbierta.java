package State;

public class EstadoCamaraAbierta extends Estado {
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): Ya estaba desbloqueado el móvil";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La cámara ya estaba abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto(): La foto se va a disparar ya...";
    }
}
