/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server.machine.io;

import server.Simulador;

/**
 *
 * @author oriol
 * Classe que crea un Sensor. És cridat per Menjadora i Diposit.
 * Reb el id de la Menjadora/Diposit i el tipus de Sensor.
 * Retorna un Sensor amb el seu Valor.
 */
public class Sensor {
    
    //VARIABLES
    private int id;//Per quan hi hagi sensors fisics
    private boolean dreta;
    private int tipus;//Sensor de nivell o Sensor de pes del plat
    private double valor;
    
    
    //CONSTRUCTORS
    public Sensor(int tipus, double valor){
        this.tipus=tipus;
        this.valor=valor;
    }
    public Sensor(){
    }
    
    
    //METODES
    public static Sensor addSensor(int tipus, double valor){
        //int id,tipus;
        //double valor = llegeixValor(tipus);
        
        return new Sensor(tipus, valor);
    }
    
    public double getValor(){
        return this.valor;
    }
    
    //FUNCIONS
    public void setValorSimulador(double valor){
        
        this.valor = valor;

    }
    
    
   /* public static double llegeixValor(int tipus){
        
                double valorSensor=99.9f;
                switch (tipus) {
                    case 1://tipus sensor
                        //valorSensor = ;//substituir per funció del sensor que llegeixi
                        break;
                    case 2:
                        valorSensor = Simulador.sensorNivell;
                        break;
                }
        }

    return valorSensor;
    }*/
    
}
