/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import gui.controller.Controlador_Principal;
import server.data.Dades;
import server.machine.Mascota;
import server.machine.Menjadora;


/**
 *
 * @author oriol
 * 
 * Classe que crea la Maquina. És cridat per Servidor_Menjadora.
 * Reb el id del Servidor_Menjadora.
 * Retorna una Màquina amb dues Mascotes.
 * L'atribut raccioExtra és comú per a tota la Maquina.
 */
public class Maquina {
    
    //VARIABLES
    private int id;
    private Mascota mascotaDreta, mascotaEsquerra;
    private static int raccioExtra = 10;
    private Menjadora menjadoraDreta, menjadoraEsquerra;
    private Dades dadesDreta, dadesEsquerra;
    private Controlador_Principal controlador;
    
    //CONSTRUCTORS
    public Maquina(){    
    }
    /*public Maquina(int id) {
        this.id=id;
        this.mascotaDreta=mascotaDreta;
        this.mascotaEsquerra=mascotaEsquerra;
        Menjadora menjadoraDreta, menjadoraEsquerra;
        Dades dadesDreta, dadesEsquerra;
        Controlador_Principal controlador;

        mascotaDreta = Mascota.addMascota(1);
        mascotaEsquerra = Mascota.addMascota(2);

        menjadoraDreta = Menjadora.addMenjadora(true, mascotaDreta);
        menjadoraEsquerra = Menjadora.addMenjadora(false, mascotaEsquerra);

        menjadoraDreta.setDosisDiaria(mascotaDreta.getGat(), mascotaDreta.getEdat(), mascotaDreta.getPesMascota());
        menjadoraEsquerra.setDosisDiaria(mascotaEsquerra.getGat(), mascotaEsquerra.getEdat(), mascotaEsquerra.getPesMascota());

        dadesDreta = new Dades().addDades(menjadoraDreta);
        dadesEsquerra = new Dades().addDades(menjadoraEsquerra);

        controlador = new Controlador_Principal().addControlador(menjadoraDreta, menjadoraEsquerra);
        //controlador.setMenjadoraDreta(menjadoraDreta);
        //controlador.setMenjadoraEsquerra(menjadoraEsquerra);

        //return new Maquina(id, mascotaDreta, mascotaEsquerra, menjadoraDreta, menjadoraEsquerra, raccioExtra, dadesDreta, dadesEsquerra, controlador);
    }*/
    public Maquina(int id, Mascota mascotaDreta, Mascota mascotaEsquerra, Menjadora menjadoraDreta, Menjadora menjadoraEsquerra, int raccioExtra, Dades dadesDreta, Dades dadesEsquerra, Controlador_Principal controlador){
        this.id=id;
        this.mascotaDreta=mascotaDreta;
        this.mascotaEsquerra=mascotaEsquerra;
        this.raccioExtra=raccioExtra;
        this.menjadoraDreta=menjadoraDreta;
        this.menjadoraEsquerra=menjadoraEsquerra;
        this.dadesDreta=dadesDreta;
        this.dadesEsquerra=dadesEsquerra;
        this.controlador=controlador;
    }

    public Menjadora getMenjadoraDreta() {
        return menjadoraDreta;
    }

    public Menjadora getMenjadoraEsquerra() {
        return menjadoraEsquerra;
    }
    
    
    //ACCESSORS
    public void setRaccioExtra(int raccioExtra) {
        //Pantalla Principal permet canviar aquest paràmetre
        raccioExtra = raccioExtra;
    }

    public Controlador_Principal getControlador() {
        return controlador;
    }
    

    //METODES
    public static Maquina addMaquina(int id){
        Mascota mascotaDreta, mascotaEsquerra;
        Menjadora menjadoraDreta, menjadoraEsquerra;
        Dades dadesDreta, dadesEsquerra;
        Controlador_Principal controlador;
        
        mascotaDreta = Mascota.addMascota(1);        
        mascotaEsquerra = Mascota.addMascota(2);
        
        menjadoraDreta = Menjadora.addMenjadora(true, mascotaDreta);
        menjadoraEsquerra = Menjadora.addMenjadora(false, mascotaEsquerra);
        
        menjadoraDreta.setDosisDiaria(mascotaDreta.getGat(), mascotaDreta.getEdat(), mascotaDreta.getPesMascota());
        menjadoraEsquerra.setDosisDiaria(mascotaEsquerra.getGat(), mascotaEsquerra.getEdat(), mascotaEsquerra.getPesMascota());
        
        dadesDreta = new Dades().addDades(menjadoraDreta);        
        dadesEsquerra = new Dades().addDades(menjadoraEsquerra);
             
        controlador = new Controlador_Principal().addControlador(menjadoraDreta, menjadoraEsquerra);
        //controlador.setMenjadoraDreta(menjadoraDreta);
        //controlador.setMenjadoraEsquerra(menjadoraEsquerra);
        
        return new Maquina(id, mascotaDreta, mascotaEsquerra, menjadoraDreta, menjadoraEsquerra, raccioExtra, dadesDreta, dadesEsquerra, controlador);
    }
    
    public void funcionamentMaquina(){
        menjadoraDreta.funciona();
        menjadoraEsquerra.funciona();
    }
    public void resetejaDia(){
        //Creem DataBase (Org amb 2 buckets) quan l'usuari inicia sessio per primer cop
        //dadesDreta.creaDataBase();
        
        //dadesDreta.escriuDades(menjadoraDreta.getGramsAcumulatAvui());
        //dadesEsquerra.escriuDades(menjadoraEsquerra.getGramsAcumulatAvui());
        
        //dadesDreta.llegeixDades();
        //dadesEsquerra.llegeixDades();
        
        menjadoraDreta.resetejaDia();
        menjadoraEsquerra.resetejaDia();
        controlador.escriuValorsGui();
    }
    
    //FUNCIONS
    public void donaRaccioExtra(double raccioExtra ){
        menjadoraDreta.raccioExtra(raccioExtra);
        menjadoraEsquerra.raccioExtra(raccioExtra);
    }
}
