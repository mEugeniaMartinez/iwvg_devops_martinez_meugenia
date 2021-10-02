package es.upm.miw.iwvg_devops.code;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public boolean isProper(){
        return this.getNumerator() < this.getDenominator();
    }

    public boolean isImproper(){
        return this.getNumerator() > this.getDenominator();
    }

    public boolean isEquivalent(Fraction fraction){
        return this.numerator * fraction.denominator ==
                this.denominator * fraction.numerator;
    }

    public boolean isNegative() {
        return this.numerator < 0 || this.denominator < 0;
    }

    public int mcd(int number1, int number2){
        if (number2 == 0) return number1;
        return mcd(number2, number1 % number2);
    }

    public Fraction simplify(){
        int mcd = mcd(this.numerator, this.denominator);
        this.numerator = this.numerator / mcd;
        this.denominator = this.denominator / mcd;
        return this;
    }

    public Fraction add(Fraction fraction){
        int resultNumerator = this.numerator * fraction.denominator +
                fraction.numerator * this.denominator;
        int resultDenominator = this.denominator * fraction.denominator;
        return new Fraction(resultNumerator, resultDenominator).simplify();
    }

    public Fraction subtract(Fraction fraction){
        int resultNumerator = this.numerator * fraction.denominator -
                fraction.numerator * this.denominator;
        int resultDenominator = this.denominator * fraction.denominator;
        return new Fraction(resultNumerator, resultDenominator).simplify();
    }

    public Fraction multiply(Fraction fraction){
        return new Fraction(this.numerator * fraction.numerator,
                this.denominator * fraction.denominator).simplify();
    }

    public Fraction divide(Fraction fraction){
        return new Fraction(this.numerator * fraction.denominator,
                this.denominator * fraction.numerator).simplify();
    }

}
