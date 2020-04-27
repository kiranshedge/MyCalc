/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.CalcOperation;

/**
 *
 * @author pcc
 */
public class CalcService {
    int res=0;

    /**
     *
     * @param op
     * @return
     */
    
    public int calculate(int a, int b, String c) {
        switch (c) {
            case "+":
                res=a+b;
                break;
            case "-":
                res=a-b;
                break;
            case "*":
                res=a*b;
                break;
            default:
                res=a/b;
                break;
        }
     return res;
    }
    
}
