package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    private BankAccount bankAccount;
    private Double hoursWorked;
    private Double hourlyWage;
    private Double moneyEarned;

    public Employee() {
        this.bankAccount = new BankAccount();
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.moneyEarned = hoursWorked * hourlyWage;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.moneyEarned = hoursWorked * hourlyWage;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked += numberOfHours;
    }
    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return moneyEarned;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }
}
