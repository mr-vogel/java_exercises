package chapter12.exercises;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args) {
        Map<String, Integer> oldGrades = TestResults.getOriginalGrades();
        Map<String, Integer> newGrades = TestResults.getMakeUpGrades();


        for (var student : newGrades.entrySet()) {
            Integer firstGrade = oldGrades.get(student.getKey());
            Integer secondGrade = newGrades.get(student.getKey());

            if (secondGrade > firstGrade){
                oldGrades.put(student.getKey(), secondGrade);
            }
            System.out.println("Student: " + student.getKey() + ", Grade: " + oldGrades.get(student.getKey()));
        }

//        oldGrades.forEach(
//                (k,v) -> System.out.println("Student: " + k + ", Grade: " + v));
    }

}
