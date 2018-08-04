/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.lastsandbox.generator;

import cz.terner.lastsandbox.generator.records.ItemRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

/**
 *
 * @author terner
 */
public class Data {
    
    private static final Logger LOGGER = Logger.getLogger(Data.class.getName());
    
    private Random rnd;
    private Set<String> families;
    private char[] fam;
    private String[] poleStringu;
    private List<ItemRecord> carList;
    
    public Data() {
        families = new TreeSet<>();
        rnd = new Random();
        fam = new char[3];
        poleStringu = new String[5];
        genFams(3, 200);
    }
    
    
    private Set<String> genFams(int lenFamily, int numberFamilies) {
        
        String family = "";
        char lastChar = 0, currentChar = 0;
        
        for (int i = 0; i < numberFamilies; i++) {
            for (int j = 0; j < lenFamily; j++) {
                do {            
                    currentChar = (char) (rnd.nextInt(26) + 65);
                } while (Character.compare(currentChar, lastChar) == 0);
                lastChar = currentChar;
                family += currentChar;
            }
            families.add(family);
            lastChar = 0;
            family = "";
        }
        return families;
    }
    
    private String genPrn() {
        String prn = "+";
        char lastChar = 0, currentChar = 0;
        
        for (int j = 0; j < 3; j++) {
            do {            
                currentChar = (char) (rnd.nextInt(3) + 65);
            } while (Character.compare(currentChar, lastChar) == 0);
            lastChar = currentChar;
            prn += currentChar;
            }
        return prn;
    }
    
    public List<ItemRecord> getFamsWithPrns() {
        carList = new ArrayList<>();
        
        for (String family : families) {
            carList.add(new ItemRecord(family, genPrn()));
        }
        return carList;
    }
}
