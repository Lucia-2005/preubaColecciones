package prueba_colecciones;

public class Paciente {
	int codigo=0;
	String nombre="";
	int edad=0;
	double temperatura=0;
	int colesterol=0;
	
	Paciente(int codigo, String nombre, int edad, double temperatura, int colesterol) {
		this.codigo=codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.colesterol = colesterol;
	}

	
	int getCodigo() {
		return codigo;
	}


	void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	String getNombre() {
		return nombre;
	}

	int getEdad() {
		return edad;
	}

	double getTemperatura() {
		return temperatura;
	}

	int getColesterol() {
		return colesterol;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

	void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	void setColesterol(int colesterol) {
		this.colesterol = colesterol;
	}
	
	
	
	
}
