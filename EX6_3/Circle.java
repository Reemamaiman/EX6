package EX6_3;

    public class Circle implements GeometricObject {
        protected double raduis;

        public Circle() {

        }

        public Circle(double raduis) {
            this.raduis = raduis;
        }

        @Override
        public String toString() {
            return "Circle [raduis=" + raduis + "]";
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * raduis;
        }

        @Override
        public double getArea() {
            return Math.PI * Math.pow(raduis, 2);
        }



    }


