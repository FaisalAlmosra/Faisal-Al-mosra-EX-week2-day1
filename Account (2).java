
    import java.text.DecimalFormat;

    public class Account {

        private int id;
        private Customer customer;
        private double balance=0.0;

        public Account(int id, Customer customer, double balance) {
            this.id = id;
            this.customer = customer;
            this.balance = balance;
        }

        public Account(int id, Customer customer) {
            this.id = id;
            this.customer = customer;
        }

        public int getId() {
            return id;
        }

        public Customer getCustomer() {
            return customer;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }


        @Override
        public String toString() {
            DecimalFormat df = new DecimalFormat("0.00");
            return  customer.getName() +
                    "(" + customer.getID() +
                    ") balance="+df.format(balance);
        }

        public String getCustomerName(){
            return customer.getName();
        }

        public Account deposit(double amount){
            double balance=this.balance+amount;
            Account account=new Account(this.id,this.customer,balance);
            return account;
        }

        public Account withdraw(double amount){
            Account account=new Account(this.id,this.customer,this.balance);
            if (amount<=this.balance){
                double balance=this.balance-amount;
                account=new Account(this.id,this.customer,balance);
            }
            else{
                System.out.println("Amount exceeded balance");
            }
            return account;
        }
    }

