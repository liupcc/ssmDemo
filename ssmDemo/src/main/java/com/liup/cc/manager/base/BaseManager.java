package com.liup.cc.manager.base;

import java.util.List;

public interface BaseManager<T> {
	/**
	 * 获取对象集合
	 * @param record
	 * @return
	 */
	List<T> getList(T record);
	
	/**
	 * 根据id查询
	 * @param list
	 * @return
	 */
	List<T> getListByIds(List<T> list);
	
	/**
	 * 根据id查询
	 * @param record
	 * @return
	 */
	T getById(T record);
	
	/**
	 * 增加
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
