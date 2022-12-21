/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import server.Executavel;
import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Excel implements Executavel, Serializable{
    
    private static final long serialVersionUID = 6529685098267757690L;
    
    public Excel(){
        
    }

    public void fazer() {
        
        System.out.println("Planilha feita");
        
    }  
      
}
