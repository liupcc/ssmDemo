package com.liup.cc.domain.base;

import com.alibaba.fastjson.annotation.JSONField;

public class BaseVo {
	@JSONField(serialize = false)
	private int currentPage = 1;
	@JSONField(serialize = false)
	private int pageSize = 10;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
