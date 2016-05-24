<#assign className = table.className>
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

import cn.dd.core.myBatis.base.GenericDao;
import ${basepackage}.entity.${className};

public interface  ${className}Dao extends GenericDao<${className},${table.idColumn.javaType}>{

}
