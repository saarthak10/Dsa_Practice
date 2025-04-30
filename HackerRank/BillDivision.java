package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
     
    public static void bonAppetite( List<Integer> bill, int k, int b){
        int itemNotEaten = bill.get(k);
        int totalAmountPayedByAnna = b;
        int actualPayment = 0;
        for(int i=0; i< bill.size();i++){
            actualPayment = actualPayment + bill.get(i);
        }
        actualPayment = actualPayment - itemNotEaten;
        actualPayment = actualPayment/2;

        if(totalAmountPayedByAnna > actualPayment){
            System.out.println(totalAmountPayedByAnna -actualPayment);
        }else{
            System.out.println("Bon Appetit");
           
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> barArray = new ArrayList<>();
        barArray.add(3);
        barArray.add(10);
        barArray.add(2);
        barArray.add(9);
        bonAppetite(barArray, 1, 12);
    }
}
