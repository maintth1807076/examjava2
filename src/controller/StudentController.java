package controller;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<>();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EnrollID: ");
        String enrollId = scanner.nextLine();
        System.out.println("Enter FirstName: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        Student student = new Student(enrollId, firstName, lastName, age);
        list.add(student);
    }

    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("src/resources/students.dat");
        fileWriter.write("EnrollID\t"+ "FirstName\t" +  "LastName\t" +  "Age\t" + "\n");
        for (Student student:
                list) {
            fileWriter.write(student.getEnrollId() + "  " + student.getFirstName() + "  " + student.getLastName() + "   " + student.getAge() + "\n");
        }
        fileWriter.close();
    }

    public void display() throws IOException {
        System.out.printf("%-10s%-25s%-10s\n", "EnrollID","Full Name", "Age");
        System.out.printf("%-10s%-25s%-10s\n", "--------","-----------------", "--------");
        FileReader fileReader = new FileReader("src/resources/students.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while( (line = bufferedReader.readLine()) != null){
            if (count == 0){
                count++;
                continue;
            }
            String[] splitted = line.split("\\s{2,}");
            if(splitted.length == 4) {
              System.out.printf("%-10s%-25s%-10s\n", splitted[0], splitted[1] + " " + splitted[2], splitted[3]);

            }
        }

    }
}
