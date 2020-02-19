/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author Phil Rey
 */
public class myFunctions {
    public myFunctions(){
        try {
            loadSettings();
        } catch (Exception e) {
        }
    }
    
    public void loadSettings() throws IOException{
        try {
            File file = new File("settings.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            
            
            String st = "";
            String result="";
            while ((st = br.readLine()) != null) {
                result+=st+"@@";
            }
            String settings[] = result.split("@@");
            
            myVariables.setIpAddress("http://"+settings[0]+"/CNBHSSystem/");
            myVariables.setSchoolName(settings[1]);
            
            System.out.println(myVariables.getIpAddress());
        }catch (Exception e) {
            System.err.println("Error: "+e.getLocalizedMessage());
        }
    }
    public ImageIcon getImgIcn(String url){
        return new ImageIcon(getClass().getResource(url));
    }
}
