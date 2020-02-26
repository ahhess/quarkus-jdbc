package org.acme.datasource;

import java.io.Serializable;

/**
 * Tab
 */
public class Tab implements Serializable {

    private static final long serialVersionUID = 3630296699588311255L;

    private int a;
    private String b;

    public Tab() {
    }

    // public Tab(int a, String b) {
    //     this.a = a;
    //     this.b = b;
    // }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Tab [a=" + a + ", b=" + b + "] ";
    }

    
}