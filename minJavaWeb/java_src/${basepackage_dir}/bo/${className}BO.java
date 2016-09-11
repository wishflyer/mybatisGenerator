<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.bo;

import java.util.*;
import cn.dd.core.utils.DateUtils;

public class ${className}BO  {

	<@generateFields/>
	<@generateProperties/>
}

<#macro generateFields>

	<#list table.columns as column>
	private ${column.javaType} ${column.columnNameLower};
	</#list>

</#macro>

<#macro generateProperties>
	<#list table.columns as column>

	<#if column.javaType == "Date"|| column.javaType == "TIMESTAMP">
	public String get${column.columnName}() {
		return ${column.columnNameLower} == null ? null: DateUtils.toString2(${column.columnNameLower});
	}
	<#else>
	public ${column.javaType} get${column.columnName}() {
		return ${column.columnNameLower};
	}
	</#if>


	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}

	</#list>
</#macro>



