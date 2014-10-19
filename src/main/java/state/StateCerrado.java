package state;

public class StateCerrado extends State {

	@Override
	public void abrir(Conexion c) {
		c.setEstado(new StatePreparado());
	}

	@Override
	public void cerrar(Conexion c) {
		
	}

	@Override
	public void parar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(Conexion c, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion c, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstadoEnum() {
		return Estado.CERRADO;
	}

}
