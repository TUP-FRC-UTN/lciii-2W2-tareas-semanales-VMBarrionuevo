package principal;

public class Plan {
    private String nombre;
    private double deuda;
    private int cuotas;
    private Pago [] pagos;// vamos a tener un arreglo/vector de pagos

    public Plan(String nombre, double deuda, int cuotas) { // no incluyo en el constructor el atributo de arreglo de pagos
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        pagos = new Pago [cuotas];//las cuotas van a ser el tamaño maximo de mi plan        
        //estoy inicializando de entrada el vector para no olvidarme.
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }
        
    public void agregarPago(Pago pago) //metodo que recibe un pago y lo pone en una posicion
    {
        for (int i = 0; i < pagos.length; i++) {
           if(pagos[i] == null)
           {
               pagos[i] = pago;
               break;
           }
            
        }
    }
    

    public boolean estaPagadoTotalmente()//metodo que no recibe parametros, recorre el vector de pagos y busca espacios vacios.
    {
        boolean estaPago = true; //establezco una bandera que arranque en verdadero, dsp la retorno al final del metodo:
        
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i] == null)
            {
                estaPago = false;
                break;
            }            
        }        
        return estaPago;    
    }
    
    public String listadoPagos(){
         String listado = "";
        
        for (int i = 0; i < pagos.length; i++) {
            Pago pago = pagos[i];
            
            listado = listado+pago.toString();     
  
        }
        
        return listado;
    }
    
    public double sumaInteresesCobrados()
    {
        double sumaIntereses = 0;
        for (int i = 0; i < pagos.length; i++) {
            if(pagos [i] != null )
            {
                if(pagos[i].getDemora() > 0)
                
                    sumaIntereses += pagos[i].getDemora() * pagos[i].getInteresesAdicionales() * pagos[i].getImporte(); //devuelve solamente el interes
            }
            
        }
        
        return sumaIntereses;
    
    }
         
}
