package EX6_7;

    public class Circle extends Shape {
        protected double raduis = 1.0;

        public Circle() {

        }

        public Circle(double raduis) {
            this.raduis = raduis;
        }

        public Circle(double raduis, String color, boolean filled) {
            super(color, filled);
            this.raduis = raduis;
        }

        public double getRaduis() {
            return raduis;
        }

        public void setRaduis(double raduis) {
            this.raduis = raduis;
        }

        @Override
        public double getArea() {
            return Math.PI * Math.pow(raduis, 2);
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * raduis;
        }

        @Override
        public String toString() {
            return "Circle [" + super.toString() + ", raduis=" + raduis + "]";
        }

    }

