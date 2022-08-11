public class RectangleImpl {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();

        double area = obj.getArea(4,40);
        System.out.println("Area of Rectangle = " + area);

        double peri = obj.getPerimeter(3.5,35.9);
        System.out.println("Perimeter of Rectangle = " + peri);

    }
}
