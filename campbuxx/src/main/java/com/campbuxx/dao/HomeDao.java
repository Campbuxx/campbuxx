package com.campbuxx.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.campbuxx.pojo.Category;
import com.campbuxx.pojo.Post;
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
	
	/**
	 * get the number of all items
	 * @return
	 */
	public Integer countItems(){
	    return getSqlSession().selectOne("com.campbuxx.db.countItems");
	}
	
	/**
	 * get the post list
	 * @param page
	 * @return
	 */
	public List<Post> getPostList(Page page){
	    return getSqlSession().selectList("com.campbuxx.db.getPostList",page);
	}
	
	/**
	 * get the post detail
	 * @param id
	 * @return
	 */
	public Post getPostDetail(Integer id){
	    Post post = getSqlSession().selectOne("com.campbuxx.db.getPostDetail",id);
	    User user = new User();
	    user.setStudentID(post.getStudentID());
	    user = getSqlSession().selectOne("com.campbuxx.db.getUser", user);
	    post.setUser(user);
	    return post;
	}
	
	/**
	 * save the post 
	 * @param post
	 * @return
	 */
	public Boolean savePost(Post post){
	    Integer a = getSqlSession().insert("com.campbuxx.db.savePost", post);
	    if(a >0){
	        return true;
	    }
	    return false ;
	}
}
