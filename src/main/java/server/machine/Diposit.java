/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server.machine;
import server.machine.io.Sensor;

/**
 *
 * @author oriol
 * Classe que crea un Diposit. És cridat per Menjadora.
 * Reb el id de la Menjadora.
 * Retorna a la Menjadora un Diposit amb el seu Sensor de nivell.
 */
public class Diposit {
    
    private final static int TIPUS_SENSOR = 2; //Sensor de nivell del dipòsit
    private final static double DIPOSIT_BUIT = 10.0; //Distànica sensor menjar que defineix dipòsit buit
    private final static double ALERTA_DIPOSIT = 7.0;//Distància sensor menjar llença avís carregar dipòsit
    private final static double DIPOSIT_PLE = 0.1;//Distància
    
    //VARIABLES
    private int id;
    private Sensor sensorNivell;

    public Sensor getSensorNivell() {
        return sensorNivell;
    }
    private boolean alertaDiposit;
    
    //CONSTRUCTORS
    public Diposit(Sensor sensorNivell){
        this.sensorNivell=sensorNivell;
    }
    public Diposit(){
    }
    
    public Boolean estaBuit(){
        if(sensorNivell.getValor() >= DIPOSIT_BUIT){
            return true;
        }else{
           return false; 
        }
    }
    
    public double getPercentatgeDiposit(){
        double percentatge = ((DIPOSIT_BUIT - sensorNivell.getValor())/DIPOSIT_BUIT) *100;
        return percentatge; 
    }
    //METODES
    public static Diposit addDiposit(double valorSensor){
        Sensor sensorNivell = new Sensor().addSensor(TIPUS_SENSOR, valorSensor);
        return new Diposit(sensorNivell);
    }
    
    //FUNCIONS
    public void setAlertaDiposit(){
        if(sensorNivell.getValor() > ALERTA_DIPOSIT){
            this.alertaDiposit = true;
        }
    }
    
}