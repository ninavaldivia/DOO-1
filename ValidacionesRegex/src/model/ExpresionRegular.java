/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nina
 */
public class ExpresionRegular {
    private String patron;
    
    public ExpresionRegular(){
        this.patron="";
    }
    public ExpresionRegular(String patron){
        this.patron=patron;
    }
    
    public boolean esValido(String texto){
        return texto.matches(this.patron);
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }
    
    
}
