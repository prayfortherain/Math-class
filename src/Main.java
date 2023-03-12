import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            Math obj = new Math(a, b, x);
            System.out.println(obj.first());
            System.out.println(obj.second());
            obj.third();
    }}
}
