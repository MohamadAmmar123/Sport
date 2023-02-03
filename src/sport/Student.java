/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sport;

import java.util.LinkedList;

public class Student 
{
    //LinkedList<Student>  = new LinkedList<Student>();
    static String name;
    static String matricNo;
    static String inasis;
    static String phoneNum;
    static String item;
    static String programme;
    static String collage;
    static Student next;
    
     public Student(String n,String mn, String in, String pn, String i, String p,String c)
    {
        name=n;
        matricNo=mn;
        inasis=in;
        phoneNum=pn;
        item = i;
        programme=p;
        collage=c;
        next=null;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static String getMatricNo() {
        return matricNo;
    }

    public static void setMatricNo(String matricNo) {
        Student.matricNo = matricNo;
    }

    public static String getInasis() {
        return inasis;
    }

    public static void setInasis(String inasis) {
        Student.inasis = inasis;
    }

    public static String getPhoneNum() {
        return phoneNum;
    }

    public static void setPhoneNum(String phoneNum) {
        Student.phoneNum = phoneNum;
    }

    public static String getItem() {
        return item;
    }

    public static void setItem(String item) {
        Student.item = item;
    }

    public static String getProgramme() {
        return programme;
    }

    public static void setProgramme(String programme) {
        Student.programme = programme;
    }

    public static String getCollage() {
        return collage;
    }

    public static void setCollage(String collage) {
        Student.collage = collage;
    }
    
     public void StudentInfo()
    {
        System.out.printf("%-20s%-15s%-15s%-15s%-10d%-10s%-10s\n",name,matricNo,inasis,phoneNum,item,programme,collage);
    } 
}
