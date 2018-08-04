/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.lastsandbox.generator.records;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author terner
 */
public class ItemRecord {
    private String prn;
    private String fam;

    public ItemRecord(String fam, String prn) {
        this.prn = prn;
        this.fam = fam;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    

    
}
