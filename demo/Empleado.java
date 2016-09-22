package demo;

public class Empleado {
	private String nombre;
	private String apellidos;
	private int edad;
	private float salario;

	public Empleado() {

	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellidoPaterno(String apellido) {
        this.apellidoPaterno = apellido;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0 && edad <= 100) {
            this.edad = edad;
        }
    }

    public float getSalario() {
        return edad;
    }

    public void setSalario(float salario) {
    	this.salario = salario;
    }
}
