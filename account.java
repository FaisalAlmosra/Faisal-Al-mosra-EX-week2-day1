public class account {
    private String id;
    private String name;
    private int balance=0;

    public account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {

        return balance = amount + balance;
    }
    public int debit(int amount){
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");}
        return balance;

        }
        public int transferTo(account another, int amount) {
            if (amount <= balance) {
                balance = amount + balance;

            } else {
                System.out.println("Amount exceeded balance");
            }
            return balance;

        }

    @Override
    public String toString() {
        return "account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}





