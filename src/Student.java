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

    public static void main(String[] args) {
        Student[] studentList = new Student[10];
        for(int i=0;i<10;i++){
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter student Name: ");
            String sName = scnr.nextLine();
            System.out.println("Enter student address: ");
            String sAddress = scnr.nextLine();
            Student student = new Student(sName,sAddress);
            studentList[i] = student;
        }}}
