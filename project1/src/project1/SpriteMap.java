/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author admin
 */
public class SpriteMap {
    public static void join(String inputPath, String outputPath) throws IOException{
       
        File dicrectoy = new File(inputPath);
         
        File[] f = dicrectoy.listFiles();
  
        BufferedImage sprite = ImageIO.read(f[0]);
        int width = sprite.getWidth() + sprite.getWidth();
        int height = sprite.getHeight() + sprite.getHeight();
       
        BufferedImage spriteMap = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = spriteMap.createGraphics();
        int x = 0;
        int y = 0;
        
        for(File file:f){
            sprite = ImageIO.read(file);
            g2d.drawImage(sprite, null, x, y);
            x += sprite.getWidth();
            System.out.println(x +"  " + y);
            System.out.println(width);
            if (x == width){
                x = 0;
                y = sprite.getHeight();
            }
        }
        
        ImageIO.write(spriteMap, "jpg", new File(outputPath));
    }
    
}
