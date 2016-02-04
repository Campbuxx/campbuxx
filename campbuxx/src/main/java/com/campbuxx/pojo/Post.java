package com.campbuxx.pojo;

import java.util.Date;

public class Post
{
    private Integer id ;
    private String title ;
    private Integer category;
    private String content ;
    private Date createDate;
    private User user;
    private Integer studentID;
    
    
    
    public Integer getStudentID()
    {
        return studentID;
    }
    public void setStudentID(Integer studentID)
    {
        this.studentID = studentID;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public Integer getCategory()
    {
        return category;
    }
    public void setCategory(Integer category)
    {
        this.category = category;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public Date getCreateDate()
    {
        return createDate;
    }
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }
    public User getUser()
    {
        return user;
    }
    public void setUser(User user)
    {
        this.user = user;
    }
    
    
}
