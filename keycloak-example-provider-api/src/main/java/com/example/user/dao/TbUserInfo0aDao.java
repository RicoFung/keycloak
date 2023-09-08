package com.example.user.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok2.devwork.dao.BaseDao;

@Repository(value = "TbUserInfo0aDao")
public class TbUserInfo0aDao extends BaseDao
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	protected String getSqlNamespace()
	{
		return getClass().getName();
	}
}
