/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
/**
 *
 * @author Calix Gonzalez
 */
public class Fondo implements Border{
    BufferedImage fondo;
      public Fondo(){
         try  {
        URL url = new URL(getClass().getResource("/Iconos/fondo.png").toString());
        fondo = ImageIO.read(url);
    }catch (IOException ex){
    Logger.getLogger(Fondo.class.getName()).log(Level.SEVERE,null, ex);
    }    }
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
    g.drawImage(fondo,(x+(width - fondo.getWidth())/2),(y+(height - fondo.getHeight())/2),null);  
    }
       public Insets getBorderInsets(Component c){
        return new Insets (0,0,0,0);
    }
        public boolean isBorderOpaque(){
        return true;
    }    
 }
   

