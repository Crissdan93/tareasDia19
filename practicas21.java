package practicas2;

import java.util.Scanner;

public class practicas21 {
	
	
	
	public static void main(String[] args) {
		
		String dia;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Seleccione el numero de día ");
		
		System.out.println("1.Seleccione el numero de día 1");
		System.out.println("2.Seleccione el numero de día 2 ");
		System.out.println("3.Seleccione el numero de día 3");
		System.out.println("4.Seleccione el numero de día 4");
		System.out.println("5.Seleccione el numero de día 5");
		System.out.println("6.Seleccione el numero de día 6");
		System.out.println("7.Seleccione el numero de día 7");
		int opcion = scanner.nextInt();
		
		switch (opcion) {
			
		case 1: 
			
			 dia = "Lunes";
			break;
			
        case 2: 
			
        	 dia= "Martes";
			break;
			
			
			
       case 3: 
			
    	   dia = "Miercoles";
			
			break;
			
       case 4: 
	
    	    dia = "Jueves";
	
    	   break;
			
       case 5: 
	
    	    dia = "Viernes";
	
    	   break;
			
       case 6: 
	
    	    dia = "Sábado";
    	   break;
			
       case 7: 
	
    	    dia = "Domingo";
    	   break;
    	   
    	   default :
    		   
    		   dia ="Numero incorrecto";
    	   break;
			
			
			
			
		}
		
		System.out.println("El dia seleccionado es: "+ dia);
		
		scanner.close();
		
	}

}
