
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;




public class ${className}  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	

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
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>

