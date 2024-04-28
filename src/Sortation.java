import java.util.Comparator;

public class Sortation {

    public static void sortByRollno(Student[] listToSort, Comparator<Student> rollno){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (rollno.compare(listToSort[j], listToSort[j + 1]) > 0) {
                    Student temp = listToSort[j];
                    listToSort[j] = listToSort[j + 1];
                    listToSort[j + 1] = temp;}}}}
    public static void sortByName(Student[] listToSort, Comparator<Student> studentName){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
               if (studentName.compare(listToSort[j], listToSort[j + 1]) > 0) {
                   Student temp = listToSort[j];
                   listToSort[j] = listToSort[j + 1];
                   listToSort[j + 1] = temp;}}}}}
