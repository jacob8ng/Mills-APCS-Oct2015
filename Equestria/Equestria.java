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
        System.out.println();
        longestTrip();
    }
    public static void distance(){
        double a = twoCities(31, -16, 34, -9);
        System.out.println("Distance from Baltimare to Manehattan: "+a+" miles");
        double b = twoCities(7, -19, 22, -8);
        System.out.println("Distance from Los Pegasus to Neighagra Falls: "+b+" miles");
        double c = twoCities(25, -23, 16, -14);
        System.out.println("Distance from Badlands to Ponyville: "+c+" miles");
    }
    public static double twoCities(int x1, int y1, int x2, int y2){
        double distance = (int)((100)*(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2))));
        distance = distance/100;
        return distance;
    }
    public static void circumference(){
        double a = tour(7, -19, 34, -9);
        System.out.println("Length of trip: "+a+" miles");
    }
    public static double tour(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double circumference = (int)((100)*(distance*Math.PI));
        circumference = circumference/100;
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
        System.out.println("Distance between Baltimare and Los Pegasus: "+a+" miles");
        System.out.println("Distance between Los Pegasus and Badlands: "+b+" miles");
        System.out.println("Distance between Badlands and Baltimare: "+c+" miles");
        System.out.println("Angle at Badlands: "+x+" degrees");
        System.out.println("Angle at Baltimare: "+y+" degrees");
        System.out.println("Angle at Los Pegasus: "+z+" degrees");
    }
    public static double pair(int x1, int y1, int x2, int y2){
        double distance = (int)((100)*(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2))));
        distance = distance/100;
        return distance;
    }
    public static double cosine(double a, double b, double c){
        double angle = (int)((100)*(Math.toDegrees(Math.acos((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c)))));
        angle = angle/100;
        return angle;
    }
    public static void longestTrip(){
        int city1x = 31;
        int city1y = -16;
        int city2x = 7;
        int city2y = -19;
        int city3x = 25;
        int city3y = -23;
        double a = compare(city1x, city1y, city2x, city2y);
        double b = compare(city2x, city2y, city3x, city3y);
        double c = compare(city1x, city1y, city3x, city3y);
        double x = longest(a, b, c);
        System.out.println("Longest distance: "+x+" miles");
    }
    public static double compare(int x1, int y1, int x2, int y2){
        double distance = (int)((100)*(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2))));
        distance = distance/100;
        return distance;
    }
    public static double longest(double x, double y, double z){
        double longest = Math.max(Math.max(x,y),z);
        return longest;
    }
}