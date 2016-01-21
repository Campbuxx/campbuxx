package com.campbuxx.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campbuxx.dao.HomeDao;
import com.campbuxx.pojo.Category;
import com.campbuxx.pojo.Restaurant;

@Service
public class HomeService
{
    @Autowired
    HomeDao hDao;

    /**
     * demo
     * @param res
     * @return
     */
    public List<Restaurant> getRestaurants(Restaurant res)
    {

        List<Restaurant> list = hDao.getRestaurants(res);
        if (list == null)
        {
            list = new ArrayList<Restaurant>();
        }
        return list;
    }

    /**
     * getCategory demo
     * @param c
     * @return
     */
    public List<Category> getCategory(Category c)
    {

        List<Category> list = hDao.getCategory(c);
        if (list == null)
        {
            list = new ArrayList<Category>();
        }
        return list;
    }
    
    /**
     * random a restaurant demo
     * @return
     */
    public String getRandom(Integer distance){
        Restaurant res =  new Restaurant();
        if(distance != null){
            res.setDistance(distance);
        }
        List<Restaurant> list= getRestaurants( res);
        int max = list.size();
        Random random = new Random();
        int result = random.nextInt(max);
        return list.get(result).getName();
    }

}
