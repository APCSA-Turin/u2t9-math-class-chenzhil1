public class U2T9 {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double total =  a + b + c + d;
        System.out.println("Person a get " + a + " of a pie" );
        System.out.println("Person b get " + b + " of a pie" );
        System.out.println("Person c get " + c + " of a pie" );
        System.out.println("Person d get " + d + " of a pie" );
        System.out.println("We need " + total + "pie" );

        for (int i = 0; i < 100; i++) {
            /* copy/paste your line of code above here  */
            double randomNum = (int)Math.random() * 36 + 50 ;
            System.out.println(randomNum);
        }
    }
}
