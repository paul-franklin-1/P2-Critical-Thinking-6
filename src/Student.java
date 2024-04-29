import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private static int nextRollNo = 1;
    private int rollno;
    private String studentName;
    private String studentAddress;

    public Student (String studentName, String studentAddress){
        this.rollno = nextRollNo;
        nextRollNo++;
        this.studentName = studentName;
        this.studentAddress = studentAddress;}

    public int getRollno() {
        return rollno;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentAddress(){
        return studentAddress;}

    public String toString() {
        return "\nStudent Roll Number: " + rollno +
    "\nStudent Name: " + studentName +
    "\nStudent Address: " + studentAddress +
    "\n\n";
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
                Arrays.sort(studentList, new StudentComparatorRollno());
                System.out.println("List has been sorted by Roll Number.");}
            else if (userChoice == 2){
                Arrays.sort(studentList, new StudentComparatorName());
                System.out.println("List has been sorted by name.");}
            else if (userChoice == 3){
                String studentsString = Arrays.toString(studentList);
                System.out.println(studentsString);}
            else {
                continueLoop = false;
                System.out.println("Goodbye.");}}}}

