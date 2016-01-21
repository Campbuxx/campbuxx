package com.campbuxx.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.campbuxx.pojo.Category;
import com.campbuxx.pojo.Restaurant;



@Repository
public class HomeDao extends SqlSessionDaoSupport {
	
    /**
     * select restaurants
     * @param res
     * @return
     */
	public List<Restaurant> getRestaurants(Restaurant res ){
		return getSqlSession().selectList("com.rts.db.selectRestaurants" , res);
	}
	
	/**
     * select restaurants For learning
     * @param res
     * @return
     */
    public List<Restaurant> getRestaurantsForLearning(Restaurant res ){
        return getSqlSession().selectList("com.rts.db.selectRestaurantsByLearning" , res);
    }
	
	/**
	 * select category
	 * @param c
	 * @return
	 */
	public List<Category> getCategory(Category c){
	    return getSqlSession().selectList("com.rts.db.selectCategory" , c);
	}

}
