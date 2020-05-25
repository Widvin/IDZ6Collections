import by.gsu.pms.Comparable;
import by.gsu.pms.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner implements Comparable {
    public static void main (String[] args) throws IOException {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("Students.csv"));
            ArrayList<Boolean> students = new ArrayList<>();
            Scanner scanner1 = new Scanner(System.in);

            while ((scanner.nextInt()) > 0) {
                students.add(scanner.hasNext());
                System.out.println();
            }
            scanner.close();
            Collections.sort(students);
            System.out.println(students);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String group = "PD-34";
        System.out.println("Student List for PD-34 " + group + ":");
        for (Student student: group){
            if (student.getGroup().equals(group)){
                student.toString();
            }
        }

        String faculty = "pedagogical";
        System.out.println("Student List for pedagogical faculty " + faculty + ":");
        for (Student student: faculty){
            if (student.getFaculty().equals(faculty)){
                student.toString();
            }
        }

        int year = 2000;
        System.out.println("Birth year is " + year + ":");
        for (Student student: year){
            if (Student.getBirthyear() == year){
                student.toString();
            }

        }

        File csvFile = new File("src/studentsort.csv");
        try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile))){
            for(Student student : students){
                csvWriter.println(student);
            }
        } catch (IOException e) {
            //Handle exception
            e.printStackTrace();
        }




    }


    }


