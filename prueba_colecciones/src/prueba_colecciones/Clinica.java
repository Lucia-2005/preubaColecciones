package prueba_colecciones;
//Lucia Castañera
import java.util.HashMap;
import java.util.Scanner;

public class Clinica {

	
	static void menu() {
		System.out.println();
		System.out.println("--- Menu ---");
		System.out.println("1)  Introducir datos de un paciente nuevo");
		System.out.println("2)  Obtener todos los datos de un paciente, dado su codigo");
		System.out.println("3)  Averiguar sin un paciente tiene o no fiebre");
		System.out.println("4)  Mostrar código y nombre de pacientes mayores de 65");
		System.out.println("5)  Modificar el colesterol de un paciente");
		System.out.println("6)  Mostrar número de pacientes con colesterol alto");
		System.out.println("7)  Eliminar a un paciente");
		System.out.println("8) Salir");
	}
	
	static boolean tieneFiebre(double temperatura) {
		boolean fiebre;
		if(temperatura>37.5) {
			fiebre=true;
		}else {
			fiebre=false;
		}
		return fiebre;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, Paciente> idPaciente=new HashMap <>();
		int opc=0, edad, colesterol;
		Integer codigo;
		String nombre;
		Double temperatura;
		
		while(opc!=8) {
			Clinica.menu();
			opc=sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("Introduzca el código de identificación del paciente");
				codigo=sc.nextInt();
				int codigoInt=codigo.intValue();
				System.out.print("Nombre del paciente: ");
				nombre=sc.next();
				System.out.print("edad del paciente: ");
				edad=sc.nextInt();
				System.out.print("temperatura de la noche anterior: ");
				temperatura=sc.nextDouble();
				System.out.print("nivel de colesterol: ");
				colesterol=sc.nextInt();
				
				idPaciente.put(codigo, new Paciente(codigoInt, nombre, edad, temperatura, colesterol));
				System.out.println("nuevo paciente creado");
				break;
				
			case 2:
				System.out.println("introduce el codigo del paciente: ");
				codigo=sc.nextInt();
				System.out.println(idPaciente.get(codigo).getNombre());
				System.out.println(idPaciente.get(codigo).getEdad());
				System.out.println(idPaciente.get(codigo).getTemperatura());
				System.out.println(idPaciente.get(codigo).getColesterol());
				break;
			
			case 3:
				System.out.println("introduce el código del paciente: ");
				codigo=sc.nextInt();
				Clinica.tieneFiebre(idPaciente.get(codigo).getTemperatura());
				if(Clinica.tieneFiebre(idPaciente.get(codigo).getTemperatura())==true) {
					System.out.println("El paciente tiene fiebre");
				}else {
					System.out.println("el paciente no tiene fiebre");
				}
				break;
				
			case 4:
				break;
			case 5:
				System.out.println("introduce código del paciente:");
				codigo=sc.nextInt();
				System.out.println("Introduce el nuevo nivel de colesterol: ");
				colesterol=sc.nextInt();
				idPaciente.get(codigo).setColesterol(colesterol);
				System.out.println("nivel de colesterol actualizado");
				break;
				
			case 6:
				break;
			
			case 7:
				System.out.println("Introduce codigo del paciente a eliminar");
				codigo=sc.nextInt();
				idPaciente.remove(codigo);
			}
		}
		
		
		
		
		
		
		
	}

}
