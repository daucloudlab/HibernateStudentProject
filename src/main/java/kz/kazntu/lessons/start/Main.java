package kz.kazntu.lessons.start;


import kz.kazntu.lessons.models.Group;
import kz.kazntu.lessons.models.Student;
import kz.kazntu.lessons.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory() ;
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;

        Group group1 = new Group("Впб-13-1k") ;
        Group group2 = new Group("Впб-13-2k") ;

        Student student1 = new Student("Абиев", "Амирбек", group1) ;
        Student student2 = new Student("Абай", "Айбек", group2) ;
        Student student3 = new Student("Қаппар", "Бегайым", group2) ;
        Student student4 = new Student("Жансерикова", "Жұлдыз", group2) ;
        Student student5 = new Student("Нұрхамит", "Самғар", group2) ;
        Student student6 = new Student("Мақсат", "Жанат", group2) ;
        Student student7 = new Student("Ақберді", "Дина", group2) ;
        Student student8 = new Student("Ертаева", "Жансұлу", group1) ;
        Student student9 = new Student("Байкен", "Елжас", group1) ;
        Student student10 = new Student("Серікбаева", "Әсел", group1) ;

        Set<Student> studentsGroup1 = new HashSet<Student>() ;
        Set<Student> studentsGroup2 = new HashSet<Student>() ;

        studentsGroup1.add(student1) ;
        studentsGroup1.add(student8) ;
        studentsGroup1.add(student9) ;
        studentsGroup1.add(student10) ;
        group1.setStudents(studentsGroup1);

        studentsGroup2.add(student2) ;
        studentsGroup2.add(student3) ;
        studentsGroup2.add(student4) ;
        studentsGroup2.add(student5) ;
        studentsGroup2.add(student6) ;
        studentsGroup2.add(student7) ;
        group2.setStudents(studentsGroup2);

        session.save(group1) ;
        session.save(group2) ;

        session.getTransaction().commit();
        session.close();
    }
}
