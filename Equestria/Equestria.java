/*
 * Jacob Ng
 * APCS
 * Oct. 17, 2015
 * using math methods
 */
public class Equestria{
    public static void main(String[] args){
        distance();
        System.out.println();
        circumference();
        System.out.println();
        threeStop();
    }
    public static void distance(){
        double a = twoCities(31, -16, 34, -9);
        System.out.println(a+" miles");
        double b = twoCities(7, -19, 22, -8);
        System.out.println(b+" miles");
        double c = twoCities(25, -23, 16, -14);
        System.out.println(c+" miles");
    }
    public static double twoCities(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        return distance;
    }
    public static void circumference(){
        double a = tour(25);
        System.out.println(a+" miles");
    }
    public static double tour(int d){
        double circumference = d*Math.PI;
        return circumference;
    }
    public static void threeStop(){
        int city1x = 31;
        int city1y = -16;
        int city2x = 7;
        int city2y = -19;
        int city3x = 25;
        int city3y = -23;
        double a = pair(city1x, city1y, city2x, city2y);
        double b = pair(city2x, city2y, city3x, city3y);
        double c = pair(city1x, city1y, city3x, city3y);
        double x = cosine(a, b, c);
        double y = cosine(b, c, a);
        double z = cosine(c, a, b);
    }
    public static double pair(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        return distance;
    }
    public static double cosine(double a, double b, double c){
        double angle = Math.toDegrees(Math.acos((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c)));
        return angle;
    }
}