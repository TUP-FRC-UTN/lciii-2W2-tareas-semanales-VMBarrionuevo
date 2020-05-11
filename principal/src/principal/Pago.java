
package principal;

class Pago {
    private int demora;
    private double importe;
    private double interesesAdicionales; 

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setInteresesAdicionales(double interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }

    public int getDemora() {
        return demora;
    }

    public double getImporte() {
        return importe;
    }

    public double getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public Pago(int demora, double importe, double interesesAdicionales) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }

    
 public String toString(){
     return "La demora es: " + demora + ". Su importe es: " + importe + ". El interes adcional es: " + interesesAdicionales;
 }
}

