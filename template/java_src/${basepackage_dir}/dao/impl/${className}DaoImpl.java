<#assign className = table.className>
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

import cn.ctyun.core.base.dao.GenericDao;
import cn.ctyun.core.base.dao.Page;
import ${basepackage}.entity.${className};


import org.springframework.stereotype.Repository;


@Repository("${classNameLower}Dao")
public class ${className}DaoImpl extends BaseMybatisDao<${className},${table.idColumn.javaType}> implements ${className}Dao{
	
	@Override
	public String getMybatisMapperNamesapce() {
		return "${basepackage}.dao.${className}";
	}
	


}
