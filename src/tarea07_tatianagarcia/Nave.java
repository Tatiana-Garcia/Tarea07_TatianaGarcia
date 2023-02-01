
package tarea07_tatianagarcia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class Nave {
    int serie;
    String nombre;
    Cabina c;
    ArrayList<Alas>ala = new ArrayList();
    ArrayList <Propulsores> propulsor= new ArrayList();
    int numero;
    Color color;
    Date fecha;

    public Nave() {
    }

    public Nave(int serie, String nombre, Cabina c, int numero, Color color, Date fecha) {
        this.serie = serie;
        this.nombre = nombre;
        this.c = c;
        this.numero = numero;
        this.color = color;
        this.fecha = fecha;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cabina getC() {
        return c;
    }

    public void setC(Cabina c) {
        this.c = c;
    }

    public ArrayList<Alas> getAla() {
        return ala;
    }

    public void setAla(ArrayList<Alas> ala) {
        if(ala.size()<=4){
            this.ala = ala;
        }else{
            JOptionPane.showMessageDialog(null, "Alas en punto maximo");
        }
    }

    public ArrayList<Propulsores> getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(ArrayList<Propulsores> propulsor) {
        
        if(propulsor.size()<=4){
            this.propulsor = propulsor;
        }else{
            JOptionPane.showMessageDialog(null, "Alas en punto maximo");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String al = "No contiene alas";
        String prop = "No tiene propulsores";
        if(!ala.isEmpty()){
            al = ala.toString();
        }
        if(!propulsor.isEmpty()){
            prop= propulsor.toString();
        }
        return "Nave:\n Serie:" + serie + "\n Nombre:" + nombre + "\n Cabina: " + c + "\n Ala:" + al + "\n Propulsor: " + prop + "\n Numero: " + numero + "\n Color: " + color + "\n Fecha: " + fecha;
    }
    
}
