
package tarea07_tatianagarcia;

import javax.swing.JOptionPane;

public class Cabina {
    private int peso;
    private int num;

    public Cabina() {
    }

    public Cabina(int peso, int num) {
        this.peso = peso;
        if(num<=4){
        this.num = num;
        }else{
            JOptionPane.showMessageDialog(null, "Numero supera los limites, se establecera 4 como numero maximo");
            this.num = 4;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Cabina->\n Peso: " + peso + "\n Numero:" + num ;
    }
    
}
