/*las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible.*/
package cuenta;


public class CuentaCorriente extends Cuenta{ //hago la herencia de Cuenta
    
    private double acuerdo;

    public CuentaCorriente(double acuerdo, int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }

    @Override
    public void extraer(double montoExtraer){
        if(montoExtraer <= saldo + acuerdo){
            saldo= saldo- montoExtraer;
        }else
            System.out.println("Saldo Insuficiente");
        
    }
    
    
}
