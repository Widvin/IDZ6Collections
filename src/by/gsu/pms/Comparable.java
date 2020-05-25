package by.gsu.pms;
import by.gsu.pms.Student;

import java.util.Arrays;
import java.util.Comparator;


public interface Comparable {
    public static Student[] byFirstnames(Student[] array){
        Arrays.sort(array, Comparator.comparing(Student::getFirstname));
        return array;
    }

    public static Student[] bySecondnames(Student[] array){
        Arrays.sort(array, Comparator.comparing(Student::getSecondname));
        return array;
    }

    public static Student[] byLastnames(Student[] array){
        Arrays.sort(array, Comparator.comparing(Student::getLastname));
        return array;
    }

    public static Student[] byFaculties(Student[] array){
        Arrays.sort(array, Comparator.comparing(Student::getFaculty));
        return array;
    }


    public static Student[] byAdresses(Student[] array){
        Arrays.sort(array, Comparator.comparing(Student::getAddress));
        return array;
    }

    public static Student[] byGroups(Student[] array){
        Arrays.sort(array, Comparator.comparing(Student::getGroup));
        return array;
    }



}
