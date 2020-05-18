

package cuenta;

public class Main {

     public static void main(String[] args) {
        
        /*CajaAhorro c = new CajaAhorro(34, "Victoria", 3000);
        c.extraer(2000);*/
        
        CuentaCorriente c = new CuentaCorriente(2000, 34,"Victoria",3000);
        c.extraer(5001);
           
        System.out.println("El saldo de la cuenta es: " + c.getSaldo());
    } 
         
}
