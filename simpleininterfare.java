 interface Shapeinterface {
    void area(int r);
}

class Circle implements Shapeinterface {
  public void area(int r) {
        System.out.println("Area is = " + 3.14 * r * r);
    }
}

public class simpleininterfare {
    public static void main(String[] args) {
        Shapeinterface obj = new Circle();
        obj.area(4);
    }
}