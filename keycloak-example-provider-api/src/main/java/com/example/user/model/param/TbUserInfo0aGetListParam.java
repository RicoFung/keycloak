package com.example.user.model.param;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TbUserInfo0aGetListParam implements Serializable
{
	private static final long serialVersionUID = 1L;

	// ********************************************************************************************
	// 1.默认参数
	// ********************************************************************************************

	private java.lang.String[] dynamicColumns;
	
	private List<Map<String, Object>> dynamicOrder;
	
	private DynamicWhere dynamicWhere;

	private Integer page;

	private Integer pagesize;

	// ********************************************************************************************
	// 2.表单参数
	// ********************************************************************************************
	
	public static class DynamicWhere implements Serializable
	{
		private static final long serialVersionUID = 1L;
		
	    // 代号       db_column: TC_CODE 
		private java.lang.String tcCode;
	    // 名称       db_column: TC_NAME 
		private java.lang.String tcName;
	    // 描述       db_column: TC_DESCRIPTION 
		private java.lang.String tcDescription;
	    // 添加人行序号       db_column: TC_ADD_USER_ROWID 
		private java.lang.Long tcAddUserRowid;
	    // 添加时间       db_column: TC_ADD_TIME 
		private java.lang.Long tcAddTime;
	    // 修改人行序号       db_column: TC_UPDATE_USER_ROWID 
		private java.lang.Long tcUpdateUserRowid;
	    // 修改时间       db_column: TC_UPDATE_TIME 
		private java.lang.Long tcUpdateTime;
	    // 删除人行序号       db_column: TC_DELETE_USER_ROWID 
		private java.lang.Long tcDeleteUserRowid;
	    // 删除时间       db_column: TC_DELETE_TIME 
		private java.lang.Long tcDeleteTime;
	    // 激活人行序号       db_column: TC_ACTIVE_USER_ROWID 
		private java.lang.Long tcActiveUserRowid;
	    // 激活时间       db_column: TC_ACTIVE_TIME 
		private java.lang.Long tcActiveTime;
	    // 关闭人行序号       db_column: TC_CLOSE_USER_ROWID 
		private java.lang.Long tcCloseUserRowid;
	    // 关闭时间       db_column: TC_CLOSE_TIME 
		private java.lang.Long tcCloseTime;
	    // 公司数据状态       db_column: TC_STATUS 
		private java.lang.String tcStatus;
	    // 密码       db_column: TC_PASSWORD 
		private java.lang.String tcPassword;
	    // 用户类型       db_column: TC_USER_TYPE 
		private java.lang.String tcUserType;
	    // 所属部门行序号       db_column: TC_DEPARTMENT_ROWID 
		private java.lang.Long tcDepartmentRowid;
	    // 修改密码时间       db_column: TC_PWD_MODIFY_TIME 
		private java.lang.String tcPwdModifyTime;
	    // 密码有效时间       db_column: TC_PWD_VALID_TIME 
		private java.lang.Integer tcPwdValidTime;
	    // 登陆失败次数       db_column: TC_FAILURE_TIME 
		private java.lang.Integer tcFailureTime;
	    // 最后登陆时间       db_column: TC_LAST_LOGIN_TIME 
		private java.lang.String tcLastLoginTime;
	    // 店铺是否按集团维护       db_column: TC_IS_USER_ENTERPRISE_MAP_0A 
		private java.lang.String tcIsUserEnterpriseMap0a;
	    // 店铺是否按公司维护       db_column: TC_IS_USER_COMPANY_MAPPING_0A 
		private java.lang.String tcIsUserCompanyMapping0a;
	    // 店铺是否按管理组维护       db_column: TC_IS_USER_GROUP_MAPPING_0A 
		private java.lang.String tcIsUserGroupMapping0a;
	    // 店铺是否按经营性质维护       db_column: TC_IS_USER_METHOD_MAPPING_0A 
		private java.lang.String tcIsUserMethodMapping0a;
	    // 店铺是否按客户维护       db_column: TC_IS_USER_CUSTOMER_MAPPING_0A 
		private java.lang.String tcIsUserCustomerMapping0a;
	    // 店铺是否按门店维护       db_column: TC_IS_USER_STORE_MAPPING_0A 
		private java.lang.String tcIsUserStoreMapping0a;
	    // 店铺是否按国家维护       db_column: TC_IS_USER_COUNTRY_MAPPING_0A 
		private java.lang.String tcIsUserCountryMapping0a;
	    // 店铺是否按经济区维护       db_column: TC_IS_USER_REGION_MAPPING_0A 
		private java.lang.String tcIsUserRegionMapping0a;
	    // 店铺是否按省份维护       db_column: TC_IS_USER_PROVINCE_MAPPING_0A 
		private java.lang.String tcIsUserProvinceMapping0a;
	    // 店铺是否按城市维护       db_column: TC_IS_USER_CITY_MAPPING_0A 
		private java.lang.String tcIsUserCityMapping0a;
	    // 店铺是否按集团查看       db_column: TC_IS_USER_ENTERPRISE_MAP_0B 
		private java.lang.String tcIsUserEnterpriseMap0b;
	    // 店铺是否按公司查看       db_column: TC_IS_USER_COMPANY_MAPPING_0B 
		private java.lang.String tcIsUserCompanyMapping0b;
	    // 店铺是否按管理组查看       db_column: TC_IS_USER_GROUP_MAPPING_0B 
		private java.lang.String tcIsUserGroupMapping0b;
	    // 店铺是否按经营性质查看       db_column: TC_IS_USER_METHOD_MAPPING_0B 
		private java.lang.String tcIsUserMethodMapping0b;
	    // 店铺是否按客户查看       db_column: TC_IS_USER_CUSTOMER_MAPPING_0B 
		private java.lang.String tcIsUserCustomerMapping0b;
	    // 店铺是否按门店查看       db_column: TC_IS_USER_STORE_MAPPING_0B 
		private java.lang.String tcIsUserStoreMapping0b;
	    // 店铺是否按国家查看       db_column: TC_IS_USER_COUNTRY_MAPPING_0B 
		private java.lang.String tcIsUserCountryMapping0b;
	    // 店铺是否按经济区查看       db_column: TC_IS_USER_REGION_MAPPING_0B 
		private java.lang.String tcIsUserRegionMapping0b;
	    // 店铺是否按省份查看       db_column: TC_IS_USER_PROVINCE_MAPPING_0B 
		private java.lang.String tcIsUserProvinceMapping0b;
	    // 店铺是否按城市查看       db_column: TC_IS_USER_CITY_MAPPING_0B 
		private java.lang.String tcIsUserCityMapping0b;
	    // 店铺是否按集团指向       db_column: TC_IS_USER_ENTERPRISE_MAP_0C 
		private java.lang.String tcIsUserEnterpriseMap0c;
	    // 店铺是否按公司指向       db_column: TC_IS_USER_COMPANY_MAPPING_0C 
		private java.lang.String tcIsUserCompanyMapping0c;
	    // 店铺是否按管理组指向       db_column: TC_IS_USER_GROUP_MAPPING_0C 
		private java.lang.String tcIsUserGroupMapping0c;
	    // 店铺是否按经营性质指向       db_column: TC_IS_USER_METHOD_MAPPING_0C 
		private java.lang.String tcIsUserMethodMapping0c;
	    // 店铺是否按客户指向       db_column: TC_IS_USER_CUSTOMER_MAPPING_0C 
		private java.lang.String tcIsUserCustomerMapping0c;
	    // 店铺是否按门店指向       db_column: TC_IS_USER_STORE_MAPPING_0C 
		private java.lang.String tcIsUserStoreMapping0c;
	    // 店铺是否按国家指向       db_column: TC_IS_USER_COUNTRY_MAPPING_0C 
		private java.lang.String tcIsUserCountryMapping0c;
	    // 店铺是否按经济区指向       db_column: TC_IS_USER_REGION_MAPPING_0C 
		private java.lang.String tcIsUserRegionMapping0c;
	    // 店铺是否按省份指向       db_column: TC_IS_USER_PROVINCE_MAPPING_0C 
		private java.lang.String tcIsUserProvinceMapping0c;
	    // 店铺是否按城市指向       db_column: TC_IS_USER_CITY_MAPPING_0C 
		private java.lang.String tcIsUserCityMapping0c;
	    // 店铺是否按集团查看销售       db_column: TC_IS_USER_ENTERPRISE_MAP_0D 
		private java.lang.String tcIsUserEnterpriseMap0d;
	    // 店铺是否按公司查看销售       db_column: TC_IS_USER_COMPANY_MAPPING_0D 
		private java.lang.String tcIsUserCompanyMapping0d;
	    // 店铺是否按管理组查看销售       db_column: TC_IS_USER_GROUP_MAPPING_0D 
		private java.lang.String tcIsUserGroupMapping0d;
	    // 店铺是否按经营性质查看销售       db_column: TC_IS_USER_METHOD_MAPPING_0D 
		private java.lang.String tcIsUserMethodMapping0d;
	    // 店铺是否按客户查看销售       db_column: TC_IS_USER_CUSTOMER_MAPPING_0D 
		private java.lang.String tcIsUserCustomerMapping0d;
	    // 店铺是否按门店查看销售       db_column: TC_IS_USER_STORE_MAPPING_0D 
		private java.lang.String tcIsUserStoreMapping0d;
	    // 店铺是否按国家查看销售       db_column: TC_IS_USER_COUNTRY_MAPPING_0D 
		private java.lang.String tcIsUserCountryMapping0d;
	    // 店铺是否按经济区查看销售       db_column: TC_IS_USER_REGION_MAPPING_0D 
		private java.lang.String tcIsUserRegionMapping0d;
	    // 店铺是否按省份查看销售       db_column: TC_IS_USER_PROVINCE_MAPPING_0D 
		private java.lang.String tcIsUserProvinceMapping0d;
	    // 店铺是否按城市查看销售       db_column: TC_IS_USER_CITY_MAPPING_0D 
		private java.lang.String tcIsUserCityMapping0d;
	    // 仓库是否按集团维护       db_column: TC_IS_USER_ENTERPRISE_MAP_0E 
		private java.lang.String tcIsUserEnterpriseMap0e;
	    // 仓库是否按公司维护       db_column: TC_IS_USER_COMPANY_MAPPING_0E 
		private java.lang.String tcIsUserCompanyMapping0e;
	    // 仓库是否按管理组维护       db_column: TC_IS_USER_GROUP_MAPPING_0E 
		private java.lang.String tcIsUserGroupMapping0e;
	    // 仓库是否按经营性质维护       db_column: TC_IS_USER_METHOD_MAPPING_0E 
		private java.lang.String tcIsUserMethodMapping0e;
	    // 仓库是否按客户维护       db_column: TC_IS_USER_CUSTOMER_MAPPING_0E 
		private java.lang.String tcIsUserCustomerMapping0e;
	    // 仓库是否按门店维护       db_column: TC_IS_USER_STORE_MAPPING_0E 
		private java.lang.String tcIsUserStoreMapping0e;
	    // 仓库是否按国家维护       db_column: TC_IS_USER_COUNTRY_MAPPING_0E 
		private java.lang.String tcIsUserCountryMapping0e;
	    // 仓库是否按经济区维护       db_column: TC_IS_USER_REGION_MAPPING_0E 
		private java.lang.String tcIsUserRegionMapping0e;
	    // 仓库是否按省份维护       db_column: TC_IS_USER_PROVINCE_MAPPING_0E 
		private java.lang.String tcIsUserProvinceMapping0e;
	    // 仓库是否按城市维护       db_column: TC_IS_USER_CITY_MAPPING_0E 
		private java.lang.String tcIsUserCityMapping0e;
	    // 仓库是否按集团查看       db_column: TC_IS_USER_ENTERPRISE_MAP_0F 
		private java.lang.String tcIsUserEnterpriseMap0f;
	    // 仓库是否按公司查看       db_column: TC_IS_USER_COMPANY_MAPPING_0F 
		private java.lang.String tcIsUserCompanyMapping0f;
	    // 仓库是否按管理组查看       db_column: TC_IS_USER_GROUP_MAPPING_0F 
		private java.lang.String tcIsUserGroupMapping0f;
	    // 仓库是否按经营性质查看       db_column: TC_IS_USER_METHOD_MAPPING_0F 
		private java.lang.String tcIsUserMethodMapping0f;
	    // 仓库是否按客户查看       db_column: TC_IS_USER_CUSTOMER_MAPPING_0F 
		private java.lang.String tcIsUserCustomerMapping0f;
	    // 仓库是否按门店查看       db_column: TC_IS_USER_STORE_MAPPING_0F 
		private java.lang.String tcIsUserStoreMapping0f;
	    // 仓库是否按国家查看       db_column: TC_IS_USER_COUNTRY_MAPPING_0F 
		private java.lang.String tcIsUserCountryMapping0f;
	    // 仓库是否按经济区查看       db_column: TC_IS_USER_REGION_MAPPING_0F 
		private java.lang.String tcIsUserRegionMapping0f;
	    // 仓库是否按省份查看       db_column: TC_IS_USER_PROVINCE_MAPPING_0F 
		private java.lang.String tcIsUserProvinceMapping0f;
	    // 仓库是否按城市查看       db_column: TC_IS_USER_CITY_MAPPING_0F 
		private java.lang.String tcIsUserCityMapping0f;
	    // 仓库是否按集团指向       db_column: TC_IS_USER_ENTERPRISE_MAP_0G 
		private java.lang.String tcIsUserEnterpriseMap0g;
	    // 仓库是否按公司指向       db_column: TC_IS_USER_COMPANY_MAPPING_0G 
		private java.lang.String tcIsUserCompanyMapping0g;
	    // 仓库是否按管理组指向       db_column: TC_IS_USER_GROUP_MAPPING_0G 
		private java.lang.String tcIsUserGroupMapping0g;
	    // 仓库是否按经营性质指向       db_column: TC_IS_USER_METHOD_MAPPING_0G 
		private java.lang.String tcIsUserMethodMapping0g;
	    // 仓库是否按客户指向       db_column: TC_IS_USER_CUSTOMER_MAPPING_0G 
		private java.lang.String tcIsUserCustomerMapping0g;
	    // 仓库是否按门店指向       db_column: TC_IS_USER_STORE_MAPPING_0G 
		private java.lang.String tcIsUserStoreMapping0g;
	    // 仓库是否按国家指向       db_column: TC_IS_USER_COUNTRY_MAPPING_0G 
		private java.lang.String tcIsUserCountryMapping0g;
	    // 仓库是否按经济区指向       db_column: TC_IS_USER_REGION_MAPPING_0G 
		private java.lang.String tcIsUserRegionMapping0g;
	    // 仓库是否按省份指向       db_column: TC_IS_USER_PROVINCE_MAPPING_0G 
		private java.lang.String tcIsUserProvinceMapping0g;
	    // 仓库是否按城市指向       db_column: TC_IS_USER_CITY_MAPPING_0G 
		private java.lang.String tcIsUserCityMapping0g;
	    // 店铺是否按集团管理档案       db_column: TC_IS_USER_ENTERPRISE_MAP_0H 
		private java.lang.String tcIsUserEnterpriseMap0h;
	    // 店铺是否按公司管理档案       db_column: TC_IS_USER_COMPANY_MAPPING_0H 
		private java.lang.String tcIsUserCompanyMapping0h;
	    // 店铺是否按管理组管理档案       db_column: TC_IS_USER_GROUP_MAPPING_0H 
		private java.lang.String tcIsUserGroupMapping0h;
	    // 店铺是否按经营性质管理档案       db_column: TC_IS_USER_METHOD_MAPPING_0H 
		private java.lang.String tcIsUserMethodMapping0h;
	    // 店铺是否按客户管理档案       db_column: TC_IS_USER_CUSTOMER_MAPPING_0H 
		private java.lang.String tcIsUserCustomerMapping0h;
	    // 店铺是否按门店管理档案       db_column: TC_IS_USER_STORE_MAPPING_0H 
		private java.lang.String tcIsUserStoreMapping0h;
	    // 店铺是否按国家管理档案       db_column: TC_IS_USER_COUNTRY_MAPPING_0H 
		private java.lang.String tcIsUserCountryMapping0h;
	    // 店铺是否按经济区管理档案       db_column: TC_IS_USER_REGION_MAPPING_0H 
		private java.lang.String tcIsUserRegionMapping0h;
	    // 店铺是否按省份管理档案       db_column: TC_IS_USER_PROVINCE_MAPPING_0H 
		private java.lang.String tcIsUserProvinceMapping0h;
	    // 店铺是否按城市管理档案       db_column: TC_IS_USER_CITY_MAPPING_0H 
		private java.lang.String tcIsUserCityMapping0h;
	    // 仓库是否按集团管理档案       db_column: TC_IS_USER_ENTERPRISE_MAP_0I 
		private java.lang.String tcIsUserEnterpriseMap0i;
	    // 仓库是否按公司管理档案       db_column: TC_IS_USER_COMPANY_MAPPING_0I 
		private java.lang.String tcIsUserCompanyMapping0i;
	    // 仓库是否按管理组管理档案       db_column: TC_IS_USER_GROUP_MAPPING_0I 
		private java.lang.String tcIsUserGroupMapping0i;
	    // 仓库是否按经营性质管理档案       db_column: TC_IS_USER_METHOD_MAPPING_0I 
		private java.lang.String tcIsUserMethodMapping0i;
	    // 仓库是否按客户管理档案       db_column: TC_IS_USER_CUSTOMER_MAPPING_0I 
		private java.lang.String tcIsUserCustomerMapping0i;
	    // 仓库是否按门店管理档案       db_column: TC_IS_USER_STORE_MAPPING_0I 
		private java.lang.String tcIsUserStoreMapping0i;
	    // 仓库是否按国家管理档案       db_column: TC_IS_USER_COUNTRY_MAPPING_0I 
		private java.lang.String tcIsUserCountryMapping0i;
	    // 仓库是否按经济区管理档案       db_column: TC_IS_USER_REGION_MAPPING_0I 
		private java.lang.String tcIsUserRegionMapping0i;
	    // 仓库是否按省份管理档案       db_column: TC_IS_USER_PROVINCE_MAPPING_0I 
		private java.lang.String tcIsUserProvinceMapping0i;
	    // 仓库是否按城市管理档案       db_column: TC_IS_USER_CITY_MAPPING_0I 
		private java.lang.String tcIsUserCityMapping0i;
	    // 品牌是否维护       db_column: TC_IS_USER_BRAND_MAPPING_0A 
		private java.lang.String tcIsUserBrandMapping0a;
	    // 品牌是否查看       db_column: TC_IS_USER_BRAND_MAPPING_0B 
		private java.lang.String tcIsUserBrandMapping0b;
	    // 所属客户行序号       db_column: TC_MAIN_CUSTOMER_ROWID 
		private java.lang.Long tcMainCustomerRowid;
	    // 订单客户行序号       db_column: TC_MAIN_DOWN_CUSTOMER_ROWID 
		private java.lang.Long tcMainDownCustomerRowid;
	    // 厂家是否按厂家维护       db_column: TC_IS_USER_FACTORY_MAPPING_1A 
		private java.lang.String tcIsUserFactoryMapping1a;
	    // 厂家是否按厂家查看       db_column: TC_IS_USER_FACTORY_MAPPING_1B 
		private java.lang.String tcIsUserFactoryMapping1b;
	    // 店铺是否按物流中心维护       db_column: TC_IS_USER_STORE_WW_MAPPING_0A 
		private java.lang.String tcIsUserStoreWwMapping0a;
	    // 店铺是否按物流中心查看       db_column: TC_IS_USER_STORE_WW_MAPPING_0B 
		private java.lang.String tcIsUserStoreWwMapping0b;
	    // 店铺是否按物流中心指向       db_column: TC_IS_USER_STORE_WW_MAPPING_0C 
		private java.lang.String tcIsUserStoreWwMapping0c;
	    // 店铺是否按物流中心查看销售       db_column: TC_IS_USER_STORE_WW_MAPPING_0D 
		private java.lang.String tcIsUserStoreWwMapping0d;
	    // 仓库是否按物流中心维护       db_column: TC_IS_USER_STORE_WW_MAPPING_0E 
		private java.lang.String tcIsUserStoreWwMapping0e;
	    // 仓库是否按物流中心查看       db_column: TC_IS_USER_STORE_WW_MAPPING_0F 
		private java.lang.String tcIsUserStoreWwMapping0f;
	    // 仓库是否按物流中心指向       db_column: TC_IS_USER_STORE_WW_MAPPING_0G 
		private java.lang.String tcIsUserStoreWwMapping0g;
	    // 店铺是否按物流中心管理档案       db_column: TC_IS_USER_STORE_WW_MAPPING_0H 
		private java.lang.String tcIsUserStoreWwMapping0h;
	    // 仓库是否按物流中心管理档案       db_column: TC_IS_USER_STORE_WW_MAPPING_0I 
		private java.lang.String tcIsUserStoreWwMapping0i;
	    // 厂家是否按公司查看       db_column: TC_IS_USER_COMPANY_MAPPING_1A 
		private java.lang.String tcIsUserCompanyMapping1a;
	    // 厂家是否按公司查看       db_column: TC_IS_USER_COMPANY_MAPPING_1B 
		private java.lang.String tcIsUserCompanyMapping1b;
	    // 厂家是否按集团维护       db_column: TC_IS_USER_ENTERPRISE_MAP_1A 
		private java.lang.String tcIsUserEnterpriseMap1a;
	    // 厂家是否按管理组维护       db_column: TC_IS_USER_GROUP_MAPPING_1A 
		private java.lang.String tcIsUserGroupMapping1a;
	    // 厂家是否按经营性质维护       db_column: TC_IS_USER_METHOD_MAPPING_1A 
		private java.lang.String tcIsUserMethodMapping1a;
	    // 厂家是否按客户维护       db_column: TC_IS_USER_CUSTOMER_MAPPING_1A 
		private java.lang.String tcIsUserCustomerMapping1a;
	    // 厂家是否按国家维护       db_column: TC_IS_USER_COUNTRY_MAPPING_1A 
		private java.lang.String tcIsUserCountryMapping1a;
	    // 厂家是否按经济区维护       db_column: TC_IS_USER_REGION_MAPPING_1A 
		private java.lang.String tcIsUserRegionMapping1a;
	    // 厂家是否按省份维护       db_column: TC_IS_USER_PROVINCE_MAPPING_1A 
		private java.lang.String tcIsUserProvinceMapping1a;
	    // 厂家是否按城市维护       db_column: TC_IS_USER_CITY_MAPPING_1A 
		private java.lang.String tcIsUserCityMapping1a;
	    // 厂家是否按物流中心维护       db_column: TC_IS_USER_STORE_WW_MAPPING_1A 
		private java.lang.String tcIsUserStoreWwMapping1a;
	    // 厂家是否按集团查看       db_column: TC_IS_USER_ENTERPRISE_MAP_1B 
		private java.lang.String tcIsUserEnterpriseMap1b;
	    // 厂家是否按管理组查看       db_column: TC_IS_USER_GROUP_MAPPING_1B 
		private java.lang.String tcIsUserGroupMapping1b;
	    // 厂家是否按经营性质查看       db_column: TC_IS_USER_METHOD_MAPPING_1B 
		private java.lang.String tcIsUserMethodMapping1b;
	    // 厂家是否按客户查看       db_column: TC_IS_USER_CUSTOMER_MAPPING_1B 
		private java.lang.String tcIsUserCustomerMapping1b;
	    // 厂家是否按国家查看       db_column: TC_IS_USER_COUNTRY_MAPPING_1B 
		private java.lang.String tcIsUserCountryMapping1b;
	    // 厂家是否按经济区查看       db_column: TC_IS_USER_REGION_MAPPING_1B 
		private java.lang.String tcIsUserRegionMapping1b;
	    // 厂家是否按省份查看       db_column: TC_IS_USER_PROVINCE_MAPPING_1B 
		private java.lang.String tcIsUserProvinceMapping1b;
	    // 厂家是否按城市查看       db_column: TC_IS_USER_CITY_MAPPING_1B 
		private java.lang.String tcIsUserCityMapping1b;
	    // 厂家是否按物流中心查看       db_column: TC_IS_USER_STORE_WW_MAPPING_1B 
		private java.lang.String tcIsUserStoreWwMapping1b;
	    // 店铺是否按管理团队维护       db_column: TC_IS_USER_TEAM_MAPPING_0A 
		private java.lang.String tcIsUserTeamMapping0a;
	    // 店铺是否按管理团队查看       db_column: TC_IS_USER_TEAM_MAPPING_0B 
		private java.lang.String tcIsUserTeamMapping0b;
	    // 店铺是否按管理团队指向       db_column: TC_IS_USER_TEAM_MAPPING_0C 
		private java.lang.String tcIsUserTeamMapping0c;
	    // 店铺是否按管理团队查看销售       db_column: TC_IS_USER_TEAM_MAPPING_0D 
		private java.lang.String tcIsUserTeamMapping0d;
	    // 仓库是否按管理团队维护       db_column: TC_IS_USER_TEAM_MAPPING_0E 
		private java.lang.String tcIsUserTeamMapping0e;
	    // 仓库是否按管理团队查看       db_column: TC_IS_USER_TEAM_MAPPING_0F 
		private java.lang.String tcIsUserTeamMapping0f;
	    // 仓库是否按管理团队指向       db_column: TC_IS_USER_TEAM_MAPPING_0G 
		private java.lang.String tcIsUserTeamMapping0g;
	    // 店铺是否按管理团队管理档案       db_column: TC_IS_USER_TEAM_MAPPING_0H 
		private java.lang.String tcIsUserTeamMapping0h;
	    // 仓库是否按管理团队管理档案       db_column: TC_IS_USER_TEAM_MAPPING_0I 
		private java.lang.String tcIsUserTeamMapping0i;
	    // 厂家是否按管理团队维护       db_column: TC_IS_USER_TEAM_MAPPING_1A 
		private java.lang.String tcIsUserTeamMapping1a;
	    // 厂家是否按管理团队查看       db_column: TC_IS_USER_TEAM_MAPPING_1B 
		private java.lang.String tcIsUserTeamMapping1b;
	    // 店仓是否按集团可指令       db_column: TC_IS_USER_ENTERPRISE_MAP_0J 
		private java.lang.String tcIsUserEnterpriseMap0j;
	    // 店仓是否按公司可指令       db_column: TC_IS_USER_COMPANY_MAPPING_0J 
		private java.lang.String tcIsUserCompanyMapping0j;
	    // 店仓是否按管理组可指令       db_column: TC_IS_USER_GROUP_MAPPING_0J 
		private java.lang.String tcIsUserGroupMapping0j;
	    // 店仓是否按经营性质可指令       db_column: TC_IS_USER_METHOD_MAPPING_0J 
		private java.lang.String tcIsUserMethodMapping0j;
	    // 店仓是否按客户可指令       db_column: TC_IS_USER_CUSTOMER_MAPPING_0J 
		private java.lang.String tcIsUserCustomerMapping0j;
	    // 店仓是否按门店可指令       db_column: TC_IS_USER_STORE_MAPPING_0J 
		private java.lang.String tcIsUserStoreMapping0j;
	    // 店仓是否按国家可指令       db_column: TC_IS_USER_COUNTRY_MAPPING_0J 
		private java.lang.String tcIsUserCountryMapping0j;
	    // 店仓是否按经济区可指令       db_column: TC_IS_USER_REGION_MAPPING_0J 
		private java.lang.String tcIsUserRegionMapping0j;
	    // 店仓是否按省份可指令       db_column: TC_IS_USER_PROVINCE_MAPPING_0J 
		private java.lang.String tcIsUserProvinceMapping0j;
	    // 店仓是否按城市可指令       db_column: TC_IS_USER_CITY_MAPPING_0J 
		private java.lang.String tcIsUserCityMapping0j;
	    // 店仓是否按物流中心可指令       db_column: TC_IS_USER_STORE_WW_MAPPING_0J 
		private java.lang.String tcIsUserStoreWwMapping0j;
	    // 店仓是否按管理团队可指令       db_column: TC_IS_USER_TEAM_MAPPING_0J 
		private java.lang.String tcIsUserTeamMapping0j;
	    // 店仓是否按集团可指令       db_column: TC_IS_USER_ENTERPRISE_MAP_0K 
		private java.lang.String tcIsUserEnterpriseMap0k;
	    // 店仓是否按公司可指令       db_column: TC_IS_USER_COMPANY_MAPPING_0K 
		private java.lang.String tcIsUserCompanyMapping0k;
	    // 店仓是否按管理组可指令指向       db_column: TC_IS_USER_GROUP_MAPPING_0K 
		private java.lang.String tcIsUserGroupMapping0k;
	    // 店仓是否按经营性质可指令指向       db_column: TC_IS_USER_METHOD_MAPPING_0K 
		private java.lang.String tcIsUserMethodMapping0k;
	    // 店仓是否按客户可指令指向       db_column: TC_IS_USER_CUSTOMER_MAPPING_0K 
		private java.lang.String tcIsUserCustomerMapping0k;
	    // 店仓是否按门店可指令指向       db_column: TC_IS_USER_STORE_MAPPING_0K 
		private java.lang.String tcIsUserStoreMapping0k;
	    // 店仓是否按国家可指令指向       db_column: TC_IS_USER_COUNTRY_MAPPING_0K 
		private java.lang.String tcIsUserCountryMapping0k;
	    // 店仓是否按经济区可指令指向       db_column: TC_IS_USER_REGION_MAPPING_0K 
		private java.lang.String tcIsUserRegionMapping0k;
	    // 店仓是否按省份可指令指向       db_column: TC_IS_USER_PROVINCE_MAPPING_0K 
		private java.lang.String tcIsUserProvinceMapping0k;
	    // 店仓是否按城市可指令指向       db_column: TC_IS_USER_CITY_MAPPING_0K 
		private java.lang.String tcIsUserCityMapping0k;
	    // 店仓是否按物流中心可指令指向       db_column: TC_IS_USER_STORE_WW_MAPPING_0K 
		private java.lang.String tcIsUserStoreWwMapping0k;
	    // 店仓是否按管理团队可指令指向       db_column: TC_IS_USER_TEAM_MAPPING_0K 
		private java.lang.String tcIsUserTeamMapping0k;
	    // tcOldCode       db_column: TC_OLD_CODE 
		private java.lang.String tcOldCode;
		
		// tcRowid       db_column: TC_ROWID 
		private String[] tcRowidArray;
		
		public java.lang.String getTcCode() 
		{
			return this.tcCode;
		}
		public void setTcCode(java.lang.String value) 
		{
			this.tcCode = value;
		}
		public java.lang.String getTcName() 
		{
			return this.tcName;
		}
		public void setTcName(java.lang.String value) 
		{
			this.tcName = value;
		}
		public java.lang.String getTcDescription() 
		{
			return this.tcDescription;
		}
		public void setTcDescription(java.lang.String value) 
		{
			this.tcDescription = value;
		}
		public java.lang.Long getTcAddUserRowid() 
		{
			return this.tcAddUserRowid;
		}
		public void setTcAddUserRowid(java.lang.Long value) 
		{
			this.tcAddUserRowid = value;
		}
		public java.lang.Long getTcAddTime() 
		{
			return this.tcAddTime;
		}
		public void setTcAddTime(java.lang.Long value) 
		{
			this.tcAddTime = value;
		}
		public java.lang.Long getTcUpdateUserRowid() 
		{
			return this.tcUpdateUserRowid;
		}
		public void setTcUpdateUserRowid(java.lang.Long value) 
		{
			this.tcUpdateUserRowid = value;
		}
		public java.lang.Long getTcUpdateTime() 
		{
			return this.tcUpdateTime;
		}
		public void setTcUpdateTime(java.lang.Long value) 
		{
			this.tcUpdateTime = value;
		}
		public java.lang.Long getTcDeleteUserRowid() 
		{
			return this.tcDeleteUserRowid;
		}
		public void setTcDeleteUserRowid(java.lang.Long value) 
		{
			this.tcDeleteUserRowid = value;
		}
		public java.lang.Long getTcDeleteTime() 
		{
			return this.tcDeleteTime;
		}
		public void setTcDeleteTime(java.lang.Long value) 
		{
			this.tcDeleteTime = value;
		}
		public java.lang.Long getTcActiveUserRowid() 
		{
			return this.tcActiveUserRowid;
		}
		public void setTcActiveUserRowid(java.lang.Long value) 
		{
			this.tcActiveUserRowid = value;
		}
		public java.lang.Long getTcActiveTime() 
		{
			return this.tcActiveTime;
		}
		public void setTcActiveTime(java.lang.Long value) 
		{
			this.tcActiveTime = value;
		}
		public java.lang.Long getTcCloseUserRowid() 
		{
			return this.tcCloseUserRowid;
		}
		public void setTcCloseUserRowid(java.lang.Long value) 
		{
			this.tcCloseUserRowid = value;
		}
		public java.lang.Long getTcCloseTime() 
		{
			return this.tcCloseTime;
		}
		public void setTcCloseTime(java.lang.Long value) 
		{
			this.tcCloseTime = value;
		}
		public java.lang.String getTcStatus() 
		{
			return this.tcStatus;
		}
		public void setTcStatus(java.lang.String value) 
		{
			this.tcStatus = value;
		}
		public java.lang.String getTcPassword() 
		{
			return this.tcPassword;
		}
		public void setTcPassword(java.lang.String value) 
		{
			this.tcPassword = value;
		}
		public java.lang.String getTcUserType() 
		{
			return this.tcUserType;
		}
		public void setTcUserType(java.lang.String value) 
		{
			this.tcUserType = value;
		}
		public java.lang.Long getTcDepartmentRowid() 
		{
			return this.tcDepartmentRowid;
		}
		public void setTcDepartmentRowid(java.lang.Long value) 
		{
			this.tcDepartmentRowid = value;
		}
		public java.lang.String getTcPwdModifyTime() 
		{
			return this.tcPwdModifyTime;
		}
		public void setTcPwdModifyTime(java.lang.String value) 
		{
			this.tcPwdModifyTime = value;
		}
		public java.lang.Integer getTcPwdValidTime() 
		{
			return this.tcPwdValidTime;
		}
		public void setTcPwdValidTime(java.lang.Integer value) 
		{
			this.tcPwdValidTime = value;
		}
		public java.lang.Integer getTcFailureTime() 
		{
			return this.tcFailureTime;
		}
		public void setTcFailureTime(java.lang.Integer value) 
		{
			this.tcFailureTime = value;
		}
		public java.lang.String getTcLastLoginTime() 
		{
			return this.tcLastLoginTime;
		}
		public void setTcLastLoginTime(java.lang.String value) 
		{
			this.tcLastLoginTime = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0a() 
		{
			return this.tcIsUserEnterpriseMap0a;
		}
		public void setTcIsUserEnterpriseMap0a(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0a = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0a() 
		{
			return this.tcIsUserCompanyMapping0a;
		}
		public void setTcIsUserCompanyMapping0a(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0a = value;
		}
		public java.lang.String getTcIsUserGroupMapping0a() 
		{
			return this.tcIsUserGroupMapping0a;
		}
		public void setTcIsUserGroupMapping0a(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0a = value;
		}
		public java.lang.String getTcIsUserMethodMapping0a() 
		{
			return this.tcIsUserMethodMapping0a;
		}
		public void setTcIsUserMethodMapping0a(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0a = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0a() 
		{
			return this.tcIsUserCustomerMapping0a;
		}
		public void setTcIsUserCustomerMapping0a(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0a = value;
		}
		public java.lang.String getTcIsUserStoreMapping0a() 
		{
			return this.tcIsUserStoreMapping0a;
		}
		public void setTcIsUserStoreMapping0a(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0a = value;
		}
		public java.lang.String getTcIsUserCountryMapping0a() 
		{
			return this.tcIsUserCountryMapping0a;
		}
		public void setTcIsUserCountryMapping0a(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0a = value;
		}
		public java.lang.String getTcIsUserRegionMapping0a() 
		{
			return this.tcIsUserRegionMapping0a;
		}
		public void setTcIsUserRegionMapping0a(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0a = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0a() 
		{
			return this.tcIsUserProvinceMapping0a;
		}
		public void setTcIsUserProvinceMapping0a(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0a = value;
		}
		public java.lang.String getTcIsUserCityMapping0a() 
		{
			return this.tcIsUserCityMapping0a;
		}
		public void setTcIsUserCityMapping0a(java.lang.String value) 
		{
			this.tcIsUserCityMapping0a = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0b() 
		{
			return this.tcIsUserEnterpriseMap0b;
		}
		public void setTcIsUserEnterpriseMap0b(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0b = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0b() 
		{
			return this.tcIsUserCompanyMapping0b;
		}
		public void setTcIsUserCompanyMapping0b(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0b = value;
		}
		public java.lang.String getTcIsUserGroupMapping0b() 
		{
			return this.tcIsUserGroupMapping0b;
		}
		public void setTcIsUserGroupMapping0b(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0b = value;
		}
		public java.lang.String getTcIsUserMethodMapping0b() 
		{
			return this.tcIsUserMethodMapping0b;
		}
		public void setTcIsUserMethodMapping0b(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0b = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0b() 
		{
			return this.tcIsUserCustomerMapping0b;
		}
		public void setTcIsUserCustomerMapping0b(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0b = value;
		}
		public java.lang.String getTcIsUserStoreMapping0b() 
		{
			return this.tcIsUserStoreMapping0b;
		}
		public void setTcIsUserStoreMapping0b(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0b = value;
		}
		public java.lang.String getTcIsUserCountryMapping0b() 
		{
			return this.tcIsUserCountryMapping0b;
		}
		public void setTcIsUserCountryMapping0b(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0b = value;
		}
		public java.lang.String getTcIsUserRegionMapping0b() 
		{
			return this.tcIsUserRegionMapping0b;
		}
		public void setTcIsUserRegionMapping0b(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0b = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0b() 
		{
			return this.tcIsUserProvinceMapping0b;
		}
		public void setTcIsUserProvinceMapping0b(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0b = value;
		}
		public java.lang.String getTcIsUserCityMapping0b() 
		{
			return this.tcIsUserCityMapping0b;
		}
		public void setTcIsUserCityMapping0b(java.lang.String value) 
		{
			this.tcIsUserCityMapping0b = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0c() 
		{
			return this.tcIsUserEnterpriseMap0c;
		}
		public void setTcIsUserEnterpriseMap0c(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0c = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0c() 
		{
			return this.tcIsUserCompanyMapping0c;
		}
		public void setTcIsUserCompanyMapping0c(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0c = value;
		}
		public java.lang.String getTcIsUserGroupMapping0c() 
		{
			return this.tcIsUserGroupMapping0c;
		}
		public void setTcIsUserGroupMapping0c(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0c = value;
		}
		public java.lang.String getTcIsUserMethodMapping0c() 
		{
			return this.tcIsUserMethodMapping0c;
		}
		public void setTcIsUserMethodMapping0c(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0c = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0c() 
		{
			return this.tcIsUserCustomerMapping0c;
		}
		public void setTcIsUserCustomerMapping0c(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0c = value;
		}
		public java.lang.String getTcIsUserStoreMapping0c() 
		{
			return this.tcIsUserStoreMapping0c;
		}
		public void setTcIsUserStoreMapping0c(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0c = value;
		}
		public java.lang.String getTcIsUserCountryMapping0c() 
		{
			return this.tcIsUserCountryMapping0c;
		}
		public void setTcIsUserCountryMapping0c(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0c = value;
		}
		public java.lang.String getTcIsUserRegionMapping0c() 
		{
			return this.tcIsUserRegionMapping0c;
		}
		public void setTcIsUserRegionMapping0c(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0c = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0c() 
		{
			return this.tcIsUserProvinceMapping0c;
		}
		public void setTcIsUserProvinceMapping0c(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0c = value;
		}
		public java.lang.String getTcIsUserCityMapping0c() 
		{
			return this.tcIsUserCityMapping0c;
		}
		public void setTcIsUserCityMapping0c(java.lang.String value) 
		{
			this.tcIsUserCityMapping0c = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0d() 
		{
			return this.tcIsUserEnterpriseMap0d;
		}
		public void setTcIsUserEnterpriseMap0d(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0d = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0d() 
		{
			return this.tcIsUserCompanyMapping0d;
		}
		public void setTcIsUserCompanyMapping0d(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0d = value;
		}
		public java.lang.String getTcIsUserGroupMapping0d() 
		{
			return this.tcIsUserGroupMapping0d;
		}
		public void setTcIsUserGroupMapping0d(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0d = value;
		}
		public java.lang.String getTcIsUserMethodMapping0d() 
		{
			return this.tcIsUserMethodMapping0d;
		}
		public void setTcIsUserMethodMapping0d(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0d = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0d() 
		{
			return this.tcIsUserCustomerMapping0d;
		}
		public void setTcIsUserCustomerMapping0d(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0d = value;
		}
		public java.lang.String getTcIsUserStoreMapping0d() 
		{
			return this.tcIsUserStoreMapping0d;
		}
		public void setTcIsUserStoreMapping0d(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0d = value;
		}
		public java.lang.String getTcIsUserCountryMapping0d() 
		{
			return this.tcIsUserCountryMapping0d;
		}
		public void setTcIsUserCountryMapping0d(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0d = value;
		}
		public java.lang.String getTcIsUserRegionMapping0d() 
		{
			return this.tcIsUserRegionMapping0d;
		}
		public void setTcIsUserRegionMapping0d(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0d = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0d() 
		{
			return this.tcIsUserProvinceMapping0d;
		}
		public void setTcIsUserProvinceMapping0d(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0d = value;
		}
		public java.lang.String getTcIsUserCityMapping0d() 
		{
			return this.tcIsUserCityMapping0d;
		}
		public void setTcIsUserCityMapping0d(java.lang.String value) 
		{
			this.tcIsUserCityMapping0d = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0e() 
		{
			return this.tcIsUserEnterpriseMap0e;
		}
		public void setTcIsUserEnterpriseMap0e(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0e = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0e() 
		{
			return this.tcIsUserCompanyMapping0e;
		}
		public void setTcIsUserCompanyMapping0e(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0e = value;
		}
		public java.lang.String getTcIsUserGroupMapping0e() 
		{
			return this.tcIsUserGroupMapping0e;
		}
		public void setTcIsUserGroupMapping0e(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0e = value;
		}
		public java.lang.String getTcIsUserMethodMapping0e() 
		{
			return this.tcIsUserMethodMapping0e;
		}
		public void setTcIsUserMethodMapping0e(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0e = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0e() 
		{
			return this.tcIsUserCustomerMapping0e;
		}
		public void setTcIsUserCustomerMapping0e(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0e = value;
		}
		public java.lang.String getTcIsUserStoreMapping0e() 
		{
			return this.tcIsUserStoreMapping0e;
		}
		public void setTcIsUserStoreMapping0e(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0e = value;
		}
		public java.lang.String getTcIsUserCountryMapping0e() 
		{
			return this.tcIsUserCountryMapping0e;
		}
		public void setTcIsUserCountryMapping0e(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0e = value;
		}
		public java.lang.String getTcIsUserRegionMapping0e() 
		{
			return this.tcIsUserRegionMapping0e;
		}
		public void setTcIsUserRegionMapping0e(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0e = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0e() 
		{
			return this.tcIsUserProvinceMapping0e;
		}
		public void setTcIsUserProvinceMapping0e(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0e = value;
		}
		public java.lang.String getTcIsUserCityMapping0e() 
		{
			return this.tcIsUserCityMapping0e;
		}
		public void setTcIsUserCityMapping0e(java.lang.String value) 
		{
			this.tcIsUserCityMapping0e = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0f() 
		{
			return this.tcIsUserEnterpriseMap0f;
		}
		public void setTcIsUserEnterpriseMap0f(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0f = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0f() 
		{
			return this.tcIsUserCompanyMapping0f;
		}
		public void setTcIsUserCompanyMapping0f(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0f = value;
		}
		public java.lang.String getTcIsUserGroupMapping0f() 
		{
			return this.tcIsUserGroupMapping0f;
		}
		public void setTcIsUserGroupMapping0f(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0f = value;
		}
		public java.lang.String getTcIsUserMethodMapping0f() 
		{
			return this.tcIsUserMethodMapping0f;
		}
		public void setTcIsUserMethodMapping0f(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0f = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0f() 
		{
			return this.tcIsUserCustomerMapping0f;
		}
		public void setTcIsUserCustomerMapping0f(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0f = value;
		}
		public java.lang.String getTcIsUserStoreMapping0f() 
		{
			return this.tcIsUserStoreMapping0f;
		}
		public void setTcIsUserStoreMapping0f(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0f = value;
		}
		public java.lang.String getTcIsUserCountryMapping0f() 
		{
			return this.tcIsUserCountryMapping0f;
		}
		public void setTcIsUserCountryMapping0f(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0f = value;
		}
		public java.lang.String getTcIsUserRegionMapping0f() 
		{
			return this.tcIsUserRegionMapping0f;
		}
		public void setTcIsUserRegionMapping0f(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0f = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0f() 
		{
			return this.tcIsUserProvinceMapping0f;
		}
		public void setTcIsUserProvinceMapping0f(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0f = value;
		}
		public java.lang.String getTcIsUserCityMapping0f() 
		{
			return this.tcIsUserCityMapping0f;
		}
		public void setTcIsUserCityMapping0f(java.lang.String value) 
		{
			this.tcIsUserCityMapping0f = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0g() 
		{
			return this.tcIsUserEnterpriseMap0g;
		}
		public void setTcIsUserEnterpriseMap0g(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0g = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0g() 
		{
			return this.tcIsUserCompanyMapping0g;
		}
		public void setTcIsUserCompanyMapping0g(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0g = value;
		}
		public java.lang.String getTcIsUserGroupMapping0g() 
		{
			return this.tcIsUserGroupMapping0g;
		}
		public void setTcIsUserGroupMapping0g(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0g = value;
		}
		public java.lang.String getTcIsUserMethodMapping0g() 
		{
			return this.tcIsUserMethodMapping0g;
		}
		public void setTcIsUserMethodMapping0g(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0g = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0g() 
		{
			return this.tcIsUserCustomerMapping0g;
		}
		public void setTcIsUserCustomerMapping0g(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0g = value;
		}
		public java.lang.String getTcIsUserStoreMapping0g() 
		{
			return this.tcIsUserStoreMapping0g;
		}
		public void setTcIsUserStoreMapping0g(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0g = value;
		}
		public java.lang.String getTcIsUserCountryMapping0g() 
		{
			return this.tcIsUserCountryMapping0g;
		}
		public void setTcIsUserCountryMapping0g(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0g = value;
		}
		public java.lang.String getTcIsUserRegionMapping0g() 
		{
			return this.tcIsUserRegionMapping0g;
		}
		public void setTcIsUserRegionMapping0g(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0g = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0g() 
		{
			return this.tcIsUserProvinceMapping0g;
		}
		public void setTcIsUserProvinceMapping0g(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0g = value;
		}
		public java.lang.String getTcIsUserCityMapping0g() 
		{
			return this.tcIsUserCityMapping0g;
		}
		public void setTcIsUserCityMapping0g(java.lang.String value) 
		{
			this.tcIsUserCityMapping0g = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0h() 
		{
			return this.tcIsUserEnterpriseMap0h;
		}
		public void setTcIsUserEnterpriseMap0h(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0h = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0h() 
		{
			return this.tcIsUserCompanyMapping0h;
		}
		public void setTcIsUserCompanyMapping0h(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0h = value;
		}
		public java.lang.String getTcIsUserGroupMapping0h() 
		{
			return this.tcIsUserGroupMapping0h;
		}
		public void setTcIsUserGroupMapping0h(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0h = value;
		}
		public java.lang.String getTcIsUserMethodMapping0h() 
		{
			return this.tcIsUserMethodMapping0h;
		}
		public void setTcIsUserMethodMapping0h(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0h = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0h() 
		{
			return this.tcIsUserCustomerMapping0h;
		}
		public void setTcIsUserCustomerMapping0h(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0h = value;
		}
		public java.lang.String getTcIsUserStoreMapping0h() 
		{
			return this.tcIsUserStoreMapping0h;
		}
		public void setTcIsUserStoreMapping0h(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0h = value;
		}
		public java.lang.String getTcIsUserCountryMapping0h() 
		{
			return this.tcIsUserCountryMapping0h;
		}
		public void setTcIsUserCountryMapping0h(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0h = value;
		}
		public java.lang.String getTcIsUserRegionMapping0h() 
		{
			return this.tcIsUserRegionMapping0h;
		}
		public void setTcIsUserRegionMapping0h(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0h = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0h() 
		{
			return this.tcIsUserProvinceMapping0h;
		}
		public void setTcIsUserProvinceMapping0h(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0h = value;
		}
		public java.lang.String getTcIsUserCityMapping0h() 
		{
			return this.tcIsUserCityMapping0h;
		}
		public void setTcIsUserCityMapping0h(java.lang.String value) 
		{
			this.tcIsUserCityMapping0h = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0i() 
		{
			return this.tcIsUserEnterpriseMap0i;
		}
		public void setTcIsUserEnterpriseMap0i(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0i = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0i() 
		{
			return this.tcIsUserCompanyMapping0i;
		}
		public void setTcIsUserCompanyMapping0i(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0i = value;
		}
		public java.lang.String getTcIsUserGroupMapping0i() 
		{
			return this.tcIsUserGroupMapping0i;
		}
		public void setTcIsUserGroupMapping0i(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0i = value;
		}
		public java.lang.String getTcIsUserMethodMapping0i() 
		{
			return this.tcIsUserMethodMapping0i;
		}
		public void setTcIsUserMethodMapping0i(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0i = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0i() 
		{
			return this.tcIsUserCustomerMapping0i;
		}
		public void setTcIsUserCustomerMapping0i(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0i = value;
		}
		public java.lang.String getTcIsUserStoreMapping0i() 
		{
			return this.tcIsUserStoreMapping0i;
		}
		public void setTcIsUserStoreMapping0i(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0i = value;
		}
		public java.lang.String getTcIsUserCountryMapping0i() 
		{
			return this.tcIsUserCountryMapping0i;
		}
		public void setTcIsUserCountryMapping0i(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0i = value;
		}
		public java.lang.String getTcIsUserRegionMapping0i() 
		{
			return this.tcIsUserRegionMapping0i;
		}
		public void setTcIsUserRegionMapping0i(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0i = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0i() 
		{
			return this.tcIsUserProvinceMapping0i;
		}
		public void setTcIsUserProvinceMapping0i(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0i = value;
		}
		public java.lang.String getTcIsUserCityMapping0i() 
		{
			return this.tcIsUserCityMapping0i;
		}
		public void setTcIsUserCityMapping0i(java.lang.String value) 
		{
			this.tcIsUserCityMapping0i = value;
		}
		public java.lang.String getTcIsUserBrandMapping0a() 
		{
			return this.tcIsUserBrandMapping0a;
		}
		public void setTcIsUserBrandMapping0a(java.lang.String value) 
		{
			this.tcIsUserBrandMapping0a = value;
		}
		public java.lang.String getTcIsUserBrandMapping0b() 
		{
			return this.tcIsUserBrandMapping0b;
		}
		public void setTcIsUserBrandMapping0b(java.lang.String value) 
		{
			this.tcIsUserBrandMapping0b = value;
		}
		public java.lang.Long getTcMainCustomerRowid() 
		{
			return this.tcMainCustomerRowid;
		}
		public void setTcMainCustomerRowid(java.lang.Long value) 
		{
			this.tcMainCustomerRowid = value;
		}
		public java.lang.Long getTcMainDownCustomerRowid() 
		{
			return this.tcMainDownCustomerRowid;
		}
		public void setTcMainDownCustomerRowid(java.lang.Long value) 
		{
			this.tcMainDownCustomerRowid = value;
		}
		public java.lang.String getTcIsUserFactoryMapping1a() 
		{
			return this.tcIsUserFactoryMapping1a;
		}
		public void setTcIsUserFactoryMapping1a(java.lang.String value) 
		{
			this.tcIsUserFactoryMapping1a = value;
		}
		public java.lang.String getTcIsUserFactoryMapping1b() 
		{
			return this.tcIsUserFactoryMapping1b;
		}
		public void setTcIsUserFactoryMapping1b(java.lang.String value) 
		{
			this.tcIsUserFactoryMapping1b = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0a() 
		{
			return this.tcIsUserStoreWwMapping0a;
		}
		public void setTcIsUserStoreWwMapping0a(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0a = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0b() 
		{
			return this.tcIsUserStoreWwMapping0b;
		}
		public void setTcIsUserStoreWwMapping0b(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0b = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0c() 
		{
			return this.tcIsUserStoreWwMapping0c;
		}
		public void setTcIsUserStoreWwMapping0c(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0c = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0d() 
		{
			return this.tcIsUserStoreWwMapping0d;
		}
		public void setTcIsUserStoreWwMapping0d(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0d = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0e() 
		{
			return this.tcIsUserStoreWwMapping0e;
		}
		public void setTcIsUserStoreWwMapping0e(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0e = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0f() 
		{
			return this.tcIsUserStoreWwMapping0f;
		}
		public void setTcIsUserStoreWwMapping0f(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0f = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0g() 
		{
			return this.tcIsUserStoreWwMapping0g;
		}
		public void setTcIsUserStoreWwMapping0g(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0g = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0h() 
		{
			return this.tcIsUserStoreWwMapping0h;
		}
		public void setTcIsUserStoreWwMapping0h(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0h = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0i() 
		{
			return this.tcIsUserStoreWwMapping0i;
		}
		public void setTcIsUserStoreWwMapping0i(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0i = value;
		}
		public java.lang.String getTcIsUserCompanyMapping1a() 
		{
			return this.tcIsUserCompanyMapping1a;
		}
		public void setTcIsUserCompanyMapping1a(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping1a = value;
		}
		public java.lang.String getTcIsUserCompanyMapping1b() 
		{
			return this.tcIsUserCompanyMapping1b;
		}
		public void setTcIsUserCompanyMapping1b(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping1b = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap1a() 
		{
			return this.tcIsUserEnterpriseMap1a;
		}
		public void setTcIsUserEnterpriseMap1a(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap1a = value;
		}
		public java.lang.String getTcIsUserGroupMapping1a() 
		{
			return this.tcIsUserGroupMapping1a;
		}
		public void setTcIsUserGroupMapping1a(java.lang.String value) 
		{
			this.tcIsUserGroupMapping1a = value;
		}
		public java.lang.String getTcIsUserMethodMapping1a() 
		{
			return this.tcIsUserMethodMapping1a;
		}
		public void setTcIsUserMethodMapping1a(java.lang.String value) 
		{
			this.tcIsUserMethodMapping1a = value;
		}
		public java.lang.String getTcIsUserCustomerMapping1a() 
		{
			return this.tcIsUserCustomerMapping1a;
		}
		public void setTcIsUserCustomerMapping1a(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping1a = value;
		}
		public java.lang.String getTcIsUserCountryMapping1a() 
		{
			return this.tcIsUserCountryMapping1a;
		}
		public void setTcIsUserCountryMapping1a(java.lang.String value) 
		{
			this.tcIsUserCountryMapping1a = value;
		}
		public java.lang.String getTcIsUserRegionMapping1a() 
		{
			return this.tcIsUserRegionMapping1a;
		}
		public void setTcIsUserRegionMapping1a(java.lang.String value) 
		{
			this.tcIsUserRegionMapping1a = value;
		}
		public java.lang.String getTcIsUserProvinceMapping1a() 
		{
			return this.tcIsUserProvinceMapping1a;
		}
		public void setTcIsUserProvinceMapping1a(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping1a = value;
		}
		public java.lang.String getTcIsUserCityMapping1a() 
		{
			return this.tcIsUserCityMapping1a;
		}
		public void setTcIsUserCityMapping1a(java.lang.String value) 
		{
			this.tcIsUserCityMapping1a = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping1a() 
		{
			return this.tcIsUserStoreWwMapping1a;
		}
		public void setTcIsUserStoreWwMapping1a(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping1a = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap1b() 
		{
			return this.tcIsUserEnterpriseMap1b;
		}
		public void setTcIsUserEnterpriseMap1b(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap1b = value;
		}
		public java.lang.String getTcIsUserGroupMapping1b() 
		{
			return this.tcIsUserGroupMapping1b;
		}
		public void setTcIsUserGroupMapping1b(java.lang.String value) 
		{
			this.tcIsUserGroupMapping1b = value;
		}
		public java.lang.String getTcIsUserMethodMapping1b() 
		{
			return this.tcIsUserMethodMapping1b;
		}
		public void setTcIsUserMethodMapping1b(java.lang.String value) 
		{
			this.tcIsUserMethodMapping1b = value;
		}
		public java.lang.String getTcIsUserCustomerMapping1b() 
		{
			return this.tcIsUserCustomerMapping1b;
		}
		public void setTcIsUserCustomerMapping1b(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping1b = value;
		}
		public java.lang.String getTcIsUserCountryMapping1b() 
		{
			return this.tcIsUserCountryMapping1b;
		}
		public void setTcIsUserCountryMapping1b(java.lang.String value) 
		{
			this.tcIsUserCountryMapping1b = value;
		}
		public java.lang.String getTcIsUserRegionMapping1b() 
		{
			return this.tcIsUserRegionMapping1b;
		}
		public void setTcIsUserRegionMapping1b(java.lang.String value) 
		{
			this.tcIsUserRegionMapping1b = value;
		}
		public java.lang.String getTcIsUserProvinceMapping1b() 
		{
			return this.tcIsUserProvinceMapping1b;
		}
		public void setTcIsUserProvinceMapping1b(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping1b = value;
		}
		public java.lang.String getTcIsUserCityMapping1b() 
		{
			return this.tcIsUserCityMapping1b;
		}
		public void setTcIsUserCityMapping1b(java.lang.String value) 
		{
			this.tcIsUserCityMapping1b = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping1b() 
		{
			return this.tcIsUserStoreWwMapping1b;
		}
		public void setTcIsUserStoreWwMapping1b(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping1b = value;
		}
		public java.lang.String getTcIsUserTeamMapping0a() 
		{
			return this.tcIsUserTeamMapping0a;
		}
		public void setTcIsUserTeamMapping0a(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0a = value;
		}
		public java.lang.String getTcIsUserTeamMapping0b() 
		{
			return this.tcIsUserTeamMapping0b;
		}
		public void setTcIsUserTeamMapping0b(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0b = value;
		}
		public java.lang.String getTcIsUserTeamMapping0c() 
		{
			return this.tcIsUserTeamMapping0c;
		}
		public void setTcIsUserTeamMapping0c(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0c = value;
		}
		public java.lang.String getTcIsUserTeamMapping0d() 
		{
			return this.tcIsUserTeamMapping0d;
		}
		public void setTcIsUserTeamMapping0d(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0d = value;
		}
		public java.lang.String getTcIsUserTeamMapping0e() 
		{
			return this.tcIsUserTeamMapping0e;
		}
		public void setTcIsUserTeamMapping0e(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0e = value;
		}
		public java.lang.String getTcIsUserTeamMapping0f() 
		{
			return this.tcIsUserTeamMapping0f;
		}
		public void setTcIsUserTeamMapping0f(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0f = value;
		}
		public java.lang.String getTcIsUserTeamMapping0g() 
		{
			return this.tcIsUserTeamMapping0g;
		}
		public void setTcIsUserTeamMapping0g(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0g = value;
		}
		public java.lang.String getTcIsUserTeamMapping0h() 
		{
			return this.tcIsUserTeamMapping0h;
		}
		public void setTcIsUserTeamMapping0h(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0h = value;
		}
		public java.lang.String getTcIsUserTeamMapping0i() 
		{
			return this.tcIsUserTeamMapping0i;
		}
		public void setTcIsUserTeamMapping0i(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0i = value;
		}
		public java.lang.String getTcIsUserTeamMapping1a() 
		{
			return this.tcIsUserTeamMapping1a;
		}
		public void setTcIsUserTeamMapping1a(java.lang.String value) 
		{
			this.tcIsUserTeamMapping1a = value;
		}
		public java.lang.String getTcIsUserTeamMapping1b() 
		{
			return this.tcIsUserTeamMapping1b;
		}
		public void setTcIsUserTeamMapping1b(java.lang.String value) 
		{
			this.tcIsUserTeamMapping1b = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0j() 
		{
			return this.tcIsUserEnterpriseMap0j;
		}
		public void setTcIsUserEnterpriseMap0j(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0j = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0j() 
		{
			return this.tcIsUserCompanyMapping0j;
		}
		public void setTcIsUserCompanyMapping0j(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0j = value;
		}
		public java.lang.String getTcIsUserGroupMapping0j() 
		{
			return this.tcIsUserGroupMapping0j;
		}
		public void setTcIsUserGroupMapping0j(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0j = value;
		}
		public java.lang.String getTcIsUserMethodMapping0j() 
		{
			return this.tcIsUserMethodMapping0j;
		}
		public void setTcIsUserMethodMapping0j(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0j = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0j() 
		{
			return this.tcIsUserCustomerMapping0j;
		}
		public void setTcIsUserCustomerMapping0j(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0j = value;
		}
		public java.lang.String getTcIsUserStoreMapping0j() 
		{
			return this.tcIsUserStoreMapping0j;
		}
		public void setTcIsUserStoreMapping0j(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0j = value;
		}
		public java.lang.String getTcIsUserCountryMapping0j() 
		{
			return this.tcIsUserCountryMapping0j;
		}
		public void setTcIsUserCountryMapping0j(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0j = value;
		}
		public java.lang.String getTcIsUserRegionMapping0j() 
		{
			return this.tcIsUserRegionMapping0j;
		}
		public void setTcIsUserRegionMapping0j(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0j = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0j() 
		{
			return this.tcIsUserProvinceMapping0j;
		}
		public void setTcIsUserProvinceMapping0j(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0j = value;
		}
		public java.lang.String getTcIsUserCityMapping0j() 
		{
			return this.tcIsUserCityMapping0j;
		}
		public void setTcIsUserCityMapping0j(java.lang.String value) 
		{
			this.tcIsUserCityMapping0j = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0j() 
		{
			return this.tcIsUserStoreWwMapping0j;
		}
		public void setTcIsUserStoreWwMapping0j(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0j = value;
		}
		public java.lang.String getTcIsUserTeamMapping0j() 
		{
			return this.tcIsUserTeamMapping0j;
		}
		public void setTcIsUserTeamMapping0j(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0j = value;
		}
		public java.lang.String getTcIsUserEnterpriseMap0k() 
		{
			return this.tcIsUserEnterpriseMap0k;
		}
		public void setTcIsUserEnterpriseMap0k(java.lang.String value) 
		{
			this.tcIsUserEnterpriseMap0k = value;
		}
		public java.lang.String getTcIsUserCompanyMapping0k() 
		{
			return this.tcIsUserCompanyMapping0k;
		}
		public void setTcIsUserCompanyMapping0k(java.lang.String value) 
		{
			this.tcIsUserCompanyMapping0k = value;
		}
		public java.lang.String getTcIsUserGroupMapping0k() 
		{
			return this.tcIsUserGroupMapping0k;
		}
		public void setTcIsUserGroupMapping0k(java.lang.String value) 
		{
			this.tcIsUserGroupMapping0k = value;
		}
		public java.lang.String getTcIsUserMethodMapping0k() 
		{
			return this.tcIsUserMethodMapping0k;
		}
		public void setTcIsUserMethodMapping0k(java.lang.String value) 
		{
			this.tcIsUserMethodMapping0k = value;
		}
		public java.lang.String getTcIsUserCustomerMapping0k() 
		{
			return this.tcIsUserCustomerMapping0k;
		}
		public void setTcIsUserCustomerMapping0k(java.lang.String value) 
		{
			this.tcIsUserCustomerMapping0k = value;
		}
		public java.lang.String getTcIsUserStoreMapping0k() 
		{
			return this.tcIsUserStoreMapping0k;
		}
		public void setTcIsUserStoreMapping0k(java.lang.String value) 
		{
			this.tcIsUserStoreMapping0k = value;
		}
		public java.lang.String getTcIsUserCountryMapping0k() 
		{
			return this.tcIsUserCountryMapping0k;
		}
		public void setTcIsUserCountryMapping0k(java.lang.String value) 
		{
			this.tcIsUserCountryMapping0k = value;
		}
		public java.lang.String getTcIsUserRegionMapping0k() 
		{
			return this.tcIsUserRegionMapping0k;
		}
		public void setTcIsUserRegionMapping0k(java.lang.String value) 
		{
			this.tcIsUserRegionMapping0k = value;
		}
		public java.lang.String getTcIsUserProvinceMapping0k() 
		{
			return this.tcIsUserProvinceMapping0k;
		}
		public void setTcIsUserProvinceMapping0k(java.lang.String value) 
		{
			this.tcIsUserProvinceMapping0k = value;
		}
		public java.lang.String getTcIsUserCityMapping0k() 
		{
			return this.tcIsUserCityMapping0k;
		}
		public void setTcIsUserCityMapping0k(java.lang.String value) 
		{
			this.tcIsUserCityMapping0k = value;
		}
		public java.lang.String getTcIsUserStoreWwMapping0k() 
		{
			return this.tcIsUserStoreWwMapping0k;
		}
		public void setTcIsUserStoreWwMapping0k(java.lang.String value) 
		{
			this.tcIsUserStoreWwMapping0k = value;
		}
		public java.lang.String getTcIsUserTeamMapping0k() 
		{
			return this.tcIsUserTeamMapping0k;
		}
		public void setTcIsUserTeamMapping0k(java.lang.String value) 
		{
			this.tcIsUserTeamMapping0k = value;
		}
		public java.lang.String getTcOldCode() 
		{
			return this.tcOldCode;
		}
		public void setTcOldCode(java.lang.String value) 
		{
			this.tcOldCode = value;
		}
	
		public String[] getTcRowidArray() 
		{
			return this.tcRowidArray;
		}
		public void setTcRowidArray(String[] value) 
		{
			this.tcRowidArray = value;
		}

		@Override
		public String toString()
		{
			return "DynamicWhere [" + 
					"tcCode=" + tcCode
					+ ", tcName=" + tcName
					+ ", tcDescription=" + tcDescription
					+ ", tcAddUserRowid=" + tcAddUserRowid
					+ ", tcAddTime=" + tcAddTime
					+ ", tcUpdateUserRowid=" + tcUpdateUserRowid
					+ ", tcUpdateTime=" + tcUpdateTime
					+ ", tcDeleteUserRowid=" + tcDeleteUserRowid
					+ ", tcDeleteTime=" + tcDeleteTime
					+ ", tcActiveUserRowid=" + tcActiveUserRowid
					+ ", tcActiveTime=" + tcActiveTime
					+ ", tcCloseUserRowid=" + tcCloseUserRowid
					+ ", tcCloseTime=" + tcCloseTime
					+ ", tcStatus=" + tcStatus
					+ ", tcPassword=" + tcPassword
					+ ", tcUserType=" + tcUserType
					+ ", tcDepartmentRowid=" + tcDepartmentRowid
					+ ", tcPwdModifyTime=" + tcPwdModifyTime
					+ ", tcPwdValidTime=" + tcPwdValidTime
					+ ", tcFailureTime=" + tcFailureTime
					+ ", tcLastLoginTime=" + tcLastLoginTime
					+ ", tcIsUserEnterpriseMap0a=" + tcIsUserEnterpriseMap0a
					+ ", tcIsUserCompanyMapping0a=" + tcIsUserCompanyMapping0a
					+ ", tcIsUserGroupMapping0a=" + tcIsUserGroupMapping0a
					+ ", tcIsUserMethodMapping0a=" + tcIsUserMethodMapping0a
					+ ", tcIsUserCustomerMapping0a=" + tcIsUserCustomerMapping0a
					+ ", tcIsUserStoreMapping0a=" + tcIsUserStoreMapping0a
					+ ", tcIsUserCountryMapping0a=" + tcIsUserCountryMapping0a
					+ ", tcIsUserRegionMapping0a=" + tcIsUserRegionMapping0a
					+ ", tcIsUserProvinceMapping0a=" + tcIsUserProvinceMapping0a
					+ ", tcIsUserCityMapping0a=" + tcIsUserCityMapping0a
					+ ", tcIsUserEnterpriseMap0b=" + tcIsUserEnterpriseMap0b
					+ ", tcIsUserCompanyMapping0b=" + tcIsUserCompanyMapping0b
					+ ", tcIsUserGroupMapping0b=" + tcIsUserGroupMapping0b
					+ ", tcIsUserMethodMapping0b=" + tcIsUserMethodMapping0b
					+ ", tcIsUserCustomerMapping0b=" + tcIsUserCustomerMapping0b
					+ ", tcIsUserStoreMapping0b=" + tcIsUserStoreMapping0b
					+ ", tcIsUserCountryMapping0b=" + tcIsUserCountryMapping0b
					+ ", tcIsUserRegionMapping0b=" + tcIsUserRegionMapping0b
					+ ", tcIsUserProvinceMapping0b=" + tcIsUserProvinceMapping0b
					+ ", tcIsUserCityMapping0b=" + tcIsUserCityMapping0b
					+ ", tcIsUserEnterpriseMap0c=" + tcIsUserEnterpriseMap0c
					+ ", tcIsUserCompanyMapping0c=" + tcIsUserCompanyMapping0c
					+ ", tcIsUserGroupMapping0c=" + tcIsUserGroupMapping0c
					+ ", tcIsUserMethodMapping0c=" + tcIsUserMethodMapping0c
					+ ", tcIsUserCustomerMapping0c=" + tcIsUserCustomerMapping0c
					+ ", tcIsUserStoreMapping0c=" + tcIsUserStoreMapping0c
					+ ", tcIsUserCountryMapping0c=" + tcIsUserCountryMapping0c
					+ ", tcIsUserRegionMapping0c=" + tcIsUserRegionMapping0c
					+ ", tcIsUserProvinceMapping0c=" + tcIsUserProvinceMapping0c
					+ ", tcIsUserCityMapping0c=" + tcIsUserCityMapping0c
					+ ", tcIsUserEnterpriseMap0d=" + tcIsUserEnterpriseMap0d
					+ ", tcIsUserCompanyMapping0d=" + tcIsUserCompanyMapping0d
					+ ", tcIsUserGroupMapping0d=" + tcIsUserGroupMapping0d
					+ ", tcIsUserMethodMapping0d=" + tcIsUserMethodMapping0d
					+ ", tcIsUserCustomerMapping0d=" + tcIsUserCustomerMapping0d
					+ ", tcIsUserStoreMapping0d=" + tcIsUserStoreMapping0d
					+ ", tcIsUserCountryMapping0d=" + tcIsUserCountryMapping0d
					+ ", tcIsUserRegionMapping0d=" + tcIsUserRegionMapping0d
					+ ", tcIsUserProvinceMapping0d=" + tcIsUserProvinceMapping0d
					+ ", tcIsUserCityMapping0d=" + tcIsUserCityMapping0d
					+ ", tcIsUserEnterpriseMap0e=" + tcIsUserEnterpriseMap0e
					+ ", tcIsUserCompanyMapping0e=" + tcIsUserCompanyMapping0e
					+ ", tcIsUserGroupMapping0e=" + tcIsUserGroupMapping0e
					+ ", tcIsUserMethodMapping0e=" + tcIsUserMethodMapping0e
					+ ", tcIsUserCustomerMapping0e=" + tcIsUserCustomerMapping0e
					+ ", tcIsUserStoreMapping0e=" + tcIsUserStoreMapping0e
					+ ", tcIsUserCountryMapping0e=" + tcIsUserCountryMapping0e
					+ ", tcIsUserRegionMapping0e=" + tcIsUserRegionMapping0e
					+ ", tcIsUserProvinceMapping0e=" + tcIsUserProvinceMapping0e
					+ ", tcIsUserCityMapping0e=" + tcIsUserCityMapping0e
					+ ", tcIsUserEnterpriseMap0f=" + tcIsUserEnterpriseMap0f
					+ ", tcIsUserCompanyMapping0f=" + tcIsUserCompanyMapping0f
					+ ", tcIsUserGroupMapping0f=" + tcIsUserGroupMapping0f
					+ ", tcIsUserMethodMapping0f=" + tcIsUserMethodMapping0f
					+ ", tcIsUserCustomerMapping0f=" + tcIsUserCustomerMapping0f
					+ ", tcIsUserStoreMapping0f=" + tcIsUserStoreMapping0f
					+ ", tcIsUserCountryMapping0f=" + tcIsUserCountryMapping0f
					+ ", tcIsUserRegionMapping0f=" + tcIsUserRegionMapping0f
					+ ", tcIsUserProvinceMapping0f=" + tcIsUserProvinceMapping0f
					+ ", tcIsUserCityMapping0f=" + tcIsUserCityMapping0f
					+ ", tcIsUserEnterpriseMap0g=" + tcIsUserEnterpriseMap0g
					+ ", tcIsUserCompanyMapping0g=" + tcIsUserCompanyMapping0g
					+ ", tcIsUserGroupMapping0g=" + tcIsUserGroupMapping0g
					+ ", tcIsUserMethodMapping0g=" + tcIsUserMethodMapping0g
					+ ", tcIsUserCustomerMapping0g=" + tcIsUserCustomerMapping0g
					+ ", tcIsUserStoreMapping0g=" + tcIsUserStoreMapping0g
					+ ", tcIsUserCountryMapping0g=" + tcIsUserCountryMapping0g
					+ ", tcIsUserRegionMapping0g=" + tcIsUserRegionMapping0g
					+ ", tcIsUserProvinceMapping0g=" + tcIsUserProvinceMapping0g
					+ ", tcIsUserCityMapping0g=" + tcIsUserCityMapping0g
					+ ", tcIsUserEnterpriseMap0h=" + tcIsUserEnterpriseMap0h
					+ ", tcIsUserCompanyMapping0h=" + tcIsUserCompanyMapping0h
					+ ", tcIsUserGroupMapping0h=" + tcIsUserGroupMapping0h
					+ ", tcIsUserMethodMapping0h=" + tcIsUserMethodMapping0h
					+ ", tcIsUserCustomerMapping0h=" + tcIsUserCustomerMapping0h
					+ ", tcIsUserStoreMapping0h=" + tcIsUserStoreMapping0h
					+ ", tcIsUserCountryMapping0h=" + tcIsUserCountryMapping0h
					+ ", tcIsUserRegionMapping0h=" + tcIsUserRegionMapping0h
					+ ", tcIsUserProvinceMapping0h=" + tcIsUserProvinceMapping0h
					+ ", tcIsUserCityMapping0h=" + tcIsUserCityMapping0h
					+ ", tcIsUserEnterpriseMap0i=" + tcIsUserEnterpriseMap0i
					+ ", tcIsUserCompanyMapping0i=" + tcIsUserCompanyMapping0i
					+ ", tcIsUserGroupMapping0i=" + tcIsUserGroupMapping0i
					+ ", tcIsUserMethodMapping0i=" + tcIsUserMethodMapping0i
					+ ", tcIsUserCustomerMapping0i=" + tcIsUserCustomerMapping0i
					+ ", tcIsUserStoreMapping0i=" + tcIsUserStoreMapping0i
					+ ", tcIsUserCountryMapping0i=" + tcIsUserCountryMapping0i
					+ ", tcIsUserRegionMapping0i=" + tcIsUserRegionMapping0i
					+ ", tcIsUserProvinceMapping0i=" + tcIsUserProvinceMapping0i
					+ ", tcIsUserCityMapping0i=" + tcIsUserCityMapping0i
					+ ", tcIsUserBrandMapping0a=" + tcIsUserBrandMapping0a
					+ ", tcIsUserBrandMapping0b=" + tcIsUserBrandMapping0b
					+ ", tcMainCustomerRowid=" + tcMainCustomerRowid
					+ ", tcMainDownCustomerRowid=" + tcMainDownCustomerRowid
					+ ", tcIsUserFactoryMapping1a=" + tcIsUserFactoryMapping1a
					+ ", tcIsUserFactoryMapping1b=" + tcIsUserFactoryMapping1b
					+ ", tcIsUserStoreWwMapping0a=" + tcIsUserStoreWwMapping0a
					+ ", tcIsUserStoreWwMapping0b=" + tcIsUserStoreWwMapping0b
					+ ", tcIsUserStoreWwMapping0c=" + tcIsUserStoreWwMapping0c
					+ ", tcIsUserStoreWwMapping0d=" + tcIsUserStoreWwMapping0d
					+ ", tcIsUserStoreWwMapping0e=" + tcIsUserStoreWwMapping0e
					+ ", tcIsUserStoreWwMapping0f=" + tcIsUserStoreWwMapping0f
					+ ", tcIsUserStoreWwMapping0g=" + tcIsUserStoreWwMapping0g
					+ ", tcIsUserStoreWwMapping0h=" + tcIsUserStoreWwMapping0h
					+ ", tcIsUserStoreWwMapping0i=" + tcIsUserStoreWwMapping0i
					+ ", tcIsUserCompanyMapping1a=" + tcIsUserCompanyMapping1a
					+ ", tcIsUserCompanyMapping1b=" + tcIsUserCompanyMapping1b
					+ ", tcIsUserEnterpriseMap1a=" + tcIsUserEnterpriseMap1a
					+ ", tcIsUserGroupMapping1a=" + tcIsUserGroupMapping1a
					+ ", tcIsUserMethodMapping1a=" + tcIsUserMethodMapping1a
					+ ", tcIsUserCustomerMapping1a=" + tcIsUserCustomerMapping1a
					+ ", tcIsUserCountryMapping1a=" + tcIsUserCountryMapping1a
					+ ", tcIsUserRegionMapping1a=" + tcIsUserRegionMapping1a
					+ ", tcIsUserProvinceMapping1a=" + tcIsUserProvinceMapping1a
					+ ", tcIsUserCityMapping1a=" + tcIsUserCityMapping1a
					+ ", tcIsUserStoreWwMapping1a=" + tcIsUserStoreWwMapping1a
					+ ", tcIsUserEnterpriseMap1b=" + tcIsUserEnterpriseMap1b
					+ ", tcIsUserGroupMapping1b=" + tcIsUserGroupMapping1b
					+ ", tcIsUserMethodMapping1b=" + tcIsUserMethodMapping1b
					+ ", tcIsUserCustomerMapping1b=" + tcIsUserCustomerMapping1b
					+ ", tcIsUserCountryMapping1b=" + tcIsUserCountryMapping1b
					+ ", tcIsUserRegionMapping1b=" + tcIsUserRegionMapping1b
					+ ", tcIsUserProvinceMapping1b=" + tcIsUserProvinceMapping1b
					+ ", tcIsUserCityMapping1b=" + tcIsUserCityMapping1b
					+ ", tcIsUserStoreWwMapping1b=" + tcIsUserStoreWwMapping1b
					+ ", tcIsUserTeamMapping0a=" + tcIsUserTeamMapping0a
					+ ", tcIsUserTeamMapping0b=" + tcIsUserTeamMapping0b
					+ ", tcIsUserTeamMapping0c=" + tcIsUserTeamMapping0c
					+ ", tcIsUserTeamMapping0d=" + tcIsUserTeamMapping0d
					+ ", tcIsUserTeamMapping0e=" + tcIsUserTeamMapping0e
					+ ", tcIsUserTeamMapping0f=" + tcIsUserTeamMapping0f
					+ ", tcIsUserTeamMapping0g=" + tcIsUserTeamMapping0g
					+ ", tcIsUserTeamMapping0h=" + tcIsUserTeamMapping0h
					+ ", tcIsUserTeamMapping0i=" + tcIsUserTeamMapping0i
					+ ", tcIsUserTeamMapping1a=" + tcIsUserTeamMapping1a
					+ ", tcIsUserTeamMapping1b=" + tcIsUserTeamMapping1b
					+ ", tcIsUserEnterpriseMap0j=" + tcIsUserEnterpriseMap0j
					+ ", tcIsUserCompanyMapping0j=" + tcIsUserCompanyMapping0j
					+ ", tcIsUserGroupMapping0j=" + tcIsUserGroupMapping0j
					+ ", tcIsUserMethodMapping0j=" + tcIsUserMethodMapping0j
					+ ", tcIsUserCustomerMapping0j=" + tcIsUserCustomerMapping0j
					+ ", tcIsUserStoreMapping0j=" + tcIsUserStoreMapping0j
					+ ", tcIsUserCountryMapping0j=" + tcIsUserCountryMapping0j
					+ ", tcIsUserRegionMapping0j=" + tcIsUserRegionMapping0j
					+ ", tcIsUserProvinceMapping0j=" + tcIsUserProvinceMapping0j
					+ ", tcIsUserCityMapping0j=" + tcIsUserCityMapping0j
					+ ", tcIsUserStoreWwMapping0j=" + tcIsUserStoreWwMapping0j
					+ ", tcIsUserTeamMapping0j=" + tcIsUserTeamMapping0j
					+ ", tcIsUserEnterpriseMap0k=" + tcIsUserEnterpriseMap0k
					+ ", tcIsUserCompanyMapping0k=" + tcIsUserCompanyMapping0k
					+ ", tcIsUserGroupMapping0k=" + tcIsUserGroupMapping0k
					+ ", tcIsUserMethodMapping0k=" + tcIsUserMethodMapping0k
					+ ", tcIsUserCustomerMapping0k=" + tcIsUserCustomerMapping0k
					+ ", tcIsUserStoreMapping0k=" + tcIsUserStoreMapping0k
					+ ", tcIsUserCountryMapping0k=" + tcIsUserCountryMapping0k
					+ ", tcIsUserRegionMapping0k=" + tcIsUserRegionMapping0k
					+ ", tcIsUserProvinceMapping0k=" + tcIsUserProvinceMapping0k
					+ ", tcIsUserCityMapping0k=" + tcIsUserCityMapping0k
					+ ", tcIsUserStoreWwMapping0k=" + tcIsUserStoreWwMapping0k
					+ ", tcIsUserTeamMapping0k=" + tcIsUserTeamMapping0k
					+ ", tcOldCode=" + tcOldCode
					+ ", tcRowidArray=" + Arrays.toString(tcRowidArray)
					+ "]";
		}
	}
	
	public String[] getDynamicColumns()
	{
		return dynamicColumns;
	}
	
	public void setDynamicColumns(String[] dynamicColumns)
	{
		this.dynamicColumns = dynamicColumns;
	}
	
	public List<Map<String, Object>> getDynamicOrder()
	{
		return dynamicOrder;
	}
	
	public void setDynamicOrder(List<Map<String, Object>> dynamicOrder)
	{
		this.dynamicOrder = dynamicOrder;
	}
	
	public DynamicWhere getDynamicWhere()
	{
		return dynamicWhere;
	}

	public void setDynamicWhere(DynamicWhere dynamicWhere)
	{
		this.dynamicWhere = dynamicWhere;
	}
	
	public Integer getPage()
	{
		return page;
	}

	public void setPage(Integer page)
	{
		this.page = page;
	}

	public Integer getPagesize()
	{
		return pagesize;
	}

	public void setPagesize(Integer pagesize)
	{
		this.pagesize = pagesize;
	}

	@Override
	public String toString()
	{
		return "TbUserInfo0aGetListParam [dynamicColumns=" + Arrays.toString(dynamicColumns) + ", dynamicOrder="
				+ dynamicOrder + ", dynamicWhere=" + dynamicWhere.toString() + ", page=" + page + ", pagesize=" + pagesize + "]";
	}
}
