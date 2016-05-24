<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.bo;

import java.util.*;

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
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}

	</#list>
</#macro>



