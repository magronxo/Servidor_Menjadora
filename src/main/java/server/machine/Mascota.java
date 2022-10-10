/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server.machine;


import java.util.Scanner;
import server.machine.Menjadora;

/**
 *
 * @author oriol
 * Classe que crea les Mascotes. És cridat per Maquina.
 * Reb el id de la Maquina.
 * Demana les característiques de la Mascota.
 * Retorna una Mascota amb la seva Menjadora assignada i configurada.
 */
public class Mascota {
    
    public final static Scanner DADES = new Scanner(System.in);
    
    //VARIABLES
    private String nom;
    private int id;
    private boolean gat;

    
    private int edat;
    private float pesMascota;
    
    //CONSTRUCTORS
    public Mascota(int id,String nom, String gatGos, int edat, float pesMascota){
        this.id=id;
        this.nom=nom;
        if(gatGos.equalsIgnoreCase("gat") || gatGos.equalsIgnoreCase("1")){
            this.gat = true;
        }else{
            this.gat = false;
        }
        this.edat=edat;
        this.pesMascota=pesMascota; 
    }
    
    //ACCESSORS
    public String getNom() {
        return nom;
    }
    
    public boolean getGat() {
        return gat;
    }
       
    
    //METODES
    public static Mascota addMascota(int id){

        String nom;
        //Boolean gatGos;
        String gatGos;
        int edat;
        float pesMascota;
        Menjadora menjadora;
        
        //Demana nom, gat/gos, edat i pes de la Mascota
        System.out.println("MASCOTA ID -->"+ id);
        System.out.println("Nom de la mascota?");
        nom = DADES.next();
        System.out.println("Gat o gos?");
        gatGos = DADES.next();
        System.out.println("Edat?");
        edat = DADES.nextInt();
        System.out.println("Pes?");
        pesMascota = DADES.nextFloat();
                
        return new Mascota(id, nom, gatGos, edat, pesMascota);
    }

    public int getEdat() {
        return edat;
    }

    public float getPesMascota() {
        return pesMascota;
    }

    
    public void esborraMascota(){
        //per a poder crear una de nova al lloc de l'esborrada
    }
    
    ///////////GUI
    /*Pantalla configuració Mascota
    Es demana quan s'accedeix per primer cop i es pot modificar
    - Es demana les variables de la classe
    - Botons Cancela, Esborra i Accepta
    - Botó accepta calcula, introdueix i informa de que s'han inserit els paràmetres recomanats i que es poden modificar.
        **El limitDiari i raccionsAlDia es podran modificar a la Pantalla Principal**
    */
    
}
