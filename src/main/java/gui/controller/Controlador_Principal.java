/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.controller;

import gui.view.Pantalla_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import server.machine.Menjadora;

import javax.swing.JLabel;

/**
 *
 * @author oriol
 */
public class Controlador_Principal implements ActionListener {
    
    private Pantalla_Principal principal = new Pantalla_Principal();
    private Menjadora menjadoraDreta, menjadoraEsquerra;
    
    
    
    /*public Controlador_Principal(Principal principal, Menjadora menjadoraDreta, Menjadora menjadoraEsquerra){
        this.principal=principal;
        this.menjadoraDreta=menjadoraDreta;
        this.menjadoraEsquerra=menjadoraEsquerra;
        
    }*/
    public Controlador_Principal(Pantalla_Principal principal, Menjadora menjadoraDreta, Menjadora menjadoraEsquerra){
        this.principal=principal;
        this.menjadoraDreta=menjadoraDreta;
        this.menjadoraEsquerra=menjadoraEsquerra;
        //for (JButton boto : menuPrincipal.getMenuButtons()) {
            //boto.addActionListener(this);
        //}
        this.setUp();
        //principal.addGui(menjadoraDreta,menjadoraEsquerra);
        //principal.setVisible(true);
    }
    public Controlador_Principal(){
        this.principal=null;
        this.menjadoraDreta=null;
        this.menjadoraEsquerra=null;
        //principal.addGui(menjadoraDreta,menjadoraEsquerra);
        //principal.setVisible(true);
    }
    public void setUp (){
        this.principal.setVisible(true);

        this.principal.raccioExtraDreta.addActionListener(this);
        
        
        //this.principal.nomMascotaDreta.enableInputMethods(true);
        //this.principal.nomMascotaDreta.getAccessibleContext();
        //this.principal.nomMascotaDreta.firePropertyChange("", 0, 0);
        //this.principal.nomMascotaDreta.addAncestorListener((AncestorListener) this);
        //this.principal.nomMascotaDreta.getAncestorListeners();
        
        //principal.limitDiariEsquerraPropertyChange(String.valueOf(this.menjadoraEsquerra.getLimitDiari()));
        //principal.limitDiariEsquerraPropertyChange("");
        
        
        //PropertyChangeListener[] listeners = new PropertyChangeListener[25];
        //listeners = principal.getPropertyChangeListeners();
        //System.out.println(listeners);
        
    }
    public static Controlador_Principal addControlador(Menjadora menjadoraDreta, Menjadora menjadoraEsquerra){
        //Principal principal ;
        //Menjadora menjadoraDreta, menjadoraEsquerra;
        Pantalla_Principal principal = new Pantalla_Principal().addGui(menjadoraDreta,menjadoraEsquerra);
        //principal.canviaLimitDiariEsquerra("");
        return new Controlador_Principal(principal, menjadoraDreta, menjadoraEsquerra);
        //principal.setVisible(true);
    }

    public void setMenjadoraDreta(Menjadora menjadoraDreta) {
        this.menjadoraDreta = menjadoraDreta;
    }

    public void setMenjadoraEsquerra(Menjadora menjadoraEsquerra) {
        this.menjadoraEsquerra = menjadoraEsquerra;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //principal.setVisible(true);
       principal.nomMascotaDreta.setText(menjadoraDreta.getMascota().getNom());
    }
    
    
}
