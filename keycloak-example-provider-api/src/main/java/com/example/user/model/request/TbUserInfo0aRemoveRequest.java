package com.example.user.model.request;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "TbUserInfo0aRemoveRequest 删除入参")
public class TbUserInfo0aRemoveRequest implements Serializable
{
	private static final long serialVersionUID = 1L;

	@NotNull(message = "tcRowidArray必传！")
    @Size(min = 1, message = "最少选一条记录！")
	private String[] tcRowidArray;

	public String[] getTcRowidArray() 
	{
		return this.tcRowidArray;
	}
	public void setTcRowidArray(String[] value) 
	{
		this.tcRowidArray = value;
	}
}

