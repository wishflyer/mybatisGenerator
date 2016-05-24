<#assign className = table.className>
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

import cn.ctyun.core.base.dao.GenericDao;
import cn.ctyun.core.base.dao.Page;


public interface  ${className}Dao extends GenericDao<${className},${table.idColumn.javaType}>{
	


}
