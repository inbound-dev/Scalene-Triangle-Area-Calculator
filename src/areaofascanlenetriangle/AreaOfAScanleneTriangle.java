/*
 * Jordan Hamilton
 * This Program Calculates The Area of a Scalene Triangle With Given User Input
 */

package areaofascanlenetriangle;
import java.util.Scanner;
/**
 *
 * @author joham3169
 */
public class AreaOfAScanleneTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, s, d, e;
        
        System.out.println("Scalene Triangle Area Calculator");
        //Making a scanner
        Scanner Input = new Scanner(System.in);
        // Asking for user input
        System.out.println("Please Enter 3 Side Lengths");
        // storing into variables 
        a = Input.nextInt();
        b = Input.nextInt();
        c = Input.nextInt();
        // Closing Scanner 
        Input.close();
        // starting calculations
        s = (a + b + c)/2;
        d = s*(s - a) * (s-b) * (s-c);
        e = Math.sqrt(d);
        // printing to user 
        System.out.println("The Area Of This Scalene Triangle is " + e);
    }
    
}
