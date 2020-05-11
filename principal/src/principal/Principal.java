/*
5. En una MUNICIPALIDAD otorgan planes de pagos a los contribuyentes que adeudan
impuestos. 
De cada PLAN se conoce el nombre del contribuyente, el total de la deuda,
la cantidad de cuotas y una lista de las cuotas pagadas.
A su vez, cada vez que un deudor efectúa un pago se registran los datos
correspondientes a la operación. 
De cada PAGO se conoce la demora, el importe pagado y el importe de intereses adicionales. 
Cuando el pago se realiza el día del
vencimiento o antes, la demora equivale a 0 y en caso contrario a la cantidad de días
transcurridos entre el vencimiento y el pago. Cuando el pago se realiza en fecha, no
se cobran intereses adicionales, pero si hay demora se le cobra un 0,5 % del importe
de la cuota por día.
La municipalidad necesita un software que le permita registrar los datos de todos los
planes emitidos y de los pagos recibidos. Asimismo el software debe poder calcular
el importe de los intereses adicionales a partir de la cantidad de días de demora.
Se debe desarrollar un programa en Java que solicite por teclado los datos de los
planes y de los pagos y luego de finalizada la carga informe:

Cantidad de planes pagados en su totalidad (es decir, que tengan tantos
pagos recibidos como la cantidad de cuotas pactadas)
 Sumatoria de las deudas registradas
 Listado de todos los pagos efectuados por un contribuyente en particular
 Promedio general de intereses adicionales cobrados */
package principal;

public class Principal {


    public static void main(String[] args) {
        int tamanio = 3;
        Municipalidad muni = new Municipalidad(tamanio);
        
       
        String contribuyente = "Victoria";
        //carga de datos por parte del usuario:
        Plan p = new Plan("victoria", 100,3);//objeto plan
        
        muni.agregarPlan(p);//agregamos el objeto plan al vector
         
        System.out.println("La cantidad de planes pagados totalmente es de: " + muni.cantidadPlanesPagados());
        System.out.println("La sumatoria de la deuda registrada de la totalidad de planes es de : " + muni.sumatoriaDeuda());
        System.out.println("Lista de todos los pagos efectuados por el contribuyente " + contribuyente +  ":" + muni.listadoPagosContribuyente(contribuyente));
        System.out.println("El promedio de intereses pagados por los contribuyentes es de " + muni.promedioIntereses());
    }
    
}
