<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.impl;

import ${basepackage}.dao.${className}Dao
import ${basepackage}.service.${className}Service
import cn.ctyun.core.base.service.GenericServiceImpl;
import javax.annotation.Resource;

public class ${className}ServiceImpl extends GenericServiceImpl implements ${className}Service {
    @Resource
	private ${className}Dao ${classNameLower}Dao;


}
