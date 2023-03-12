public class Math {
    // y = 3x + 5
    // y=(a+b)/(a-b)
    // y=(ax/b)!
    private int a, b, x; //для доступа в этом классе
    Math(int a, int b, int x){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public int first(){
        return 3*x+5;
    }
    public double second(){
        if(a - b == 0){
            return -1;
        }
        return (a+b)/(a-b);
    }
    public int factorial(int f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }
    public void third(){
        if(b == 0){
            System.out.println("b is null");
            return;
        }
        double temp = a*x/b;
        if(temp % 1 == 0){
            System.out.println(factorial((int)temp));
            return;
        }
        else {
            System.out.println("очень сложный расчет.");
        }
    }
}
