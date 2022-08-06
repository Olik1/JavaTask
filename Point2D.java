public class Point2D {
    private int x,y;
    private static int counter;
    public final int id;
    static {
        System.out.println("Start:");
        //static block
    }

    public static void main(String[] args) {
        System.out.println("total points = " + Point2D.getCounter());//без учета если точки будут удаляться
        Point2D p1 = new Point2D();//конструктор умолчания с заданным изначальным значением
        System.out.println(p1);
        p1.setX(-3);
        p1.setY(2);
        System.out.println(p1);
        Point2D p2 = new Point2D(3,4);//полный конструктор
        System.out.println(p2);
        System.out.println("total points = " + Point2D.getCounter());

    }
    public Point2D() {
        this(0,0);
    }
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        id = counter++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return id+ ":(" +  + x + ", " + y + ')';
    }
}

