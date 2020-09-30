package com.liup.cc.mapper.base;

import java.util.List;

public interface BaseMapper<T> {
	/**
	 * ��ѯ�б�
	 * @param record
	 * @return
	 */
	List<T> getList(T record);
	
	/**
	 * ����ID���ϲ�ѯ�б�
	 * @param list
	 * @return
	 */
	List<T> getListByIds(List<T> list);
	
	/**
	 * ��ѯ����
	 * @param record
	 * @return
	 */
	T getById(T record);
	
	/**
	 * ����
	 * @param list
	 * @return
	 */
	boolean add(List<T> list);
	
	/**
	 * ����
	 * @param record
	 * @return
	 */
	boolean update(T record);
	
	/**
	 * ɾ��
	 * @param list
	 * @return
	 */
	boolean delete(List<T> list);
}
