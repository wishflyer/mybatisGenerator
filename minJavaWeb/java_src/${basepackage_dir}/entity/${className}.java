<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;

import java.util.*;
import cn.dd.core.utils.DateUtils;

public class ${className}  implements java.io.Serializable{

	private static final long serialVersionUID = 8868155888220151225L;

	<#list table.columns as column>
	private ${column.javaType} ${column.columnNameLower};
	</#list>

<@generateConstructor className/>
<@generateJavaColumns/>

}

<#macro generateJavaColumns>
	<#list table.columns as column>

	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}

	<#if column.javaType == "Date"|| column.javaType == "TIMESTAMP">
	public String get${column.columnName}() {
		return ${column.columnNameLower} == null ? null: DateUtils.toString2(${column.columnNameLower});
	}
	<#else>
	public ${column.javaType} get${column.columnName}() {
		return ${column.columnNameLower};
	}
	</#if>
	</#list>
</#macro>

