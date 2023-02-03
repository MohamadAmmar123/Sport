package sport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import sport.Student;
class StudentList2 
{
    public StudentList2()
    {
    }
    void inputStudentInfo(Student student)
    {
        try
        {
            File outFile = new File("StudentTextFile.txt");//saving to txt file
            FileWriter outFileStream =  new FileWriter(outFile,true);
            PrintWriter outStream = new PrintWriter(outFileStream);

            outStream.println(student.getName());
            outStream.println(student.getMatricNo());
            outStream.println(student.getInasis());
            outStream.println(student.getPhoneNum());
            outStream.println(student.getItem());
            outStream.println(student.getProgramme());
            outStream.println(student.getCollage());
            outStream.close();
            DisplayStudentInfo();
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }       
    }
    Student SearchStudentInfo(String matric)
    {
        Student student = null;
            
        String name = null, matricNo = null, inasis = null, phoneNum = null, programme = null, collage = null, item = null;
       
       
        try
        {
            File inFile = new File("StudentTextFile.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufReader = new BufferedReader(fileReader);
            
            String dataName = bufReader.readLine();
            while (dataName != null)
            {
                matricNo = dataName;
                name = bufReader.readLine();
                inasis = bufReader.readLine();
                phoneNum = bufReader.readLine();
                programme = bufReader.readLine();
                collage = bufReader.readLine();
                item= bufReader.readLine();
                
                if (matricNo.equalsIgnoreCase(matric))
                {
                    student = new Student(name, matricNo, inasis, phoneNum, programme,  collage, item);
                }
                 
                dataName = bufReader.readLine();
                
                                
            } // while()
            bufReader.close();
        } // try
        catch(FileNotFoundException excep)
        {
            System.out.println("File is not found");
            excep.getStackTrace();
            excep.getMessage();
        }
        catch(IOException ioEx)
        {
            ioEx.getStackTrace();
            ioEx.getMessage();
        }
        return student;
    
    }
    void UpdateStudentInfo(Student student)
    {
        LinkedList<Student> students = new LinkedList<Student>();
        
        Student stud; // stud = student
                   
        String name = null, matricNo = null, inasis = null, phoneNum = null, programme = null, collage = null, item = null;
          // readd all records from file and store into arraylist
        try
        {
            File inFile = new File("CustomerTextFile.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufReader = new BufferedReader(fileReader);
            
            String dataName = bufReader.readLine();
            while (dataName != null)
            {
                matricNo = dataName;
                name = bufReader.readLine();
                inasis = bufReader.readLine();
                phoneNum = bufReader.readLine();
                programme = bufReader.readLine();
                collage = bufReader.readLine();
                item= bufReader.readLine();
                stud = new Student(name, matricNo, inasis, phoneNum, programme,  collage, item);
        
                students.add(stud);   // add each record/ object into arraylist
                 
                dataName = bufReader.readLine();
                         
            } // while()
            bufReader.close();
        } // try
        catch(FileNotFoundException excep)
        {
            System.out.println("File is not found");
            excep.getStackTrace();
            excep.getMessage();
        }
        catch(IOException ioEx)
        {
            ioEx.getStackTrace();
            ioEx.getMessage();
        }
        
        // do a comparison and update in the array list
        String searchAcc = student.getMatricNo();
        for (int i=0; i<students.size();i++)
        {
            if (students.get(i).getMatricNo().equalsIgnoreCase(searchAcc))
            {
                // updata other data in array list
                students.get(i).setName(student.getName());
                students.get(i).setMatricNo(student.getMatricNo());
                students.get(i).setInasis(student.getInasis());
                students.get(i).setPhoneNum(student.getPhoneNum());
                students.get(i).setProgramme(student.getProgramme());
                students.get(i).setCollage(student.getCollage());
                students.get(i).setItem(student.getItem());
                // save all record into text file
            }
        }
        try
        {
            File outFile = new File("StudentTextFile.txt");
            FileWriter outFileStream =  new FileWriter(outFile);
            PrintWriter outStream = new PrintWriter(outFileStream);
            
            for (int i=0; i<students.size(); i++)
            {
                outStream.println(students.get(i).getName());
                outStream.println(students.get(i).getMatricNo());
                outStream.println(students.get(i).getInasis());
                outStream.println(students.get(i).getPhoneNum());
                outStream.println(students.get(i).getProgramme());
                outStream.println(students.get(i).getCollage());
                outStream.println(students.get(i).getItem());
            }
            outStream.close();
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }
        
    }
    LinkedList<Student> DisplayStudentInfo() throws FileNotFoundException, IOException
    {
        LinkedList<Student> student = new LinkedList<Student>();
        
        Student stud; // stud = student
                   
        //String name = null, matricNo = null, inasis = null, phoneNum = null, programme = null, collage = null, currentSem = null;
          // readd all records from file and store into arraylist
        
       
            File inFile = new File("StudentTextFile.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufReader = new BufferedReader(fileReader);
            
            String dataName = bufReader.readLine();
            while (dataName != null)
            {
                String matricNo = dataName;
                String name = bufReader.readLine();
                String inasis = bufReader.readLine();
                String phoneNum = bufReader.readLine();
                String programme = bufReader.readLine();
                String collage = bufReader.readLine();
                String item= bufReader.readLine();
                stud = new Student(name, matricNo, inasis, phoneNum, programme,  collage, item);
                student.add(stud);   // add each record/ object into arraylist
                System.out.printf("%-20s%-15s%-15s%-15s%-10s%-10s%-10s\n",name,matricNo,inasis,phoneNum,item,programme,collage);
                
                dataName = bufReader.readLine();
            }
            bufReader.close();
            fileReader.close();
            return student;

    }
    void deleteStudentInfo(String matric) {
        LinkedList<Student> student = new LinkedList<Student>();
        
        Student stud; // stud = student
                   
        String name = null, matricNo = null, inasis = null, phoneNum = null, programme = null, collage = null, item = null;
          // readd all records from file and store into arraylist
        try
        {
            File inFile = new File("StudentTextFile.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufReader = new BufferedReader(fileReader);
            
            String dataName = bufReader.readLine();
            while (dataName != null)
            {
                matricNo = dataName;
                name = bufReader.readLine();
                inasis = bufReader.readLine();
                phoneNum = bufReader.readLine();
                programme = bufReader.readLine();
                collage = bufReader.readLine();
                item= bufReader.readLine();
                stud = new Student(name, matricNo, inasis, phoneNum, programme,  collage, item);
        
                student.add(stud);   // add each record/ object into arraylist
                 
                dataName = bufReader.readLine();
            }
            bufReader.close();
        } // try
        catch(FileNotFoundException excep)
        {
            System.out.println("File is not found");
            excep.getStackTrace();
            excep.getMessage();
        }
        catch(IOException ioEx)
        {
            ioEx.getStackTrace();
            ioEx.getMessage();
        }
        
        // do a comparison and remove data in the array list
        
        for (int i=0; i<student.size();i++)
        {
            if (student.get(i).getMatricNo().equalsIgnoreCase(matric))
            {
                // delete record in array list
                student.remove(i);
                
            }
        }  
        addAllStudInFile(student);
    }
     private void addAllStudInFile(LinkedList<Student> student) {
       try
        {
            File outFile = new File("StudentTextFile.txt");
            FileWriter outFileStream =  new FileWriter(outFile);
            PrintWriter outStream = new PrintWriter(outFileStream);
            
            for (int i=0; i<student.size(); i++)
            {
                outStream.println(student.get(i).getName());
                outStream.println(student.get(i).getMatricNo());
                outStream.println(student.get(i).getInasis());
                outStream.println(student.get(i).getPhoneNum());
                outStream.println(student.get(i).getProgramme());
                outStream.println(student.get(i).getCollage());
                outStream.println(student.get(i).getItem());
            }
            outStream.close();
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }
    }
// addAllStaffInFile()
}

