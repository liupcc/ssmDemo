package com.liup.cc.manager.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liup.cc.manager.base.BaseManager;
import com.liup.cc.mapper.base.BaseMapper;

@Service("baseManager")
public class BaseManagerImpl <T, E extends BaseMapper<T>> implements BaseManager<T>{
	
	@Autowired
	private E baseMapper;
	
	/* (non-Javadoc)
	 * @see com.liup.cc.manager.base.BaseManager#getList(java.lang.Object)
	 */
	@Override
	public List<T> getList(T record) {
		return baseMapper.getList(record);
	}

	/* (non-Javadoc)
	 * @see com.liup.cc.manager.base.BaseManager#getListByIds(java.util.List)
	 */
	@Override
	public List<T> getListByIds(List<T> list) {
		return baseMapper.getListByIds(list);
	}

	/* (non-Javadoc)
	 * @see com.liup.cc.manager.base.BaseManager#getById(java.lang.Object)
	 */
	@Override
	public T getById(T record) {
		return baseMapper.getById(record);
	}

	/* (non-Javadoc)
	 * @see com.liup.cc.manager.base.BaseManager#add(java.util.List)
	 */
	@Override
	public boolean add(List<T> list) {
		return baseMapper.add(list);
	}

	/* (non-Javadoc)
	 * @see com.liup.cc.manager.base.BaseManager#update(java.lang.Object)
	 */
	@Override
	public boolean update(T record) {
		return baseMapper.update(record);
	}

	/* (non-Javadoc)
	 * @see com.liup.cc.manager.base.BaseManager#delete(java.util.List)
	 */
	@Override
	public boolean delete(List<T> list) {
		return baseMapper.delete(list);
	}

}
