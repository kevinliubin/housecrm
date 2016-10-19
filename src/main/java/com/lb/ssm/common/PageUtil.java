package com.lb.ssm.common;

import java.util.List;

/**
 * 分页工具类
 * @author liubin
 *
 */
public class PageUtil<T> {
		
	private int currentPage;//当前页
	private int pageSize;   //每页个数
	private int totalRecord;//总记录数
	private int totalPage;  //总页数
	private List<T> list;//记录列表
	private String sort; //排序名称
	private String order;//排序方式
	private List<String> searchs;//多查询条件
	private String search;//单查询条件
	public PageUtil(){

	}
	public PageUtil(int currentPage, int pageSize) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
	public PageUtil(int currentPage, int pageSize, int totalRecord,int totalPage) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
	}
	/*
	 * 获取当前页数
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	
	public List<String> getSearchs() {
		return searchs;
	}
	public void setSearchs(List<String> searchs) {
		this.searchs = searchs;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	/*
	 * 设置当前页数
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	/*
	 * 获取每页个数
	 */
	public int getPageSize() {
		return pageSize;
	}
	/*
	 * 设置每页个数
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/*
	 * 获取总记录数
	 */
	public int getTotalRecord() {
		return totalRecord;
	}
	/*
	 * 设置总记录数
	 */
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	/*
	 * 获取总条数
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/*
	 * 设置总条数
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
}

	

