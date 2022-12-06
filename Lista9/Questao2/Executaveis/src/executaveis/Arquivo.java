/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaveis;
import java.io.File;
import java.io.FilenameFilter;
/**
 *
 * @author 12745229
 */
public class Arquivo implements FilenameFilter {
    private String tipoArq;
    
    Arquivo(String tipoArq) {
        this.tipoArq = tipoArq;
    }
    
    @Override
    public boolean accept(File arq, String nome) {
        return arq.isFile() && nome.endsWith(tipoArq);
    }
}
