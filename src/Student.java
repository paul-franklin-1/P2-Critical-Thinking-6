import java.util.Scanner;

public class Student {
    String studentName;
    String studentAddress;
    int rollno = 0;
    public Student (String studentName, String studentAddress){
        this.rollno = rollno + 1;
        rollno++;
        this.studentName = studentName;
        this.studentAddress = studentAddress;}

    public int getRollno() {
        return rollno;
    }
    public static void printAll(Student[] list){
        for (int i = 0; i < 10; i++) {
            System.out.println(list[i]);}
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Student[] studentList = new Student[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter student Name: ");
            String sName = scnr.nextLine();
            System.out.println("Enter student address: ");
            String sAddress = scnr.nextLine();
            Student student = new Student(sName,sAddress);
            studentList[i] = student;}
        boolean continueLoop = true;
        while(continueLoop){
            System.out.println("Select option by number: \n" +
            "1. Sort Students by Roll Number \n" +
            "2. Sort Students by Name \n" +
            "3. Print All Student Information \n" +
            "4. Quit Program");
            int userChoice = scnr.nextInt();
            if ((userChoice < 1) || (userChoice > 4)){
                System.out.println("Please enter integer between 1 and 4");}
            else if (userChoice == 1){
                Sortation.sortByRollno(studentList);
                System.out.println("List has been sorted by Roll Number.");}
            else if (userChoice == 2){
                Sortation.sortByName(studentList);
                System.out.println("List has been sorted by name.");}
            else if (userChoice == 3){
                printAll(studentList);}
            else {
                continueLoop = false;
                System.out.println("Goodbye.");}}}}

