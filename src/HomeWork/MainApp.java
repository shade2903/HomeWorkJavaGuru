package HomeWork;

import HomeWork.CreditCard.CreditCard;
import HomeWork.MagicBall.MagicBall;

public class MainApp {
    public static void main(String[] args) {

        MagicBall magicBall = new MagicBall();
        magicBall.getAnswer();
        CreditCard creditCard = new CreditCard("312d2413", 1234);
        creditCard.deposit(1234 , 1000);
        creditCard.deposit(1234 , 1000);
        creditCard.withdraw(1234,500);









    }
}
