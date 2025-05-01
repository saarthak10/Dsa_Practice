package HackerRank;

/*
 * 
 * Question Link:- https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true
 */
public class ProgrammerDay {
    
    public static String findProgrammerDay(int year){
        String result ="";
        if(year > 1918){
            if(year % 400==0 || (year%4 == 0 && year%100 !=0)){
                //leap year 
                result = "12.09." + year;
            }else{
                result = "13.09." + year;
            }
        }else if(year < 1918){
            if(year % 4==0){
                //leap year 
                result = "12.09." + year;
            }else{
                result = "13.09." + year;
            }
        }else{
            result = "26.09.1918";
        }

        return result;
    }
    
    public static void main(String[] args) {
        findProgrammerDay(2016);
    }
}
