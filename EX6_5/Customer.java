package EX6_5;

public class Customer {

        int id;
        String name;
        char gender;

        public Customer(int id, String name, char gender) {
            super();
            this.id = id;
            this.name = name;
            if(gender != 'm' && gender != 'f')
                throw new ArithmeticException("Gender Inccorect");
            else
                this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return name + "(" + id + ")";
        }
    }


