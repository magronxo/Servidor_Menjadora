/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package server;

import session.Compte;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static server.Maquina.addMaquina;

/**
 *
 * @author oriol
 * 
 * 
 * Crea les Maquines passant-li el id
 */
public class Servidor_Menjadora {
    
    private static int id = 1;
    private static boolean sortirPrograma = false;


    //CONSTRUCTOR
    public Servidor_Menjadora(int id){
        this.id=id;
    }

    public static void main(String[] args) {

        //Reb la connexió
        //Registra el compte -->Pantalla
        //Crea una màquina per al compte registrat
        
        //Autentica l'usuari -->Pantalla
        //Logout -->Pantalla
        
        //Canvi de contrasenya -->Pantalla
        //Esborra el compte -->Pantalla
        
        //DESENVOLUPADORS
        //Llistat de comptes? -->Consola
        
        //arrays de maquines i comptes
        //ArrayList<Compte> comptes = new ArrayList<Compte>();
        ArrayList<Maquina> maquines = new ArrayList<Maquina>();
        
        //Compte compte = new Compte();
        
        maquines.add(new Maquina().addMaquina(1));
        int horesExecucio = 0;
        while(!sortirPrograma){
            for (Maquina maquina : maquines){
                maquina.funcionamentMaquina();
                horesExecucio++;
                System.out.println("Son les "+ horesExecucio);
                if(horesExecucio >= 24){
                    maquina.resetejaDia();
                    horesExecucio = 0;
                }
            }
            try {
                TimeUnit.SECONDS.sleep(5);     
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Servidor_Menjadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
