package exercicios.ex1.entities;

public class Account {

    private Integer number;
    private String holder;
    private Float balance;
    private Float withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Float balance, Float withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Float getBalance() {
        return balance;
    }

    public Float getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Float withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amout) {
        balance -= amout;
    }
}
