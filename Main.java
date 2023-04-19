import java.util.Scanner;

public class Main {
    static Scanner leer =new Scanner (System.in);
    public static void main (String args[]){
        System.out.println();

        System.out.println("             HOTEL EMPEROR CANCUN             ");
    int opcion;
      do {
        
        System.out.println();
        System.out.println("                      MENU                   ");
        opcion=menu();
        switch(opcion){
            case 11: System.out.println("HOLA");
             break;
            case 12: break;
            case 13: break;
            case 14: break;
            case 15: break;
            case 16: break;
            
                   }
      } while (opcion!=3);  
      
    }
    private static int menu(){
		int Op;
		System.out.println();
        System.out.println("  1-RESERVAR   2-REGISTRAR   3-SALIR ");
        System.out.println();
	Op = leer.nextInt();
	if(Op == 3)return Op;
	System.out.println(" 1-LISTAR  2-CAPTURAR   3-CONSULTAR   4-MODIFICAR   5-BUSCAR   6-ELIMINAR   0-CANCELAR ");
	Op = Op*10+leer.nextInt();
	return Op;
	}
   

    }

