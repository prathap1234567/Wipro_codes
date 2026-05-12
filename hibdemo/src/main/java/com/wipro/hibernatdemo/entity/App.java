package com.wipro.hibernatdemo.entity;
import java.util.List;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class App {

    public static void main(String[] args){
        int opt=0;
        while (opt!= 9){
            System.out.println("------ MENU ------");
            System.out.println("1 Add Student");
            System.out.println("2 Find By ID");
            System.out.println("3 Find All");
            System.out.println("4 Delete By ID");
            System.out.println("5 Update Marks");
            System.out.println("6 Find By Department");
            System.out.println("9 Exit");

            Scanner sc = new Scanner(System.in);
            opt=sc.nextInt();
            System.out.println("opt="+opt);
            if (opt==1) {
            	insertStudent();
            }
            else if(opt==2) {
            	findById();
            }
            else if(opt==3){
            	findAll();
            }
            else if(opt==4){
            	deleteById();
            }
            else if(opt==5){
            	updateMarks();
            }
            else if(opt==6) {
            	findByDepartment();
            }
            else if(opt== 9) {
            	break;
            }
        }
    }

    static void insertStudent()
    {
        SessionFactory factory=
                new Configuration()
                        .configure()
                        .buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name ");
        String name=sc.nextLine();

        System.out.println("Enter Age ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department ");
        String dept=sc.nextLine();
        System.out.println("Enter Marks ");
        double marks =sc.nextDouble();
        Student s = new Student(name,age,dept,marks);
        session.persist(s);
        t.commit();

    }
    static void findById(){

    	 SessionFactory factory =
	                new Configuration()
	                        .configure()
	                        .buildSessionFactory();

    	 Session session=factory.openSession();
        Transaction t =session.beginTransaction();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID ");
        int id=sc.nextInt();
        Student s= session.find(Student.class,id);

        if (s!=null)
            System.out.println(s);
        else
            System.out.println("Student not found");
        t.commit();
    }

    static void findAll(){
    	 SessionFactory factory =
	                new Configuration()
	                        .configure()
	                        .buildSessionFactory();

		 Session session = factory.openSession();
        Transaction t=session.beginTransaction();
        List<Student>list=session
                .createQuery("from Student",Student.class)
                .getResultList();
        list.forEach(System.out::println);
        t.commit();
    }

    static void deleteById() {
    	 SessionFactory factory =
	                new Configuration()
	                        .configure()
	                        .buildSessionFactory();

		 Session session = factory.openSession();

        Transaction t=session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID ");
        int id=sc.nextInt();
        Student s=session.find(Student.class,id);
            session.remove(s);
        t.commit();
    }

    static void updateMarks(){
    	 SessionFactory factory =
	                new Configuration()
	                        .configure()
	                        .buildSessionFactory();

		 Session session = factory.openSession();

        Transaction t=session.beginTransaction();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ID ");
        int id=sc.nextInt();
        Student s=session.find(Student.class,id);
   
            System.out.println("Enter New Marks ");
            double marks=sc.nextDouble();
            s.setMarks(marks);
            session.persist(s);
        t.commit();
    }

    static void findByDepartment() {
    	 SessionFactory factory =
	                new Configuration()
	                        .configure()
	                        .buildSessionFactory();

		 Session session = factory.openSession();

        Transaction t=session.beginTransaction();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Department ");
        String dept=sc.nextLine();
        Query<Student> q= session.createQuery(
                "from Student s where s.department=:dept",
                Student.class);
        q.setParameter("dept",dept);
        List<Student>list=q.getResultList();
        list.forEach(System.out::println);
        t.commit();
    }
}