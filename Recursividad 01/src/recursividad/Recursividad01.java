package recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Recursividad01 {

    public static void main(String[] args) {
        BufferedReader EntKey = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(("Ingrese un número, el programa lo invertira\n Ejemplo:\nEntrada:123 Salida:321"));
        System.out.print("\nEntrada: ");
        try {
            int salida = Integer.parseInt(Inversor(EntKey.readLine()));
            System.out.print("\nSalida: "+salida+"\n");
        } catch (IOException ex) {
            Logger.getLogger(Recursividad01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String Inversor(String entrada) {
        if (entrada.isEmpty()) {
            return entrada;
        } else {
            return Inversor(entrada.substring(1)) + entrada.charAt(0);
        }
    }
    
}
