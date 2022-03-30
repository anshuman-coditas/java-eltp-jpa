package com;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ak");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        Employee employee=entityManager.find(Employee.class,3);
        System.out.println(employee);
//        EntityTransaction transaction=entityManager.getTransaction();
//        transaction.begin();
//        Employee employee=new Employee();
//        employee.setName("Anshuman");
//        employee.setSalary(20000);
//
//        Employee employee1=new Employee();
//        employee1.setName("AK");
//        employee1.setSalary(97000);
//        entityManager.persist(employee);
//        entityManager.persist(employee1);
//        transaction.commit();
//        entityManager.close();
//        entityManagerFactory.close();
    }
}
