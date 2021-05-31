package HomeWork.CreditCard;

public class CreditCard {
    private String number;
    private int pinCode;
    private double balance;
    private double limit;
    private double loanDebt;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        limit = limit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(double loanDebt) {
        this.loanDebt = loanDebt;
    }

    public CreditCard(String number, int pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    public void deposit(int pinCode, double summ) {
        if (this.pinCode != pinCode) {
            System.out.println("Операция отклонена!!!. Неверный пинкод");

        } else if (this.balance >= 0) {
            this.balance = this.balance + summ;
            System.out.println(this.balance);
        } else if (this.balance < 0) {


        }


    }

    public void withdraw(int pinCode, double summ){
        if (this.pinCode != pinCode) {
            System.out.println("Неверный пинкод");
        } else if(summ<=this.balance){
            this.balance=this.balance - summ;
            System.out.println(this.getBalance());
        }

    }

}
