/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemas;
import javax.swing.JFrame;
import sistemas.alumnosGUI.LOGIN;

/**
 *
 * @author Usuario
 */
public class SISTEMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        LOGIN lg = new LOGIN();
        
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lg.setVisible(true);
    }
    
}
