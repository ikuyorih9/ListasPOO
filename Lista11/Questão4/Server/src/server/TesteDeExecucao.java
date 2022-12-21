/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import objetos.Word;
import objetos.Excel;

/**
 *
 * @author Daniel
 */
public class TesteDeExecucao {
    
    public static void testar(Object teste){
        
        try{
            ((Excel)teste).fazer();
        }catch(Exception e){
            ((Word)teste).fazer();
        }
        
    }
    
}
