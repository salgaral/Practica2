package state;

public class StatePreparado extends State {

	@Override
	public void abrir(Conexion c) {
		
	}

	@Override
	public void cerrar(Conexion c) {
		c.setEstado(new StateCerrado());
	}

	@Override
	public void parar(Conexion c) {
		c.setEstado(new StateParado());
	}

	@Override
	public void iniciar(Conexion c) {
		
	}

	@Override
	public void enviar(Conexion c, String msg) {
		c.getLink().enviar(msg);
		c.setEstado(new StateEsperando());
	}

	@Override
	public void recibir(Conexion c, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstadoEnum() {
		return Estado.PREPARADO;
	}

}
