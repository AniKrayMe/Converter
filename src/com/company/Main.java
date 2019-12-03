package com.company;

import com.company.Converters.*;
import com.company.currency.*;

public class Main {

    public static void main(String[] args) {
        //region Converters
        Converter dollarConverter = new DollarConverter();
        Converter dramConverter = new DramConverter();
        Converter euroConverter = new EuroConverter();
        Converter rubleConverter = new RubleConverter();
        Converter poundSterlingConverter = new PoundSterlingConverter();
        Dollar dollar = new Dollar();
        Dram dram = new Dram();
        Euro euro = new Euro();
        PoundSterling poundSterling = new PoundSterling();
        Ruble ruble = new Ruble();
        //endregion

        poundSterling.setNumber(10);
        euro.setNumber(10);
        dram.setNumber(10000);
        dollar.setNumber(10);
        ruble.setNumber(2000);

        //region Dollar Converter
        AbstractWalletUnit convertDramToDollar = dollarConverter.convert(dram);
        AbstractWalletUnit convertEuroToDollar = dollarConverter.convert(euro);
        AbstractWalletUnit convertRubleToDollar = dollarConverter.convert(ruble);
        AbstractWalletUnit convertPoundSterlingToDollar = dollarConverter.convert(poundSterling);
        convertDramToDollar.printConverter();
        convertEuroToDollar.printConverter();
        convertPoundSterlingToDollar.printConverter();
        convertRubleToDollar.printConverter();
        //endregion

        //region Dram Converter
        AbstractWalletUnit convertDollarToDram = dramConverter.convert(dollar);
        AbstractWalletUnit convertEuroToDram = dramConverter.convert(euro);
        AbstractWalletUnit convertRubleToDram = dramConverter.convert(ruble);
        AbstractWalletUnit convertPoundSterlingToDram = dramConverter.convert(poundSterling);
        convertDollarToDram.printConverter();
        convertEuroToDram.printConverter();
        convertPoundSterlingToDram.printConverter();
        convertRubleToDram.printConverter();
        //endregion

        //region Euro Converter

        AbstractWalletUnit convertDramToEuro = euroConverter.convert(dram);
        AbstractWalletUnit convertDollarToEuro = euroConverter.convert(dollar);
        AbstractWalletUnit convertRubleToEuro = euroConverter.convert(ruble);
        AbstractWalletUnit convertPoundSterlingToEuro = euroConverter.convert(poundSterling);
        convertDramToEuro.printConverter();
        convertDollarToEuro.printConverter();
        convertPoundSterlingToEuro.printConverter();
        convertRubleToEuro.printConverter();
        //endregion

        //region Pound Sterling Converter

        AbstractWalletUnit convertDramToPoundSterling = poundSterlingConverter.convert(dram);
        AbstractWalletUnit convertDollarToPoundSterling = poundSterlingConverter.convert(dollar);
        AbstractWalletUnit convertRubleToPoundSterling = poundSterlingConverter.convert(ruble);
        AbstractWalletUnit convertEuroToPoundSterling = poundSterlingConverter.convert(euro);
        convertDramToPoundSterling.printConverter();
        convertDollarToPoundSterling.printConverter();
        convertEuroToPoundSterling.printConverter();
        convertRubleToPoundSterling.printConverter();
//endregion

        //region Ruble Converter

        AbstractWalletUnit convertDollarToRuble = rubleConverter.convert(dollar);
        AbstractWalletUnit convertEuroToRuble = rubleConverter.convert(euro);
        AbstractWalletUnit convertDramToRuble = rubleConverter.convert(ruble);
        AbstractWalletUnit convertPoundSterlingToRuble = rubleConverter.convert(poundSterling);
        convertDollarToRuble.printConverter();
        convertEuroToRuble.printConverter();
        convertPoundSterlingToRuble.printConverter();
        convertDramToRuble.printConverter();
        //endregion
    }
}
