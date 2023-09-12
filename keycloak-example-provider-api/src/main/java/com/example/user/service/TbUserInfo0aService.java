package com.example.user.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.example.user.dao.TbUserInfo0aDao;
import com.example.user.model.result.TbUserInfo0aResult;
import com.example.user.model.entity.TbUserInfo0a;
import com.example.user.model.param.TbUserInfo0aGetListParam;
import com.example.user.model.param.TbUserInfo0aGetOneParam;

import chok2.devwork.pojo.ChokDto;

//@CacheConfig(cacheNames = {"CACHE_TbUserInfo0a"})
@Service(value = "TbUserInfo0aService")
public class TbUserInfo0aService
{
	@SuppressWarnings("unused")
	private final static Logger logger = LoggerFactory.getLogger(TbUserInfo0aService.class);
	
	@Autowired
	private TbUserInfo0aDao dao;

//	@Caching(evict = { @CacheEvict(allEntries = true) })
	public ChokDto<Object> create(TbUserInfo0a entity)
	{
		dao.create(entity);
		return new ChokDto<Object>();
	}

//	@Caching(evict = { @CacheEvict(allEntries = true) })
	public ChokDto<Object> remove(String[] ids)
	{
		dao.remove(ids);
		return new ChokDto<Object>();
	}

//	@Caching(evict = { @CacheEvict(value = {"CACHE_TbUserInfo0a"}, allEntries = true) })
	public ChokDto<Object> modify(TbUserInfo0a entity)
	{
		dao.modify(entity);
		return new ChokDto<Object>();
	}	

//	@Cacheable(key = "#param")
	public ChokDto<TbUserInfo0aResult> getOne(TbUserInfo0aGetOneParam param) 
	{
		TbUserInfo0aResult result = dao.getOne(param);
		return new ChokDto<TbUserInfo0aResult>(result);
	}

//	@Cacheable(key = "#param")
	public ChokDto<List<TbUserInfo0aResult>> getList(TbUserInfo0aGetListParam param) 
	{
		List<TbUserInfo0aResult> result = dao.getList(param);
		return new ChokDto<List<TbUserInfo0aResult>>(result);
	}
	public ChokDto<Integer> getCount(TbUserInfo0aGetListParam param)
	{
		Integer count = dao.getCount(param);
		return new ChokDto<Integer>(count);
	}
}
