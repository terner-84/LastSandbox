/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.lastsandbox.generator.records;

import java.util.Comparator;

/**
 *
 * @author terner
 */
public class IRcomparator implements Comparator<ItemRecord> {

    @Override
    public int compare(ItemRecord ir1, ItemRecord ir2) {
        return ir1.getPrn().compareTo(ir2.getPrn());
    }
    
}
