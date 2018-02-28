package com.xxl.conf.admin.service;


import com.xxl.conf.admin.core.model.XxlConfNode;
import com.xxl.conf.admin.core.util.ReturnT;

import java.util.Map;

/**
 * @author xuxueli 2015-9-4 18:19:52
 */
public interface IXxlConfNodeService {

	public Map<String,Object> pageList(int offset, int pagesize, String appname, String key);

	public ReturnT<String> delete(String key);

	public ReturnT<String> add(XxlConfNode xxlConfNode);

	public ReturnT<String> update(XxlConfNode xxlConfNode);

}
