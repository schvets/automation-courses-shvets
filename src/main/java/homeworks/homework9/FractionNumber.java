package main.java.homeworks.homework9;

public class FractionNumber {
    private int nominator;
    private int denominator;

//    public FractionNumber(int a, int b) {
//        this.nominator = a;
//        this.denominator = b;
//    }



    public FractionNumber plus(FractionNumber num) {
        // 1/2 + 1/4 = 1*4 + 1*2  / 4 * 2
        int nom = this.nominator * num.denominator+ num.nominator * this.denominator;
        int deNom = this.denominator * num.denominator;
        return new FractionNumber();
    }



//    public FractionNumber minus(FractionNumber num) {
//        int nom = this.nominator * num.getDenominator() - num.getNominator() * this.getDenominator();
//        int deNom = this.denominator * num.getDenominator();
//        return new FractionNumber(nom, deNom);
//    }
//
//    public FractionNumber multiply(FractionNumber num) {
//        int nom = this.nominator * num.getNominator();
//        int deNom = this.denominator * num.getDenominator();
//        return new FractionNumber(nom, deNom);
//    }
//
//    public FractionNumber derive(FractionNumber num) {
//        int nom = this.nominator * num.getDenominator();
//        int deNom = this.denominator * num.getNominator();
//        return new FractionNumber(nom, deNom);
//    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        if(nominator == 0){
            System.out.println("unable to set as 0");
        }
        this.nominator = nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return nominator + "/" + denominator;
    }


}
