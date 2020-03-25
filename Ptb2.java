import java.util.Scanner;

public class Ptb2 {
    float a,b,c;
    public Ptb2(){
    }
    public Ptb2(float a , float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getDiscriminant(){
        return b*b- 4*a*c;
    }
    public float getRoo1(){
        return (float)(-b + Math.sqrt(getDiscriminant()));
    }
    public float getRoo2(){
        return (float)(-b-Math.sqrt(getDiscriminant()));
    }
    public String display(){
        return "Ptb2{" + "a =" +a+ ",b =" + b + ",c=" +c+"}";
    }
    public static class abc_1{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the a:");
            float a = scanner.nextFloat();
            System.out.print("Enter the b");
            float b = scanner.nextFloat();
            System.out.print("Enter the c:");
            float c = scanner.nextFloat();
            Ptb2 ptb2 = new Ptb2(a,b,c);
            System.out.println("Your Ptb2\n" + ptb2.display());
            System.out.println("detal" + ptb2.getDiscriminant());
            System.out.println("nghiem 1" + ptb2.getRoo1());
            System.out.println("nghiem2" + ptb2.getRoo2());
        }
    }

}
