
package tarea07_tatianagarcia;

import javax.swing.JOptionPane;


public class Armamentos {
    private String nombre;
    private int peso;
    private int poder;

    public Armamentos() {
    }

    public Armamentos(String nombre, int peso, int poder) {
        this.nombre = nombre;
        this.peso = peso;
        if(poder<=10&&poder>=1){
            this.poder = poder;
        }else{
            JOptionPane.showMessageDialog(null, "Numero de poder no valido, se tomara el ultimo digito");
            this.poder=poder%10;
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Armamentos->\n Nombre: " + nombre + "\n Peso: " + peso + "\n Poder: " + poder;
    }
    
    
}
