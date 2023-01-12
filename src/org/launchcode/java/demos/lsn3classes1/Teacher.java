package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    //create 4 fields firstName, lastName, subject, and yearsTeaching.
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;
//create a constructor to define what to expect when creating a new instance of the Teacher class and set values
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }
    //create setters-- we are just setting the value, we don't need a return value,
    // so it will be "void" after the access modifier (public, protected, private etc)
    protected void setFirstName(String aFirstName){
        firstName = aFirstName;

    }
    protected void setLastName(String aLastName){
        lastName = aLastName;
    }
    protected void setSubject(String aSubject){
        subject = aSubject;
    }
    protected void setYearsTeaching(int timeTeaching){
        yearsTeaching = timeTeaching;
    }
        //create getters to access values and information
protected String getFirstName(){
        return firstName;
}
protected String getLastName(){
        return lastName;
}
protected String getSubject(){
        return subject;
}
protected int getYearsTeaching(){
        return yearsTeaching;
}

    }

