package State;

public class EstadoHacerFoto extends Estado {
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): El móvil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La cámara ya estaba abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "La foto se ha hecho";
    }
}
