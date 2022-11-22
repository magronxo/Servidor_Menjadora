/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.controller;

import gui.view.Pantalla_Configuracio;
import server.machine.Mascota;
import server.machine.Menjadora;

/**
 *
 * @author oriol
 */
public class Controlador_Configuracio {
    
    private static Pantalla_Configuracio confScreen;
    private static Menjadora menjadoraDreta, menjadoraEsquerra;
    private static Mascota mascotaDreta =  new Mascota(true);
    private static Mascota mascotaEsquerra =  new Mascota(false);
    
    
        
    public Controlador_Configuracio(Pantalla_Configuracio confScreen, Menjadora menjadoraDreta, Menjadora menjadoraEsquerra){
        this.confScreen=confScreen;
        this.menjadoraDreta=menjadoraDreta;
        this.menjadoraEsquerra=menjadoraEsquerra;
    }
    public Controlador_Configuracio(){
        this.confScreen=null;
        this.menjadoraDreta=null;
        this.menjadoraEsquerra=null;
    }
    
    //METODES
    public Controlador_Configuracio addControlador(Pantalla_Configuracio confScreen,Menjadora menjadoraDreta, Menjadora menjadoraEsquerra){
        
        return new Controlador_Configuracio(confScreen, menjadoraDreta, menjadoraEsquerra);
    }
    
    public void setejaPantallaConfiguracio(){
        
        confScreen.getEdatMascotaDreta().setText(String.valueOf(menjadoraDreta.getMascota().getEdat()));
        confScreen.getEdatMascotaEsquerra().setText(String.valueOf(menjadoraEsquerra.getMascota().getEdat()));
        
        confScreen.getPesMascotaDreta().setText(String.valueOf(menjadoraDreta.getMascota().getPesMascota()));
        confScreen.getPesMascotaEsquerra().setText(String.valueOf(menjadoraEsquerra.getMascota().getPesMascota()));

        confScreen.getLimitDiariDretaText().setText(String.valueOf(menjadoraDreta.getLimitDiari()));       
        confScreen.getLimitDiariEsquerraText().setText(String.valueOf(menjadoraEsquerra.getLimitDiari()));      
        confScreen.getRaccionsDiariesDretaText().setText(String.valueOf(menjadoraDreta.getLimitRaccionsDia()));
        confScreen.getRaccionsDiariesEquerraText().setText(String.valueOf(menjadoraEsquerra.getLimitRaccionsDia()));
        
        confScreen.getAlertaDipositDretaText().setText(String.valueOf(menjadoraDreta.getDiposit().getValorAlertaDiposit()));
        confScreen.getAlertaDipositEsquerraText().setText(String.valueOf(menjadoraEsquerra.getDiposit().getValorAlertaDiposit()));
     
    }
    
    public void editaMascota(){

        String nomDreta,nomEsquerra;
        boolean gatDreta, gatEsquerra;
        int edatDreta, edatEsquerra;
        double pesDreta, pesEsquerra;

        nomDreta = mascotaDreta.getNom();
        nomEsquerra = mascotaEsquerra.getNom();
        
        gatDreta = mascotaDreta.getGat();
        gatEsquerra = mascotaEsquerra.getGat();
        
        edatDreta = mascotaDreta.getEdat();
        edatEsquerra = mascotaEsquerra.getEdat();
        
        pesDreta = mascotaDreta.getPesMascota();
        pesEsquerra = mascotaEsquerra.getPesMascota();
        
        menjadoraDreta.getMascota().actualitzaMascota(nomDreta, gatDreta, edatDreta, pesDreta);
        menjadoraEsquerra.getMascota().actualitzaMascota(nomEsquerra, gatEsquerra, edatEsquerra, pesEsquerra);
                
        menjadoraDreta.setDosisDiaria(gatDreta, edatDreta, pesDreta);
        menjadoraEsquerra.setDosisDiaria(gatEsquerra, edatEsquerra, pesEsquerra);      
    }
    

    public void setejaLimitsDiaris(){
        
        try{
            int limitDreta = (int)Double.parseDouble(confScreen.getLimitDiariDretaText().getText());
            int limitEsquerra = (int)Double.parseDouble(confScreen.getLimitDiariEsquerraText().getText());
            int limitRaccionsDreta = Integer.valueOf(confScreen.getRaccionsDiariesDretaText().getText());
            int limitRaccionsEsquerra = Integer.valueOf(confScreen.getRaccionsDiariesEquerraText().getText());
            
            menjadoraDreta.setLimitDiari(limitDreta);
            menjadoraEsquerra.setLimitDiari(limitEsquerra);
        
            menjadoraDreta.setRaccionsAlDia(limitRaccionsDreta);
            menjadoraEsquerra.setRaccionsAlDia(limitRaccionsEsquerra);
            
            menjadoraDreta.getDiposit().setValorAlertaDiposit((int)Double.parseDouble(confScreen.getAlertaDipositDretaText().getText()));
            menjadoraEsquerra.getDiposit().setValorAlertaDiposit((int)Double.parseDouble(confScreen.getAlertaDipositEsquerraText().getText()));
            
        }catch(NumberFormatException ex){
            System.err.println("\t\t\t ERROR!! Límits Menjadora invàlids !!!!");
        }
        
        
        //menjadoraDreta.setDosisDiaria(limitDreta, limitRaccionsDreta);
        //menjadoraEsquerra.setDosisDiaria(limitEsquerra, limitRaccionsEsquerra);
        
    }
    //ACCESSORS

    public static Pantalla_Configuracio getConfScreen() {
        return confScreen;
    }

    public static Menjadora getMenjadoraDreta() {
        return menjadoraDreta;
    }

    public static Menjadora getMenjadoraEsquerra() {
        return menjadoraEsquerra;
    }

    public Mascota getMascotaDreta() {
        return mascotaDreta;
    }

    public Mascota getMascotaEsquerra() {
        return mascotaEsquerra;
    }

    public static void setConfScreen(Pantalla_Configuracio confScreen) {
        Controlador_Configuracio.confScreen = confScreen;
    }

    public static void setMenjadoraDreta(Menjadora menjadoraDreta) {
        Controlador_Configuracio.menjadoraDreta = menjadoraDreta;
    }

    public static void setMenjadoraEsquerra(Menjadora menjadoraEsquerra) {
        Controlador_Configuracio.menjadoraEsquerra = menjadoraEsquerra;
    }

    
    
}
