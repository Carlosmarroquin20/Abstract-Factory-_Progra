package Abstract_Factory;

import java.util.Scanner;

public class Main_Factory {
    
    public static Scanner sc = new Scanner(System.in);
    public static Primary_Factory Factory;
    public static String Acc1;
    
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("BIENVENIDO JUGADOR!!!");
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Quieres un villano o un Heroe!!!!");
        System.out.println("----------------------");
        System.out.println("ELIGE!!!!!!");
        System.out.println("1. Heroe");
        System.out.println("2. Villano");
        Acc1 = sc.nextLine();
        
        if (Acc1.equals("1")){
            System.out.println("Tu heroe sera de  -1. Marvel      -2. DC Comics");
            Acc1 = sc.nextLine();
            
            if(Acc1.equals("1")){
                Factory = new Hero();
                System.out.println("Heroe de Marvel SELECCIONADO");
                System.out.println("El heroe es: " + Factory.getMarvel().getName().toString());
                
            } else if (Acc1.equals("2")){
                Factory = new Hero();
                System.out.println("Heroe de DC SELECCIONADO");
                System.out.println("El heroe es: " + Factory.getDC_Comics().getName().toString());
            }
        
        } else if (Acc1.equals("2")){
            System.out.println("Tu Villano sera de  -1. Marvel      -2. DC Comics");
            Acc1 = sc.nextLine();
            
            if(Acc1.equals("1")){
                Factory = new Villain();
                System.out.println("Villano de Marvel SELECCIONADO");
                System.out.println("El Villano es: " + Factory.getMarvel().getName().toString());
                
            } else if (Acc1.equals("2")){
                Factory = new Villain();
                System.out.println("Villano de DC SELECCIONADO");
                System.out.println("El Villano es: " + Factory.getDC_Comics().getName().toString());
            }
        }
    }
}