package com.campbuxx.pojo;

public class User
{

    private String firstName ;
    private String lastName ;
    private Integer studentID;
    private String password;
    private String phone ;
    
    
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public Integer getStudentID()
    {
        return studentID;
    }
    public void setStudentID(Integer studentID)
    {
        this.studentID = studentID;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
   
    
}
