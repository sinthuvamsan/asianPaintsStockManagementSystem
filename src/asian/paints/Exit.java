/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Exit {
    static JButton exit=new JButton("Exit");  //creating and initilizing button
    Exit(){
    exit.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        System.exit(0);//total close
    }  
    });  
}
}
 