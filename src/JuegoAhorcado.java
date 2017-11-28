
import java.awt.Color;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hannibal
 */
public class JuegoAhorcado {
    
    public static void dibujarAhorcado(int errores){
        
        switch(errores){
            case 0:
                System.out.println("---------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----------------");
            break;
            case 1:
                System.out.println("---------");
                System.out.println("|        |");
                System.out.println("|        ()");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----------------");
            break;
            case 2:        
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|       ()");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----------------");
            break;
            case 3:        
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|       ()");
                System.out.println("|      /|");
                System.out.println("|     / |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----------------");
            break;
            case 4:        
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|       ()");
                System.out.println("|      /|");
                System.out.println("|     / |");
                System.out.println("|      /");
                System.out.println("|     /");
                System.out.println("|");
                System.out.println("----------------");
            break;
            case 5:
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|       ()");
                System.out.println("|      /|\\");
                System.out.println("|     / | \\");
                System.out.println("|      /");
                System.out.println("|     /");
                System.out.println("|");
                System.out.println("----------------");
            break;
            case 6:
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|       ()");
                System.out.println("|      /|\\");
                System.out.println("|     / | \\");
                System.out.println("|      /\\");
                System.out.println("|     /  \\");
                System.out.println("|");
                System.out.println("----------------");
            break;
            
            default:
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|       ()");
                System.out.println("|      /|\\");
                System.out.println("|     / | \\");
                System.out.println("|      /\\");
                System.out.println("|     /  \\");
                System.out.println("|");
                System.out.println("----------------");
            break;
        }
        
    }
    
    
    public static void main (String args[]){
        
        Jugador jug1, jug2;
        PalabraSecreta SecretWord;
        Scanner sc = new Scanner(System.in);
        SecretWord = new PalabraSecreta("");

        jug1 = new Jugador("Juan");
        jug2 = new Jugador("Pepe");
        
        String palabraNueva;
        String letraNueva;
        String opcion;
        
        do{
            
            System.out.println("MENU");            
            System.out.println("1. Añadir Palabra Secreta.");
            System.out.println("2. Probar letra.");
            System.out.println("3. Probar palabra.");
            System.out.println("4. ReiniciarJuego.");
            System.out.println("5. Puntos del Jugador. ");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextLine();
            
            switch(opcion){
                case "1": 
                    System.out.println("Introduzca una palabra secreta: ");
                    SecretWord.setPalabraSecreta(sc.nextLine());
                break;
                
                case "2":
                    letraNueva = sc.nextLine();
                    if(SecretWord.ComprobarLetra(letraNueva)){
                        dibujarAhorcado(jug1.getErroresCometidos());
                        System.out.println("Letras dichas: "+SecretWord.getLetrasDichas());
                        System.out.println("Palabra secreta: "+SecretWord.getPalabraAsteriscos());
                    }
                    else{
                        jug1.setErroresCometidos(jug1.getErroresCometidos() +1);
                        dibujarAhorcado(jug1.getErroresCometidos());
                        System.out.println("Letras dichas: "+SecretWord.getLetrasDichas());
                        System.out.println("Palabra secreta: "+SecretWord.getPalabraAsteriscos());
                        if(jug1.getErroresCometidos()>=6)
                            System.out.println("¡¡¡LO SIENTO "+jug1.getNombre()+",HAS PERDIDO!!!");
                    }
                break;
                
                case "3":
                    System.out.println("Probar palabra: ");
                    palabraNueva = sc.nextLine();
                    if(SecretWord.ComprobarPalabra(palabraNueva)){
                        jug1.setJuegosGanados(jug1.getJuegosGanados()+1);
                        System.out.println("¡¡¡ENHORABUENA "+jug1.getNombre()+", HAS GANADO!!!");
                    }
                    else{
                        jug1.setErroresCometidos(6);
                        dibujarAhorcado(jug1.getErroresCometidos());
                        System.out.println("¡¡¡LO SIENTO "+jug1.getNombre()+",HAS PERDIDO!!! - La palabra secreta era: "+SecretWord.getPalabraSecreta());
                    }
                break;
                
                case "4":
                    jug1.Reiniciar();
                    System.out.println("Introduzca el nombre del jugador: ");
                    jug1.setNombre(sc.nextLine());
                    System.out.println("Introduzca una palabra secreta: ");
                    SecretWord.setPalabraSecreta(sc.nextLine());
                break;
                
                case "5":
                    System.out.println("La puntuacion de "+jug1.getNombre()+" es: "+ jug1.getJuegosGanados());
                break;
            }            
        }while(opcion.compareTo("0")!=0);
        
    }
    
}
