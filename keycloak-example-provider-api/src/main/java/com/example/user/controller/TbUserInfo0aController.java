package com.example.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.model.entity.TbUserInfo0a;
import com.example.user.model.param.TbUserInfo0aGetListParam;
import com.example.user.model.param.TbUserInfo0aGetOneParam;
import com.example.user.model.param.TbUserInfo0aGetOneParam.DynamicWhere;
import com.example.user.model.request.RequestMapper;
import com.example.user.model.request.TbUserInfo0aCreateRequest;
import com.example.user.model.request.TbUserInfo0aGetListRequest;
import com.example.user.model.request.TbUserInfo0aGetOneRequest;
import com.example.user.model.request.TbUserInfo0aModifyRequest;
import com.example.user.model.request.TbUserInfo0aRemoveRequest;
import com.example.user.model.result.TbUserInfo0aResult;
import com.example.user.service.TbUserInfo0aService;

import chok2.devwork.BaseRestController;
import chok2.devwork.pojo.ChokDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "-TbUserInfo0a")
@RestController(value = "TbUserInfo0aController")
@RequestMapping("/tbuserinfo0a")
public class TbUserInfo0aController extends BaseRestController
{
	// --------------------------------------------------------------------------------------- //
	// value: 指定请求的实际地址， 比如 /action/info之类
	// method： 指定请求的method类型， GET、POST、PUT、DELETE等
	// consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
	// produces: 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
	// requests： 指定request中必须包含某些参数值是，才让该方法处理
	// headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求
	// --------------------------------------------------------------------------------------- //

	@SuppressWarnings("unused")
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private TbUserInfo0aService service;

//	@Operation(summary = "新增")
//	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//	public ChokDto<Object> create(@RequestBody @Validated TbUserInfo0aCreateRequest request)
//	{
//		TbUserInfo0a entity = RequestMapper.INSTANCE.requestToEntity(request);
//		return service.create(entity);
//	}
//
//	@Operation(summary = "删除")
//	@RequestMapping(value = "/remove", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//	public ChokDto<Object> remove(@RequestBody @Validated TbUserInfo0aRemoveRequest request)
//	{
//         return service.remove(request.getTcRowidArray());
//	}
//
//	@Operation(summary = "修改")
//	@RequestMapping(value = "/modify", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//	public ChokDto<Object> modify(@RequestBody @Validated TbUserInfo0aModifyRequest request)
//	{
//		TbUserInfo0a entity = RequestMapper.INSTANCE.requestToEntity(request);
//		return service.modify(entity);
//	}
//
//	@Operation(summary = "明细")
//	@RequestMapping(value = "/getOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//	public ChokDto<TbUserInfo0aResult> getOne(@RequestBody @Validated TbUserInfo0aGetOneRequest request)
//	{
//		TbUserInfo0aGetOneParam param = RequestMapper.INSTANCE.requestToParam(request);
//		return service.getOne(param);
//	}
//
//	@Operation(summary = "列表")
//	@RequestMapping(value = "/getList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//	public ChokDto<List<TbUserInfo0aResult>> getList(@RequestBody @Validated TbUserInfo0aGetListRequest request)
//	{
//		TbUserInfo0aGetListParam param = RequestMapper.INSTANCE.requestToParam(request);
//		return service.getList(param);
//	}

	@GetMapping("/{id}")
	public ResponseEntity<TbUserInfo0aResult> getOne(@PathVariable Long id)
	{
		TbUserInfo0aGetOneParam param = new TbUserInfo0aGetOneParam();
		DynamicWhere dw = new DynamicWhere();
		dw.setTcRowid(id);
		param.setDynamicWhere(dw);
		param.setDynamicColumns(new String[]{"tcRowid","tcCode","tcName","tcPassword"});
		ChokDto<TbUserInfo0aResult> dto = service.getOne(param);
		TbUserInfo0aResult result = dto.getData();
		if (result == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getOneByCode/{code}")
	public ResponseEntity<TbUserInfo0aResult> getOneByCode(@PathVariable String code)
	{
		TbUserInfo0aGetOneParam param = new TbUserInfo0aGetOneParam();
		DynamicWhere dw = new DynamicWhere();
		dw.setTcCode(code);
		param.setDynamicWhere(dw);
		param.setDynamicColumns(new String[]{"tcRowid","tcCode","tcName","tcPassword"});
		ChokDto<TbUserInfo0aResult> dto = service.getOne(param);
		TbUserInfo0aResult result = dto.getData();
		if (result == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getOneByName/{name}")
	public ResponseEntity<TbUserInfo0aResult> getOneByName(@PathVariable String name)
	{
		TbUserInfo0aGetOneParam param = new TbUserInfo0aGetOneParam();
		DynamicWhere dw = new DynamicWhere();
		dw.setTcName(name);
		param.setDynamicWhere(dw);
		param.setDynamicColumns(new String[]{"tcRowid","tcCode","tcName","tcPassword"});
		ChokDto<TbUserInfo0aResult> dto = service.getOne(param);
		TbUserInfo0aResult result = dto.getData();
		if (result == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(result);
	}
    
    @GetMapping("/getList")
    public ResponseEntity<List<TbUserInfo0aResult>> getList(@RequestParam(required = false) String search, @RequestParam Integer first, @RequestParam Integer max)
    {
    	TbUserInfo0aGetListParam param = new TbUserInfo0aGetListParam();
    	com.example.user.model.param.TbUserInfo0aGetListParam.DynamicWhere dw = new com.example.user.model.param.TbUserInfo0aGetListParam.DynamicWhere();
    	dw.setTcCode(search);
    	param.setDynamicWhere(dw);
		param.setDynamicColumns(new String[]{"tcRowid","tcCode","tcName","tcPassword"});
    	param.setPage(first);
    	param.setPagesize(max);
    	ChokDto<List<TbUserInfo0aResult>> dto = service.getList(param);
    	List<TbUserInfo0aResult> result = dto.getData();
    	if (result == null) {
    		return ResponseEntity.notFound().build();
    	}
    	return ResponseEntity.ok(result);
    }

	@GetMapping("/getCount")
	public Integer getCount()
	{
		ChokDto<Integer> dto = service.getCount(null);
		Integer result = dto.getData();
		return result;
	}
}
