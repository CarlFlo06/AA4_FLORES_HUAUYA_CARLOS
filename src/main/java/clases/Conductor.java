package clases;

public class Conductor implements Afiliacion {
	public Object registro;
	public Object baja;
	public String nombres;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public String fechaNacimiento;
	public String direccion;
	public int telefono;
	public String email;
	public int dni;
	public Conductor() {
		// TODO Auto-generated constructor stub
	}
		
	public Conductor(String nombres, String apellidoPaterno, String apellidoMaterno,
			String fechaNacimiento, String direccion, int telefono, String email, int dni) {
		super();
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.dni = dni;
	}
	public Conductor(Object registro, Object baja) {
		this.registro = registro;
		this.baja = baja;
	}
	public Object registro() {
		Conductor registro=new Conductor("Carlos","Flores","Huauya","2000-11-06","San Juan de Lurigancho",123456789,"carlos@email.com",12345678);
		System.out.println("***** REGISTRO *****");
		System.out.println(registro.iniAtributos());
		return registro;
	}
	public Object baja() {
		Conductor baja=new Conductor("Daniel","Lopez","Gomez","1997-09-11","La victoria",987654321,"dangomez@email.com",87654321);
		System.out.println("***** Baja *****");
		System.out.println(baja.iniAtributos());
		return baja;
	}
	
	public Object getRegistro() {
		return registro;
	}
	public void setRegistro(Object registro) {
		this.registro = registro;
	}
	public Object getBaja() {
		return baja;
	}
	public void setBaja(Object baja) {
		this.baja = baja;
	}
	//*********************************************
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String iniAtributos() {
		return "nombres: " + nombres + "\napellidoPaterno: " + apellidoPaterno + "\napellidoMaterno: "
				+ apellidoMaterno + "\nfechaNacimiento: " + fechaNacimiento + "\ndireccion: " + direccion + "\ntelefono: "
				+ telefono + "\nemail: " + email + "\ndni: " + dni+"\n";
	}
	
}
