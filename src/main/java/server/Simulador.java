/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import server.machine.Mascota;
import server.machine.io.Sensor;

/**
 *
 * @author oriol
 * Aquesta classe no crea cap objecte.
 */
public class Simulador {
    
    //VARIABLE
    public boolean dreta;
    public double sensorPlat_esquerra = 12.4;
    public double sensorPlat_dreta = 20.1;
    public double sensorNivell_esquerra = 2;
    public double sensorNivell_dreta = 2;
    

    public void setSensorPlat_esquerra(double sensorPlat_esquerra) {
        this.sensorPlat_esquerra = sensorPlat_esquerra;
    }

    public void setSensorPlat_dreta(double sensorPlat_dreta) {
        this.sensorPlat_dreta = sensorPlat_dreta;
    }

    public void setSensorNivell_esquerra(double sensorNivell_esquerra) {
        this.sensorNivell_esquerra = sensorNivell_esquerra;
    }

    public void setSensorNivell_dreta(double sensorNivell_dreta) {
        this.sensorNivell_dreta = sensorNivell_dreta;
    }

    public double getSensorPlat_esquerra() {
        return sensorPlat_esquerra;
    }

    public double getSensorPlat_dreta() {
        return sensorPlat_dreta;
    }

    public double getSensorNivell_esquerra() {
        return sensorNivell_esquerra;
    }

    public double getSensorNivell_dreta() {
        return sensorNivell_dreta;
    }
    
    
    //CONSTRUCTORS
    public Simulador(boolean dreta){
        this.dreta=dreta;

    }
    public Simulador(){
    }
    
    
    //METODES
    public static Simulador addSimulador(boolean dreta){
        //int id,tipus;
        return new Simulador(dreta);
    }
    
    //METODES
    public double retornaNivell(){
        if(!dreta){
            return sensorNivell_esquerra;
        }else{
            return sensorNivell_dreta;
        }
    }
    
    public double retornaPlat(){
        if(!dreta){
            return sensorPlat_esquerra;
        }else{
            return sensorPlat_dreta;
        }
    }
    
    public void mascotaMenja(Sensor plat, String nomMascota){
        int quantitatMenjada = 20;
        plat.setValorSimulador(plat.getValor() - quantitatMenjada);
        System.out.println("La mascota " + nomMascota +  " ha menjat " + quantitatMenjada + " grams");
    }
    
    public void carregaDiposit(Sensor diposit){
        
    }
}
