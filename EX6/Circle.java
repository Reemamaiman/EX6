package EX6;

import java.util.ArrayList;

public class Circle {

        double raduis = 1.0;
        String color = "red";

        public Circle() {

        }

        public Circle(double raduis) {
            super();
            this.raduis = raduis;
        }

        public Circle(double raduis, String color) {
            super();
            this.raduis = raduis;
            this.color = color;
        }

        public double getRaduis() {
            return raduis;
        }

        public void setRaduis(double raduis) {
            this.raduis = raduis;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getArea() {
            return Math.PI * Math.pow(raduis, 2);
        }

        @Override
        public String toString() {
            return "Circle [raduis=" + raduis + ", color=" + color + "]";
        }



    }




