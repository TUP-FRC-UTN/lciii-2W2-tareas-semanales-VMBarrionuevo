/*Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización
de un software para obtener resultados sobre sus clientes y sus respectivas
mascotas. (Suponer que cada cliente posee una sola mascota)
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un
nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una
Mascota. De la Mascota se dispone los siguientes datos: el nombre y la edad.
El software requiere cargar un número n de Clientes (este valor deberá ser cargado
por teclado). Almacenar la información de los clientes en un arreglo.
Se pide:
 Mostrar la cantidad de clientes.
 Mostrar el promedio de edad de las mascotas.
 Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.*/
package veterinaria;

import java.util.Scanner;

public class Veterinaria {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantCliente = 0;
        double promedioMascota = 0;
        int edadMascota = 0;
        int cantAntiguedad= 0;

        
        Cliente[] arregloClientes; //Declaro el arreglo de tipo Cliente (mi clase)
        
        System.out.println("Ingrese la cantidad de Clientes a cargar: ");
        cantCliente = sc.nextInt();
        sc.nextLine();
      
        arregloClientes = new Cliente[cantCliente]; //Inicializo el arreglo
        
        for (int i = 0; i < cantCliente; i++) {
            System.out.println("Ingrese el numero del Cliente: ");
            int numCliente = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Ingrese el nombre del Cliente: ");
            String nomCliente = sc.nextLine();
            
            System.out.println("Ingrese la antigueda del Cliente: ");
            int antiguedad = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Ingrese el nombre de la Mascota: ");
            String nomMascota = sc.nextLine();
            
            System.out.println("Ingrese la edad de la Mascota: ");
            int edad = sc.nextInt();
            sc.nextLine();
            
            edadMascota = edadMascota + edad;
            promedioMascota = (double)edadMascota / cantCliente;
            
            if (antiguedad >= 5){
                cantAntiguedad = cantAntiguedad + 1;            
            }
                    
            Mascota mascota = new Mascota( nomMascota, edad);
            
            Cliente cli= new Cliente(numCliente, nomCliente, antiguedad, mascota);
            
            arregloClientes[i] = cli; // guardo cada cliente en la posición i del arreglo.

        }
                          
            System.out.println("La cantidad de Clientes son: " + cantCliente);
            System.out.println("La edad promedio de Mascota es: " + promedioMascota);
            System.out.println("La cantidad de clientes con antiguedad mayor o igual a 5 años son: " + cantAntiguedad);
            


    }
    
}
