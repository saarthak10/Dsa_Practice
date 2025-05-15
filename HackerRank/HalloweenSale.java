package HackerRank;

public class HalloweenSale {
    
    public static int howManyGames(int p, int d, int m, int s){
        int result = 0;
        int budget = p;

        while(s>= budget){
            s -= budget;
            result++;
            budget = Math.max(m, budget-d);
        }
        System.out.println("RESULT IS=====>" + result);
        return result;
    }

    public static void main(String[] args) {
        howManyGames(20, 3, 6, 70);
    }
}
