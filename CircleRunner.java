public class CircleRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        String info = circle.getInfo();
        circle.setRadius(9.2);
        info += circle.getInfo();
        System.out.println(info);

    }
}
