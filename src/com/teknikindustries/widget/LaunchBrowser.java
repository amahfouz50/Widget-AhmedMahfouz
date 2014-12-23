/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknikindustries.widget;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author AhmedMahfouz
 */
public class LaunchBrowser {
    public void LaunchFacebook(){
        try {
            Desktop.getDesktop().browse(URI.create("www.facebook.com/a.mahfouz50"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is Message "+ e);
        }
    }
     public void LaunchTwitter(){
        try {
            Desktop.getDesktop().browse(URI.create("www.twitter.com/a7medmahfouz"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is Message "+ e);
        }
    }
      public void LaunchAmazon(){
        try {
            Desktop.getDesktop().browse(URI.create("www.amazon.com"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is Message "+ e);
        }
    }
       public void LaunchYoutube(){
        try {
            Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is Message "+ e);
        }
    }
    
}
