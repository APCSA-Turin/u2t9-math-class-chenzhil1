import java.util.Scanner;
public class SmallGame {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int playerX = 0;
        int playerY = 0;
        int steps = 0;


        System.out.println("Fetching random point on map...");
        x = (int)(Math.random() * 101 - 51);
        y = (int)(Math.random() * 101 - 51);
        System.out.println("x: " + x);
        System.out.println("y:" + y );

        System.out.println("You start on the origin, your goal is to find the hidden point");
        Scanner scan = new Scanner(System.in);        
        
        while(!(x == playerX && y == playerY)) {
            int xMove = 0;
            int yMove = 0;
            double degrees = 0;
            int roundedDegrees = 0;
            System.out.print("Please enter the steps you want to move on x-axis: ");
            if(!(playerX == x)){
                xMove = scan.nextInt();
                scan.nextLine();
                if(xMove > 0) {
                    System.out.println("You have moved " + Math.abs(xMove) + " steps to the right");

                }
                else if(xMove < 0) {
                    System.out.println("You have moved " + Math.abs(xMove) + " steps to the left");

                }
                else {
                    System.out.println("You did not move");
                    
                }
                playerX += xMove;

                if(playerX > x) {
                    System.out.println("You need to move more to your left");
            
                }
                else {
                    System.out.println("You need to move more to your right");
    
                }
            }

            System.out.print("Please enter the steps you want to move on y-axis: ");
            if(!(playerY == y)){

                yMove = scan.nextInt();
                scan.nextLine();
                if(yMove > 0) {
                    System.out.println("You have moved " + Math.abs(yMove) + " steps up");

                }
                else if(yMove < 0) {
                    System.out.println("You have moved " + Math.abs(yMove) + " steps down");

                }
                else {
                    System.out.println("You did not move");
                    
                }
                playerY += yMove;

            }

            if(playerY > y) {
                System.out.println("You need to move more down");
        
            }
            else {
                System.out.println("You need to move more up");

            }
            
            degrees = Math.toDegrees(Math.atan2((y - playerY), (x - playerX)));
            roundedDegrees = (int) Math.round(degrees);
            System.out.println("The point is at approximate the " + roundedDegrees + " degrees angle from your position");
            steps ++;

        }
        scan.close();
        System.out.println("Congradulation, you won! It took you " + steps + " steps to finish");

        
    }
}
