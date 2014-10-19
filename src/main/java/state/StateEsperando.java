package state;

public class StateEsperando extends State {

	@Override
	public void abrir(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
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
		if (respuesta == 0) {
            c.setEstado(new StatePreparado());
        } else {
            c.setEstado(new StateCerrado());
        }
	}

	@Override
	public Estado getEstadoEnum() {
		return Estado.ESPERANDO;
	}

}
