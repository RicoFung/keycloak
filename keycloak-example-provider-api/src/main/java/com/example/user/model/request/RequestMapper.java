package com.example.user.model.request;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.user.model.entity.TbUserInfo0a;
import com.example.user.model.param.TbUserInfo0aGetListParam;
import com.example.user.model.param.TbUserInfo0aGetOneParam;

@Mapper
public interface RequestMapper
{
	RequestMapper INSTANCE = Mappers.getMapper( RequestMapper.class );
	
	@Mapping(target = "tcRowid", ignore = true)
	TbUserInfo0a requestToEntity(TbUserInfo0aCreateRequest request);
	
	TbUserInfo0a requestToEntity(TbUserInfo0aModifyRequest request);
	
	TbUserInfo0aGetOneParam requestToParam(TbUserInfo0aGetOneRequest request);
	
	TbUserInfo0aGetListParam requestToParam(TbUserInfo0aGetListRequest request);
	
}
