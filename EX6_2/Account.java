package EX6_2;

public class Account {

        int id;
        String name;
        int balance = 0;

        public Account(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }

        public Account(int id, String name, int balance) {
            super();
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getBalance() {
            return balance;
        }

        public int credit(int amount) {
            balance += amount;
            return balance;
        }

        public int debit(int amount) {
            if (amount <= balance)
                balance -= amount;
            else
                System.out.println("Amount exceeded balance");

            return balance;
        }


        public int transferTo(Account another, int amount) {
            if (amount <= balance) {
                balance -= amount;
                another.balance += amount;
            } else {
                System.out.println("Amount exceeded balance");
            }

            return balance;
        }

        @Override
        public String toString() {
            return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
        }



    }
