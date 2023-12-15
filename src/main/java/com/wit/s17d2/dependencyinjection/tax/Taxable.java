package com.wit.s17d2.dependencyinjection.tax;

public interface Taxable {
    double getSimpleTaxRate();
    double getMiddleTaxRate();
    double getUpperTaxRate();
}