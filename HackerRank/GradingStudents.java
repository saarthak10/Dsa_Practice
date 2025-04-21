package HackerRank;

import java.util.ArrayList;
import java.util.List;

class GradingStudents {

    public static ArrayList<Integer> gradingStuddents(List<Integer> givenGrades){
        ArrayList<Integer> resultingGrades = new ArrayList<Integer>();

        for(int i=0; i< givenGrades.size(); i++){
            if(givenGrades.get(i) < 38){
                resultingGrades.add(givenGrades.get(i));
            }else{
                int grade = givenGrades.get(i);
                int nextMultipleOfFive = (grade/5 + 1)*5;
                if(nextMultipleOfFive - grade < 3){
                    resultingGrades.add(nextMultipleOfFive);
                }else{
                    resultingGrades.add(grade);
                }
            }
        }
        return resultingGrades;
    } 
    

    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        gradingStuddents(grades);

    }
}