
package principal;

public class Municipalidad {
    private Plan[] planes; //arrelgo de tipo plan
    private int cantidadPlanes; //lo utilizo como contador para sacar el promedio de los intereses
    
    public Municipalidad(int tamanio)//creo un constructor:
    { 
        planes = new  Plan[tamanio];
    }
    
    public void agregarPlan(Plan plan) //metodo que recibe un plan y lo pone en una posicion
    {
        
        for (int i = 0; i < planes.length; i++) {
           if(planes[i] == null)
           {
               planes[i] = plan;
               
               cantidadPlanes++;
               break;
         
           }
  
        }
    }
    /*Cantidad de planes pagados en su totalidad (es decir, que tengan tantos
       pagos recibidos como la cantidad de cuotas pactadas)*/
    
    public int cantidadPlanesPagados() {
        
        int cantidadPagados = 0;
        
        for (int i = 0; i < planes.length; i++) {
            
            Plan plan = planes[i]; 
            
            if (plan.estaPagadoTotalmente() == true){
                cantidadPagados++;
            }

        }
        
        return cantidadPagados;
        
    }
    /* Sumatoria de las deudas registradas*/
    
    public double sumatoriaDeuda(){
        
        double acumuladorDeuda = 0;
        
        for (int i = 0; i < planes.length; i++) {
            Plan plan = planes[i];
            
            acumuladorDeuda += plan.getDeuda();
            
        }
        
        return acumuladorDeuda;
        
    }
    
    /* Listado de todos los pagos efectuados por un contribuyente en particular*/
    
    public String listadoPagosContribuyente(String nombre){
        
        String listado = "";
        
        for (int i = 0; i < planes.length; i++) {
            Plan plan = planes[i];
            
            if(plan.getNombre() == nombre){
                listado = listado + plan.toString();
            }
        }
        
        return listado;
    }
    
    /* Promedio general de intereses adicionales cobrados */
    
    public double promedioIntereses(){
        
        double acumuladorIntereses = 0;
        double promIntereses = 0;
        
        for (int i = 0; i < planes.length; i++) {
            Plan plane = planes[i];
            
            acumuladorIntereses += plane.sumaInteresesCobrados();        
            
        }
        
        
        promIntereses = acumuladorIntereses / cantidadPlanes ; //aca uso el contador
        
        return promIntereses;
    }
            
            
}
