package practicas2;

import java.util.Scanner;

public class practicas23 {
	
	
public static void main(String[] args) {
		
		String platillo;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Seleccione su platillo ");
		
		System.out.println("1.Seleccione enchiladas");
		System.out.println("2.Seleccione pozole ");
		System.out.println("3.Seleccione tacos");
		System.out.println("4.Seleccione panzita");
		System.out.println("5.Seleccione huevos al gusto ");
		
		int comida = scanner.nextInt();
		
		switch (comida) {
			
		case 1: 
			
			platillo = "Elegiste enchiladas";
			break;
			
        case 2: 
			
        	platillo = "Elegiste pozole";
			break;
			
			
			
       case 3: 
			
    	   platillo = "Elegiste tacos";
			
			break;
			
       case 4: 
	
    	   platillo = "Elegiste panzita";
	
    	   break;
			
       case 5: 
	
    	   platillo = "Elegiste huevos al gusto";
	
    	   break;
		
    	   
    	   default :
    		   
    		   platillo ="Numero incorrecto";
    	   break;
			
			
			
			
		}
		
		System.out.println("El dia seleccionado es: "+ platillo);
		
		scanner.close();
		
	}

}



