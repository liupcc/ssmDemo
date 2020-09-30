package com.liup.cc.mapper.base;

import java.util.List;

public interface BaseMapper<T> {
	/**
	 * 查询列表
	 * @param record
	 * @return
	 */
	List<T> getList(T record);
	
	/**
	 * 根据ID集合查询列表
	 * @param list
	 * @return
	 */
	List<T> getListByIds(List<T> list);
	
	/**
	 * 查询单个
	 * @param record
	 * @return
	 */
	T getById(T record);
	
	/**
	 * 新增
	 * @param list
	 * @return
	 */
	boolean add(List<T> list);
	
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	boolean update(T record);
	
	/**
	 * 删除
	 * @param list
	 * @return
	 */
	boolean delete(List<T> list);
}
