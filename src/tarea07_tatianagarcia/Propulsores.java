
package tarea07_tatianagarcia;


public class Propulsores {
    private int peso;
    private String material;
    private int velocidad;

    public Propulsores() {
    }

    public Propulsores(int peso, String material, int velocidad) {
        this.peso = peso;
        this.material = material;
        this.velocidad = velocidad;
    }
    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Propulsores->\n Peso: " + peso + "\n Material: " + material + "\n Velocidad: " + velocidad;
    }
    
}
