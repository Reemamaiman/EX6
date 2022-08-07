package EX6_7;

    public class Square extends Rectangle{

        public Square() {

        }

        public Square(double width, double length) {
            super(width, length);
        }

        public Square(double width, double length, String color, boolean filled) {
            super(width, length, color, filled);
        }

        public double getSide() {
            return width;
        }

        public void setSide(double side) {
            width = side;
        }

        public void setWidth(double side) {
            width = side;
        }

        public void setLength(double side) {
            length = side;
        }

        @Override
        public String toString() {
            return "Square [ " + super.toString() + " ]";
        }


    }


