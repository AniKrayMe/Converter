package com.company.currency;

import com.company.AbstractWalletUnit;

public class Ruble extends AbstractWalletUnit {
    @Override
    public void printConverter() {
        System.out.println(getNumber());

    }
}
