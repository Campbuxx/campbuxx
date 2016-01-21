package com.campbuxx.pojo;

import java.util.Date;

public class Restaurant
{
    private Integer id;
    private Integer rate;
    private String name ;
    private Integer category ;
    private Integer distance ;
    private Date lastTime;
    private Integer fav;
    private Integer cost;
    
    public Date getLastTime()
    {
        return lastTime;
    }
    public void setLastTime(Date lastTime)
    {
        this.lastTime = lastTime;
    }
    public Integer getFav()
    {
        return fav;
    }
    public void setFav(Integer fav)
    {
        this.fav = fav;
    }
    public Integer getCost()
    {
        return cost;
    }
    public void setCost(Integer cost)
    {
        this.cost = cost;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getRate()
    {
        return rate;
    }
    public void setRate(Integer rate)
    {
        this.rate = rate;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getCategory()
    {
        return category;
    }
    public void setCategory(Integer category)
    {
        this.category = category;
    }
    public Integer getDistance()
    {
        return distance;
    }
    public void setDistance(Integer distance)
    {
        this.distance = distance;
    }
    
    
}
