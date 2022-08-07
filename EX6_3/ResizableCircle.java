package EX6_3;

    public class ResizableCircle extends Circle implements Resizable {

        public ResizableCircle(double raduis) {
            super(raduis);
        }



        @Override
        public String toString() {
            return "ResizableCircle [Circle[raduis=" + raduis + "]]";
        }



        @Override
        public void resize(int percent) {
            raduis *= percent / 100.0;
        }

    }


