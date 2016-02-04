package com.campbuxx.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campbuxx.dao.HomeDao;
import com.campbuxx.pojo.Category;
import com.campbuxx.pojo.User;

@Service
public class HomeService
{
    @Autowired
    HomeDao hDao;

    public boolean validateUser(User user)
    {
        User vu = hDao.getUser(user);

        if (vu == null)
        {
            return false;
        }
        return true;
    }

}
