/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author weimper.g.zsombor
 */
public class Ember {

    private String nev;
    private String cim;

    public Ember(String[] s) {
        this.nev = s[0];
        this.cim = s[1];
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev: " + nev + ", cim: " + cim + '}';
    }
    
    
    
}
