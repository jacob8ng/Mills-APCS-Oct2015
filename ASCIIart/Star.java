/*
 * Jacob Ng
 * APCS
 * ASCII Art Project
 * Using parameters and loops/nested loops
 */
public class Star{
  public static void main(String[] args){
    char x='#';
    char y='O';
    int z=4;
    star(x,y,z);
    char a='*';
    char b='@';
    int c=3;
    star(a,b,c);
    star(x,y,z);
    star(a,b,c);
  }
  public static void star(char x, char y, int number){
    for(int a=1; a<=number; a++){
        System.out.print("                  "+x+"                   ");
    }
    System.out.println();
    for(int b=1; b<=number; b++){
        System.out.print("                 "+x+x+x+"                  ");
    }
    System.out.println();
    for(int c=1; c<=number; c++){
        System.out.print("                "+x+x+" "+x+x+"                 ");
    }
    System.out.println();
    for(int d=1; d<=number; d++){
        System.out.print("               "+x+x+" "+y+" "+x+x+"                ");
    }
    System.out.println();
    for(int e=1; e<=number; e++){
        System.out.print("              "+x+x+" "+y+y+y+" "+x+x+"               ");
    }
    System.out.println();
    for(int f=1; f<=number; f++){
        System.out.print("             "+x+x+" "+y+y+y+y+y+" "+x+x+"              ");
    }
    System.out.println();
    for(int g=1; g<=number; g++){
        System.out.print("            "+x+x+" "+y+y+y+y+y+y+y+" "+x+x+"             ");
    }
    System.out.println();
    for(int h=1; h<=number; h++){
        System.out.print(""+x+x+x+x+x+x+x+x+x+x+x+x+x+" "+y+y+y+y+y+y+y+y+y+" "+x+x+x+x+x+x+x+x+x+x+x+x+x+" ");
    }
    System.out.println();
    for(int i=1; i<=number; i++){
        System.out.print(" "+x+x+" "+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+" "+x+x+"  ");
    }
    System.out.println();
    for(int j=1; j<=number; j++){
        System.out.print("   "+x+x+" "+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+" "+x+x+"    ");
    }
    System.out.println();
    for(int k=1; k<=number; k++){
        System.out.print("     "+x+x+" "+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+" "+x+x+"      ");
    }
    System.out.println();
    for(int l=1; l<=number; l++){
        System.out.print("       "+x+x+" "+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+" "+x+x+"        ");
    }
    System.out.println();
    for(int m=1; m<=number; m++){
        System.out.print("         "+x+x+" "+y+y+y+y+y+y+y+y+y+y+y+y+y+" "+x+x+"          ");
    }
    System.out.println();
    for(int n=1; n<=number; n++){
        System.out.print("        "+x+x+" "+y+y+y+y+y+y+y+y+y+y+y+y+y+y+y+" "+x+x+"         ");
    }
    System.out.println();
    for(int o=1; o<=number; o++){
        System.out.print("       "+x+x+" "+y+y+y+y+y+" "+x+x+x+x+x+" "+y+y+y+y+y+" "+x+x+"        ");
    }
    System.out.println();
    for(int p=1; p<=number; p++){
        System.out.print("      "+x+x+" "+y+y+y+y+" "+x+x+"     "+x+x+" "+y+y+y+y+" "+x+x+"       ");
    }
    System.out.println();
    for(int q=1; q<=number; q++){
        System.out.print("     "+x+x+" "+y+y+y+" "+x+x+"         "+x+x+" "+y+y+y+" "+x+x+"      ");
    }
    System.out.println();
    for(int r=1; r<=number; r++){
        System.out.print("    "+x+x+" "+y+y+" "+x+x+"             "+x+x+" "+y+y+" "+x+x+"     ");
    }
    System.out.println();
    for(int s=1; s<=number; s++){
        System.out.print("   "+x+x+" "+y+" "+x+x+"                 "+x+x+" "+y+" "+x+x+"    ");
    }
    System.out.println();
    for(int t=1; t<=number; t++){
        System.out.print("  "+x+x+x+" "+x+x+"                     "+x+x+" "+x+x+x+"   ");
    }
    System.out.println();
    for(int u=1; u<=number; u++){
        System.out.print(" "+x+x+x+"                             "+x+x+x+"  ");
    }
    System.out.println();
    for(int v=1; v<=number; v++){
        System.out.print(""+x+x+"                                 "+x+x+" ");
    }
    System.out.println();
}
}