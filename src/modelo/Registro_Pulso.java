
package modelo;


public class Registro_Pulso {
    //Atributos
    private String rango;
    private int id_persona;
    private int pulso;
    private String recomendacion;
    //Constructor

    public Registro_Pulso(String rango, int id_persona, int pulso) {
        this.rango = rango;
        this.id_persona = id_persona;
        this.pulso = pulso;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    // Metodos
    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    
    
    
    
    
    
    
}
