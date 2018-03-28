/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.IOException;

/**
 *
 * @author admin
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String[] str = {"F:\\LAP_TRINH_GAME\\BT_Game\\project1\\image", "F:\\LAP_TRINH_GAME\\BT_Game\\project1\\output"};
            SpriteMap.join(str[0], str[1]);
            
        }
        catch(IOException ioEx){
            System.err.println(ioEx.getMessage());
        }

    }
    
}          