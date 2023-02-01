
package tarea07_tatianagarcia;

import javax.swing.JOptionPane;

public class Alas {
    private int peso;
    private int longitud;
    private Armamentos a;

    public Alas() {
    }

    public Alas(int peso, int longitud, Armamentos a) {
        
        this.longitud = longitud;
        this.a = a;
        int total = a.getPeso()+peso;
        if(total<=200){
            this.peso = peso;
        }else{
            JOptionPane.showMessageDialog(null, "Hay una sobrecarga con las alas, se reducira el peso quitando algunos elementos");
            this.peso = total-a.getPeso();
            a.setPeso(0);
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Armamentos getA() {
        return a;
    }

    public void setA(Armamentos a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Alas->\n Peso=" + peso + "\n Longitud: " + longitud + "\n Armamentos: " + a + '}';
    }
    
}
