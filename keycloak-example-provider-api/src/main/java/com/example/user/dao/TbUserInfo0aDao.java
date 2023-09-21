package com.example.user.dao;

import chok2.devwork.dao.BaseDao;
import com.example.user.model.result.TbUserInfo0aResult;
import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

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

	public TbUserInfo0aResult getOneByCodeOrName(String[] dynamicColumns, String codename)
	{
		Map<String, Object> param = new HashedMap();
		param.put("dynamicColumns", dynamicColumns);
		param.put("codename", codename);
		return this.getOne("getOneByCodeOrName", param);
	}
}
