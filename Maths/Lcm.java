package Maths;

public class Lcm {

    public static int findHcf(int a , int b){
        if(b==0){
            return a;
        }
        return findHcf(b,a% b);
    }
    
    public static int findLcm(int a, int b){
        if(a==0 || b==0){
            return 0;
        }

        return Math.abs(a*b)/findHcf(a, b);
    }

    public static void main(String[] args) {
        int lcm = findLcm(12, 18);

    }
}
