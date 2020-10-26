package infrastusture.generators;

public class CreditCard {
    public CreditCardType cardType;
    public String number;
    public String cvvCode;
    public String expireDate;


    public CreditCard(CreditCardType cardType, String number, String cvvCode, String expireDate) {
        this.cardType = cardType;
        this.number = number;
        this.cvvCode = cvvCode;
        this.expireDate = expireDate;
    }

    public enum CreditCardType {
        MASTERCARD,
        MAESTRO ,
        VISA
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardType=" + cardType +
                ", number='" + number + '\'' +
                ", cvvCode='" + cvvCode + '\'' +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }
}
