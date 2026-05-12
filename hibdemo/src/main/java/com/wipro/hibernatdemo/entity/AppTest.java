package com.wipro.hibernatdemo.entity;
import org.hibernate.*;
import org.hibernate.cfg.*;
import com.wipro.hibernatdemo.entity.User;
import com.wipro.hibernatdemo.entity.UserProfile;

import java.util.List;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args){
        int opt=0;
        while (opt!= 9){

            System.out.println("------ MENU ------");
            System.out.println("1 Create User With Profile");
            System.out.println("2 Display All Users");
            System.out.println("3 Find User By ID");
            System.out.println("4 Update Profile");
            System.out.println("5 Delete User");
            System.out.println("9 Exit");

            Scanner sc=new Scanner(System.in);
            opt=sc.nextInt();
            System.out.println("opt="+opt);

            if (opt==1) {
                createUserWithProfile();
            }
            else if(opt==2){
                viewAllUsers();
            }
            else if(opt==3){
                searchUserById();
            }
            else if(opt==4){
                updateProfile();
            }
            else if(opt==5){
                deleteUser();
            }
            else if(opt== 9) {
                break;
            }
        }
    }

    static void createUserWithProfile(){
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username ");
        String username = sc.nextLine();

        System.out.println("Enter Email ");
        String email = sc.nextLine();
        System.out.println("Enter Phone ");
        String phone = sc.nextLine();
        System.out.println("Enter Address ");
        String address = sc.nextLine();
        System.out.println("Enter Gender ");
        String gender = sc.nextLine();
        UserProfile profile = new UserProfile(phone,address,gender);
        User user = new User(username,email,profile);

        session.persist(user);
        t.commit();
    }

    static void viewAllUsers(){
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .buildSessionFactory();

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        List<User> list = session
                .createQuery("from User",User.class)
                .getResultList();
        list.forEach(user -> user.displayUserDetails());
        t.commit();
    }

    static void searchUserById(){
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .buildSessionFactory();

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID ");
        int id = sc.nextInt();
        User user = session.find(User.class,id);
        if (user!=null)
            user.displayUserDetails();
        else
            System.out.println("User not found");
        t.commit();
    }

    static void updateProfile(){
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .buildSessionFactory();

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID ");
        int id = sc.nextInt();
        sc.nextLine();
        User user = session.find(User.class,id);
        if (user!=null && user.getProfile()!=null){
            System.out.println("Enter New Phone ");
            String phone = sc.nextLine();
            user.getProfile().setPhone(phone);
            System.out.println("Enter New Address ");
            String address = sc.nextLine();
            user.getProfile().setAddress(address);

        }
        else{
            System.out.println("User not found");
        }

        t.commit();
    }
    static void deleteUser(){
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID ");
        int id = sc.nextInt();
        User user = session.find(User.class,id);
        if (user!=null)
            session.remove(user);
        else
            System.out.println("User not found");

        t.commit();
    }
}