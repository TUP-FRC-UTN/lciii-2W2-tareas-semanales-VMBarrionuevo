/*Las cajas de ahorro no permiten extracciones si el saldo no es suficiente */
package cuenta;

public class CajaAhorro extends Cuenta { //hago la herencia de Cuenta

    public CajaAhorro(int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
    }
    
    @Override
    public void extraer(double montoExtraer){
        
        if(montoExtraer <= saldo){
            saldo = saldo - montoExtraer;
        }else
            System.out.println("Saldo insuficiente");
    }
    
}
