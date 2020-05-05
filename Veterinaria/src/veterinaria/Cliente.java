/* Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un
nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una
Mascota.*/
package veterinaria;

public class Cliente {
    private int legajo;
    private String nombre;
    private int antiguedad;
    private Mascota mascota;

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cliente(int legajo, String nombre, int antiguedad, Mascota mascota) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
    }
    
    
    
}
