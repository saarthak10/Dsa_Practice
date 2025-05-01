package Maths;

public class Hcf {
    
    public static int findHcf(int a , int b){
        if(b==0){
            return a;
        }
        return findHcf(b,a% b);
    }

    public static void main(String[] args) {
     int hcf =    findHcf(18, 48);
    
    }
}
