package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Person {

    private String name;
    private String email;
    private String password;
    private int idNum;

    public Person() {

    }

    public Person(String name, String email, String password, int idNum) {
        this.name= name ;
        this.email=email;
        this.password = password;
        this.idNum = idNum ;
    }

    public Person(int idNum, String password) throws FileNotFoundException {
        this.idNum= idNum ;
        this.password = password;


    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }


    public void write() throws FileNotFoundException {
        File facultyInfo = new File("FacultyInformation.txt");
        PrintWriter pw = new PrintWriter(facultyInfo);
        pw.println(this.name);
        pw.println(this.name);
        pw.println(this.name);
        pw.close();

    }

    public String toString() {
        return String.format("%s  %s  %s %s",this.name,this.email,this.password, this.idNum);
    }
}
