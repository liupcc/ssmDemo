package com.liup.cc.service.base.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liup.cc.manager.base.BaseManager;
import com.liup.cc.service.base.BaseService;

@Service
public class BaseServiceImpl<T> implements BaseService<T>{
	@Autowired
	private BaseManager<T> baseManager;
	
	public PageInfo<T> getPageList(T record, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum.intValue(), pageSize.intValue());
		PageInfo<T> pageInfo = new PageInfo(baseManager.getList(record));
		return pageInfo;
	}

	@Override
	public List<T> getList(T record) {
		return baseManager.getList(record);
	}

	@Override
	public List<T> getListByIds(List<T> list) {
		return baseManager.getListByIds(list);
	}

	@Override
	public T getById(T record) {
		return baseManager.getById(record);
	}

	@Override
	public boolean add(List<T> list) {
		if(CollectionUtils.isEmpty(list)) return false;
		return baseManager.add(list);
	}

	@Override
	public boolean update(T record) {
		return baseManager.update(record);
	}

	@Override
	public boolean delete(List<T> list) {
		if(CollectionUtils.isEmpty(list)) return false;
		return baseManager.delete(list);
	}

}
