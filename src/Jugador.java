

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hannibal
 */
public class Jugador {

    private String nombre;
    private int ErroresCometidos;
    private int JuegosGanados;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.ErroresCometidos = 0;
        this.JuegosGanados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getErroresCometidos() {
        return ErroresCometidos;
    }

    public void setErroresCometidos(int ErroresCometidos) {
        this.ErroresCometidos = ErroresCometidos;
    }

    public int getJuegosGanados() {
        return JuegosGanados;
    }

    public void setJuegosGanados(int JuegosGanados) {
        this.JuegosGanados = JuegosGanados;
    }
    
    public void Reiniciar(){
        
        this.ErroresCometidos=0;
        this.JuegosGanados=0;
        
    }
    
    
    
    
}
