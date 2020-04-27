/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pcc
 */
public class CalcOperation {
    private int v1;
    private int v2;
    private String ch;

    public String getChoice() {
        return ch;
    }

    public void setChoice(String ch) {
        this.ch = ch;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }
   
}
