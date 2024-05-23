package Assinment14.HashSet.UCE;

import java.util.HashSet;

public class UniqueCourseEnrollment {
    public static HashSet hashSet = new HashSet();
    public static void addCourseCode(String courseCode)
    {
        hashSet.add(courseCode);
        System.out.println("Course added successfully.");
    }
    //Check if a specific course exists
    public static void searchCourseCode(String courseCode) {
        if (hashSet.contains(courseCode))
        {
            System.out.println("Course code Already Exists");
        }
        else
        {
            System.out.println("Course code does not exists");
        }
    }
    //remove a course
    public static void removeCourseCode(String courseCode) {
        if (hashSet.contains(courseCode))
        {
            hashSet.remove(courseCode);
            System.out.println("Course removed Successfully:");
        }
        else {
            System.out.println("Course does not exists");
        }
    }
    //Display all courses
    public static void displayCourseCode() {
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}
