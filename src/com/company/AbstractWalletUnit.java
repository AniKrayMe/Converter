package com.company;

public abstract class AbstractWalletUnit {

    private double number;

    //region Constructor
    public AbstractWalletUnit(double number) {
        this.number = number;
    }

    public AbstractWalletUnit() {
    }
//endregion

    public abstract void printConverter();

    //region Getter anb Setter
    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    //endregion
}
