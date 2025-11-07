
package views;

import controllers.PedidoFacade;

import java.util.Scanner;

/**
 *
 * @author kelvincitopkmz
 */
public class Cliente {
    
    
    public void run() {
        
        Scanner sc = new Scanner(System.in);
        
        int option;
        
        do {
            
            System.out.println("\n=== Menú ===");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Salir");
            
            
            option = sc.nextInt();
            sc.nextLine();
            
            switch (option) {
                case 1:
                    
                    PedidoFacade facade = new PedidoFacade();
                    String response = facade.registrarPedido();
                    
                    System.out.println(response);
                    
                    break;
                case 2:
                    option = 0;
                    System.out.println("Sistema apagado.");
                    break;
            }
            
            
        } while (option != 0);
        
    }
}
