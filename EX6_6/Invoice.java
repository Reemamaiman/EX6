package EX6_6;

public class Invoice {

        int id;
        Customer customer;
        double amount;

        public Invoice(int id, Customer customer, double amount) {
            super();
            this.id = id;
            this.customer = customer;
            this.amount = amount;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public int getId() {
            return id;
        }

        public int getCustomerID() {
            return this.customer.id;
        }

        public String getCustomerName() {
            return this.customer.name;
        }

        public int getCustomerDiscount() {
            return this.customer.discount;
        }

        public double getAmountAfterDiscount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Invoice [id=" + id + ", customer=" + this.customer.toString() + ", amount=" + amount + "]";
        }

    }


