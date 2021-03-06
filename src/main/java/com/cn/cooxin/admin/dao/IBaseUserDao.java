/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.cooxin.admin.dao;

import com.cn.cooxin.admin.entity.BaseUser;
import com.cn.cooxin.code.entity.Partion;

import java.util.List;
import java.util.Map;

/**
 * 用户信息DAO接口
 * 
 * @author airufei
 * @version 2017-02-13
 */
@SuppressWarnings("all")
public interface IBaseUserDao {

	/**
	 * 删除数据（逻辑删除）
	 * 
	 * @param question
	 * @return
	 */
	public void delete(long id);

	/**
	 * 单条数据增加
	 * 
	 * @param baseUser
	 * @return
	 */
	public void add(BaseUser baseUser);

	/**
	 * 批量数据增加
	 * 
	 * @param baseUser
	 * @return
	 */
	public void addTrainRecordBatch(List<BaseUser> list);

	/**
	 * 获取单条数据
	 * 
	 * @param id
	 * @return
	 */
	public BaseUser getBaseUserById(long id);

	/**
	 * 修改单条数据
	 * 
	 * @param id
	 * @return
	 */
	public void updateById(BaseUser baseUser);

	/**
	 * 获取分页数据
	 * 
	 * @param map
	 * @return
	 */
	public List<BaseUser> getList(Map map);

	/**
	 * 获取集合数据，不带分页
	 * 
	 * @param map
	 * @return
	 */
	public List<BaseUser> getBaseUserList(BaseUser baseUser);

	/**
	 * 获取分页记录总数
	 * 
	 * @param map
	 * @return
	 */
	public int getTotalCount(Map map);

	/**
	 * updatePwd:(重置密码)
	 * 
	 * @Author airufei
	 * @param baseUser
	 */
	public void updatePwd(BaseUser baseUser);

}