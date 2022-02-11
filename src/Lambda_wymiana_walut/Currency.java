package Lambda_wymiana_walut;

public enum Currency {
    EUR(4.56),
    USD(3.84),
    CHF(4.19),
    GBP(5.29),
    JPY(3.49);


    private final double exchangeRatetoPln;

    Currency(double exchangeRatetoPln) {
        this.exchangeRatetoPln = exchangeRatetoPln;
    }

    public double getExchangeRatetoPln() {
        return exchangeRatetoPln;
    }
}
