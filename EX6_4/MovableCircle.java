package EX6_4;

    public class MovableCircle implements Movable {
        int raduis;
        MovablePoint center;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int raduis) {
            this.center.x = x;
            this.center.y = y;
            this.center.xSpeed = xSpeed;
            this.center.ySpeed = ySpeed;
            this.raduis = raduis;
        }

        @Override
        public String toString() {
            return "(" + this.center.x + ", " + this.center.y + "), speed(" + this.center.xSpeed + ", " + this.center.ySpeed + "), raduis = " + raduis;
        }

        @Override
        public void moveUp() {
            this.center.y++;
        }

        @Override
        public void moveDown() {
            this.center.y--;
        }

        @Override
        public void moveLeft() {
            this.center.x++;
        }

        @Override
        public void moveRight() {
            this.center.x--;
        }
    }


