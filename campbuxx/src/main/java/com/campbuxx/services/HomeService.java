package com.campbuxx.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campbuxx.dao.HomeDao;
import com.campbuxx.dao.Page;
import com.campbuxx.pojo.Category;
import com.campbuxx.pojo.Post;
import com.campbuxx.pojo.User;

@Service
public class HomeService
{
    @Autowired
    HomeDao hDao;

    /**
     * validate user
     * @param user
     * @return
     */
    public boolean validateUser(User user)
    {
        User vu = hDao.getUser(user);

        if (vu == null)
        {
            return false;
        }
        return true;
    }
    
    /**
     * return post list and the total page number
     * @param pageNum
     * @return
     */
    public Map<Integer,Object> getList(Integer pageNum){
        Page page = new Page();
        Integer itemsCount = hDao.countItems();
        itemsCount = itemsCount==null?0:itemsCount;
        page.setCount(itemsCount);
        page.buildPage(pageNum, itemsCount, 10);
        List<Post> list = hDao.getPostList(page);
        Map<Integer,Object> map = new HashMap<Integer,Object>();
        map.put(1, list);
        map.put(2, page.getPageCount());
        return map ;
    }
    
    /**
     * get the item detail
     * @param id
     * @return
     */
    public Post getPostDetail(Integer id){
        return hDao.getPostDetail(id);
    }
    
    public boolean savePost(Post post){
        Boolean result = hDao.savePost(post);
        return result ;
    }

}
