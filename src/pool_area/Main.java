package pool_area;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle =new Rectangle(5,10);
        System.out.println("Rectangle.width = "+rectangle.getWidth());
        System.out.println("Rectangle.length = "+rectangle.getLength());
        System.out.println("Rectangle.area = "+rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width = "+cuboid.getWidth());
        System.out.println("cuboid.length = "+cuboid.getLength());
        System.out.println("cuboid.area = "+cuboid.getArea());
        System.out.println("cuboid.heigth = "+cuboid.getHeight());
        System.out.println("cuboid.volume = "+cuboid.getVolume());
    }
}
