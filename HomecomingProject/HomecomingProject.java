/*
 * Jacob Ng
 * APCS
 * Homecoming Project
 * get input from user
 */
import java.util.*;
public class HomecomingProject{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String x = getADate(userInput);
        damage(userInput, x);
    }
    public static String getADate(Scanner userInput){
        System.out.println("Hi! My name is Jacob.\nWhat's your name?");
        String name = userInput.nextLine();
        System.out.println("Nice to meet you "+name+"!\nWould you like to go to Homecoming with me?");
        String answer = userInput.next();
        System.out.println("Great! It'll be a magical night -- "+name+" and Jacob going to the Mills Homecoming Dance 2015!");
        return name;
    }
    public static void damage(Scanner userInput, String x){
        System.out.println("Let's figure out the damage for the evening.\n");
        System.out.println("What are your estimated costs?");
        System.out.print("Tickets (each): $");
        double tickets = userInput.nextDouble();
        System.out.print("Flowers (total for both of you): $");
        double flowers = userInput.nextDouble();
        System.out.print("Pictures: $");
        double pictures = userInput.nextDouble();
        System.out.print("Dinner (per meal): $");
        double dinner = userInput.nextDouble();
        System.out.print("New clothes (Tie to match dress? Vest? Dress? Non-tennis shoes?): $");
        double clothes = userInput.nextDouble();
        System.out.print("Any other expenses: $");
        double other = userInput.nextDouble();
        System.out.println();
        System.out.println();
        double total = (int)(100*((tickets*2.0)+flowers+pictures+(((dinner*2.0)+clothes+other)*1.0825)));
        total /= 100;
        System.out.println("So, you should expect to spend, including tax, $"+total);
        double half = total/2.0;
        System.out.println("If you split the costs with your date, each will pay: $"+half);
        System.out.println();
        System.out.println();
        statsTable(tickets, flowers, pictures, dinner, clothes, other, x, "Jacob");
    }
    public static void statsTable(double a, double b, double c, double d, double e, double f, String x, String y){
        System.out.println("MHS Homecoming 2015");
        System.out.println(x+" and "+y);
        System.out.println();
        System.out.println("Tickets (total):                       $"+(2.0*a));
        System.out.println("Flowers (for both of you):             $"+b);
        System.out.println("Pictures:                              $"+c);
        System.out.println("Dinner (for two):                      $"+(2.0*d));
        System.out.println("New clothes:                           $"+e);
        System.out.println("Any other expenses:                    $"+f);
        System.out.println();
        double subtotal = (2.0*(a+d))+b+c+e+f;
        double tax = (int)(100*(((2*d)+e+f)*0.0825));
        tax /= 100;
        double total = subtotal + tax;
        double half = total/2.0;
        System.out.println("                     Subtotal:         $"+subtotal);
        System.out.println("                     Sales Tax:        $"+tax);
        System.out.println("                     Total:            $"+total);
        System.out.println("                     Total Per Person: $"+half);
    }
}