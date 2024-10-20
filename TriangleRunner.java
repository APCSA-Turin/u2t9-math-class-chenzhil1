public class TriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri = new RightTriangle(3, 4);
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
        double hypo = tri.hypotenuse();
        double hypo2 = tri2.hypotenuse();
        System.out.println(hypo);
        System.out.println(hypo2);


    }
    
}
