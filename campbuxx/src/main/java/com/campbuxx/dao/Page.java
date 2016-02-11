package com.campbuxx.dao;

import java.util.Map;

/**
 * for paging
 * @author zhao_zl_
 *
 */
public class Page {
	
	private Integer id ;
	private Integer page ; //current page num
	private Integer previous;
	private Integer next;
	private Integer count; //count of items
	
	private Integer rowsPerPage ;
	private Integer startRow ;
	private Integer endRow ;
	private Integer pageCount;
	
	private String order = "desc";
	
	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount() {
		this.count = (count%rowsPerPage)>0?(1+count/rowsPerPage):(count/rowsPerPage);
	}


	public void buildPage(int pageNum , int totalNum, int rowsPerPage){
	    this.rowsPerPage = rowsPerPage;
	    this.page = pageNum ;
	    this.count = totalNum;
	    setStartRow();
	    setEndRow();
	    setPrevious();
	    setNext();
	}

	public Page() {
		rowsPerPage = 0 ;
		startRow = 0 ;
		endRow = 0 ;
		pageCount = 0 ;
		page = 1 ;
		previous = 1;
		next = 1 ;
		count = 0 ;
		
	}

		
		
	
	public Integer getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(Integer rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow() {
		startRow =  (page - 1)*rowsPerPage;
	}
	public Integer getEndRow() {
		return endRow;
	}
	public void setEndRow() {
		endRow = count<=rowsPerPage?count:page>=pageCount?(page-1)*rowsPerPage+((count%rowsPerPage)==0?rowsPerPage:(count%rowsPerPage)):(page-1)*rowsPerPage+rowsPerPage;
	}
	public Integer getPrevious() {
		return previous;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public void setPrevious() {
		previous = page==1?1:page-1;
	}
	public Integer getNext() {
		return next;
	}
	public void setNext() {
		next = page < pageCount?page+1 :pageCount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order.equalsIgnoreCase("asc")?"asc":"desc";
	}
	@SuppressWarnings("unchecked")
    public void toMap(Map params){
		params.put("id", id);
		params.put("startRow", startRow);
		params.put("endRow", endRow);
		params.put("order", order);
	}

}
