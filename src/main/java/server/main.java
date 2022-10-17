/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import gui.view.Pantalla_Principal;
import javax.swing.SwingUtilities;

/**
 *
 * @author oriol
 */
public class main {
        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Pantalla_Principal gui = new Pantalla_Principal();
            }
        });
    }
    
}
