/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.lastsandbox.generator;

import cz.terner.lastsandbox.generator.io.YamlFiles;
import cz.terner.lastsandbox.generator.records.IRcomparator;
import cz.terner.lastsandbox.generator.records.ItemRecord;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author terner
 */
public class TemporaryApp {
    
    
    
    public static void main(String[] args) {
        Data d = new Data();
        List<ItemRecord> car1 = d.getFamsWithPrns();
        List<ItemRecord> car2 = d.getFamsWithPrns();
        
        int shoda = 0;
        
        for (ItemRecord itemRecord1 : car1) {
            for (ItemRecord itemRecord2 : car2) {
                if (itemRecord1.getPrn().equals(itemRecord2.getPrn()) && 
                        itemRecord1.getFam().equals(itemRecord2.getFam())) {
                    System.out.println("family1: " + itemRecord1.getFam() + " family2: " + itemRecord2.getFam());
                    System.out.println("prn1: " + itemRecord1.getPrn() + " prn2: " + itemRecord2.getPrn());
                    System.out.println("----------------------------------------------------");
                    shoda++;
                }
            }
        }
        System.out.println("car1 size: " + car1.size());
        System.out.println("car2 size: " + car2.size());
        System.out.println("počet shod: " + shoda);
    }
}
