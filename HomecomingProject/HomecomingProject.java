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
        getADate(userInput,"Jacob Ng");
    }
    public static String getADate(Scanner userInput, String x){
        System.out.println("Hi! My name is "+x+".\nWhat's your name?");
        String name = userInput.nextLine();
        System.out.println("Nice to meet you "+name+"!\nWould you like to go to Homecoming with me?");
        String answer = userInput.next();
        System.out.println("Great! It'll be a magical night -- "+x+" and "+name+" going to the Mills Homecoming Dance 2015!");
        
    }
}