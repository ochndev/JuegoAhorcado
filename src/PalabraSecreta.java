/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hannibal
 */
public class PalabraSecreta {
    
    private String palabraSecreta;
    private String palabraAsteriscos;
    private String palabraNueva;
    private String letrasDichas;

    public String getLetrasDichas() {
        return letrasDichas;
    }

    public void setLetrasDichas(String letrasDichas) {
        this.letrasDichas = letrasDichas;
    }
    
    public PalabraSecreta(String palabraSecreta) {
        
        this.palabraSecreta = palabraSecreta;
        this.letrasDichas = "";
        this.palabraAsteriscos = "";
        
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
        for(int i=0; i<palabraSecreta.length(); i++)
             palabraAsteriscos = palabraAsteriscos + "*";
        for(int i=0; i<100; i++)
            System.out.println("");
        this.letrasDichas="";
        this.palabraNueva="";
    }

    public String getPalabraAsteriscos() {
        return palabraAsteriscos;
    }

    public void setPalabraAsteriscos() {
        
        String palabraAux = "";
        
        for(int j = 0; j< palabraSecreta.length(); j++)
        {            
            if(letrasDichas.lastIndexOf((int)palabraSecreta.charAt(j))!=-1){            
                palabraAux = palabraAux+palabraSecreta.charAt(j);            
            }
            else
            {
                palabraAux = palabraAux+"*";
            }
        }
        
        this.palabraAsteriscos = palabraAux;
    }
    
    public boolean ComprobarPalabra(String palabraNueva){
       this.palabraNueva = palabraNueva;
       return(palabraSecreta.compareToIgnoreCase(this.palabraNueva)==0);
    }
    
    public boolean ComprobarLetra(String letraNueva){
        
        boolean existeletra = false;
        this.letrasDichas = this.letrasDichas + letraNueva;
        
        for(int i = 0 ; i < palabraSecreta.length(); i++)
                if(palabraSecreta.charAt(i) == letraNueva.charAt(0))
                    existeletra = true;
        
        setPalabraAsteriscos();
        return (existeletra);
    }

    public String getPalabraNueva() {
        return palabraNueva;
    }

    public void setPalabraNueva(String palabraNueva) {
        this.palabraNueva = palabraNueva;
    }
    
    
}
