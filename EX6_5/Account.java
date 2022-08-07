package EX6_5;

import java.text.DecimalFormat;
public class Account {

        int id;
        Customer customer;
        int balance = 0;

        public Account(int id, Customer customer) {
            super();
            this.id = id;
            this.customer = customer;
        }

        public Account(int id, Customer customer, int balance) {
            super();
            this.id = id;
            this.customer = customer;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }



        public Customer getCustomer() {
            return customer;
        }

        public int getBalance() {
            return balance;
        }

        @Override
        public String toString() {
            DecimalFormat df = new DecimalFormat();
            return customer.name + "(" + id + ") balance = " + df.format(balance);
        }

        public Account deposit(double amount) {
            balance += amount;

            return this;
        }

        public Account withdraw(double amount) {
            if (balance >= amount )
                balance -= amount;
            else
                System.out.println("Amount withdraw exceeded the current balance");

            return this;
        }



    }

