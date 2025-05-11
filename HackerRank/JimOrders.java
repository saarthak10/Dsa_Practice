package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/*
 * 
 * Questopn Link :-  https://www.hackerrank.com/challenges/jim-and-the-orders/problem?isFullScreen=true
 * 
 * Step: 1 --->  1.)  Add orderNumbers with delivery time
 *          2.)Store delivery TIme with the customer Id in the hashmap
 *          3.) Sort the array of delivery time and get the values from the hashmap for each key., which basically gives the customerID whose order will be first delivered.
 */
public class JimOrders {
    

    public static List<Integer> findOrder(List<List<Integer>> orders){

        List<Integer> result = new ArrayList<>();
        List<Integer> deliveryTime = new ArrayList<>();
        int rows = orders.size();
        int columns = orders.get(0).size(); 
        HashMap<Integer,Integer> orderDetails = new HashMap<>();
        for(int i=0;i< rows; i++){
            int preparationTime = 0;
            for(int j=0; j< columns; j++){
                 preparationTime += orders.get(i).get(j);
                 
            }
            orderDetails.put(preparationTime,i+1);
            deliveryTime.add(preparationTime);
            System.out.println("Adding to HASHMAP====> " + orderDetails);
        }
        System.out.println("DELIVERY Time ===> " + deliveryTime);
        System.out.println("HASHMAP====> " + orderDetails);
        Collections.sort(deliveryTime);

        for(int i=0; i< deliveryTime.size(); i++){
            result.add(orderDetails.get(deliveryTime.get(i)));
        }

        System.out.println("RESULT ===> " + result);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<List<Integer>> barArray = new ArrayList<>();
        ArrayList firstRow = new ArrayList<>();
        ArrayList secondRow = new ArrayList<>();
        ArrayList thirdRow = new ArrayList<>();
        ArrayList fourthRow = new ArrayList<>();
        ArrayList fifthRow = new ArrayList<>();
        ArrayList sixthRow = new ArrayList<>();
        ArrayList seventhRow = new ArrayList<>();


        firstRow.add(1);
        firstRow.add(1);
        secondRow.add(1);
        secondRow.add(1);
        // thirdRow.add(5);
        // thirdRow.add(6);
        // fourthRow.add(3);
        // fourthRow.add(1);
        // fifthRow.add(4);
        // fifthRow.add(3);
        barArray.add(firstRow);
        barArray.add(secondRow);
        // barArray.add(thirdRow);
        // barArray.add(fourthRow);
        // barArray.add(fifthRow);
        
        findOrder(barArray);
    }
}
