/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.lastsandbox.generator.io;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author terner
 */
public class YamlFiles {
    
    private static final Logger LOGGER = Logger.getLogger(YamlFiles.class.getName());
    
    private YamlWriter yw;
    private YamlReader yr;
    private String fileName;

    public YamlFiles(String fileName) {
        this.fileName = fileName;
    }
    
    public void writeFile(Object o) {
        try {
            yw = new YamlWriter(new FileWriter(fileName));
            yw.write(o);
            yw.close();
        } catch (IOException ex) {
            
        }
    }
    
    public Set<String> loadFile(String fileLoad) {
        Set<String> myset = null;
        try {
            yr = new YamlReader(new FileReader(fileLoad));
            Object o = yr.read();
            yr.close();
            myset = (Set) o;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, null, e);
        }
        return myset;
    }
}
