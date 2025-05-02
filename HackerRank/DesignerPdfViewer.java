package HackerRank;

import java.util.HashMap;
import java.util.List;

/*
 * 
 * Question Link :-  https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignerPdfViewer {
    

    public static int designerPdfViewer(int[] h, String word) { 
        int result =0;
        char alphabet = 'a';
        HashMap<Character,Integer> alphabetHeight = new HashMap<>();

        for(int i=0; i< h.length;i++){
            alphabetHeight.put(alphabet, h[i]);
            alphabet++;
        }

        System.out.println("ALPHABET LST VALUE====>" + alphabet);

        char[] words = word.toCharArray();
        int tallestHeight =0;
        for(int i=0; i< words.length; i++){
            int currentAlphabetHeight = alphabetHeight.get(words[i]);
            tallestHeight = Math.max(tallestHeight, currentAlphabetHeight);
        }

        result = tallestHeight * words.length;
        System.out.println("AREA OF RECT===>" + result);
        return result;
    }


    public static void main(String[] args) {
     int[] h=new int[]{1, 3, 1, 3, 1 ,4 ,1 ,3 ,2 ,5 ,5 ,5 ,5, 5 ,5, 5, 5 ,5 ,5, 5, 5 ,5 ,5 ,5 ,5, 5} ;
     String word = "abc";
     designerPdfViewer(h, word);   
    }
}
