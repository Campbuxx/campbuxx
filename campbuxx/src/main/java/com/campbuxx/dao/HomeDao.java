package com.campbuxx.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.campbuxx.pojo.Category;
import com.campbuxx.pojo.User;




@Repository
public class HomeDao extends SqlSessionDaoSupport {
	
   public User getUser(User user){
       return getSqlSession().selectOne("com.campbuxx.db.getUser", user);
   }
	
	/**
	 *get category
	 * @return
	 */
	public List<Category> getCategory(){
	    return getSqlSession().selectList("com.campbuxx.db.getCategory");
	}

}
