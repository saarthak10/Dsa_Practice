package LeetChallenge;

public class SecondChallenge {
    
public static boolean haveConflicts(String[] event1, String[] event2){
    boolean result = false;
    
    if(event1[1].compareTo(event2[0]) < 0 || event2[1].compareTo(event1[0]) <0){
        result = false;
    }else{
        result = true;
    }


    return result;

}


public static void main(String[] args) {
    
}

}
