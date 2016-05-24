<#assign className = table.className>
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

import cn.dd.core.myBatis.base.BaseMybatisDao;
import ${basepackage}.entity.${className};
import ${basepackage}.dao.${className}Dao;
import org.springframework.stereotype.Repository;


@Repository("${classNameLower}Dao")
public class ${className}DaoImpl extends BaseMybatisDao<${className},${table.idColumn.javaType}> implements ${className}Dao{
	
	@Override
	public String getMybatisMapperNamesapce() {
		return "${basepackage}.dao.${className}";
	}

}
