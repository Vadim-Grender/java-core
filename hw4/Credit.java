class Credit extends Account {
    private double creditLimit;

    public Credit(String userName, String userPassword, double balance, double creditLimit) {
        super(userName, userPassword, balance);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}