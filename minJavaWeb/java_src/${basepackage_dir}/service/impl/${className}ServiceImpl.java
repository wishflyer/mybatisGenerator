<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.impl;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.service.${className}Service;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ${className}ServiceImpl implements ${className}Service {
    @Resource
	private ${className}Dao ${classNameLower}Dao;

}
