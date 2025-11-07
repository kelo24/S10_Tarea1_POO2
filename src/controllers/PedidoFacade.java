package controllers;

import java.util.ArrayList;
import controllers.PedidoController;

/**
 *
 * @author kelvincitopkmz
 */
public class PedidoFacade {
    
    
    public String registrarPedido(String name, String product, int q) {
        
        String response = "";
        
        PedidoController p = new PedidoController();
        
        // Validación de stock
        if (!p.stockValidation(q)) {
            response = "No hay suficiente stock para registrar el pedido.";
            return response;
        }
        // Cálculo de números
        ArrayList<Double> price = p.calcTaxes(q);
        // Registro del pedido
        
        
        return response;    
    }
}
