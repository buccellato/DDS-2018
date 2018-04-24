package Usuario;

public class usuario {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contraseña;
	private String domicilio;
	private Date fechaAlta;
	
	public usuario(String nombre, String apellido, String usuario, String contraseña, String domicilio,
			Date fechaAlta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.domicilio = domicilio;
		this.fechaAlta = fechaAlta;
	}
	
}
