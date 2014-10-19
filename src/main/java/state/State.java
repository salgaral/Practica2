package state;

public abstract class State {
	public abstract void abrir(Conexion c);
	public abstract void cerrar(Conexion c);
	public abstract void parar(Conexion c);
	public abstract void iniciar(Conexion c);
	public abstract void enviar(Conexion c, String msg);
	public abstract void recibir(Conexion c, int respuesta);
	public abstract Estado getEstadoEnum();
}
