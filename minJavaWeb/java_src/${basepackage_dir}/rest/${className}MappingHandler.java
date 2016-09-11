<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.rest;

import ${basepackage}.service.${className}Service;
import ${basepackage}.entity.${className};
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dd.core.utils.UUIDUtils;
import cn.dd.core.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import cn.dd.core.rest.result.JsonRESTResult;
import cn.dd.core.rest.result.RESTStatusCode;

@RestController
@RequestMapping("/${classNameLower}")
public class ${className}MappingHandler{

    @Resource
    private ${className}Service ${classNameLower}Service;



    @RequestMapping("/getByParam")
    public JsonRESTResult getByParam(@RequestBody String jsonStr) {

        //获得参数
        Map<String, Object> paramMap;
        List<${className}> ${classNameLower}List = null;
        try {
            paramMap = JsonUtils.parseMap(jsonStr);
            ${classNameLower}List = ${classNameLower}Service.getByParam(paramMap);

        } catch (IOException e) {
            e.printStackTrace();
        }

        JsonRESTResult restResult = new JsonRESTResult();
        if(${classNameLower}List != null){
            restResult.setReturnObj(${classNameLower}List);
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }

    @RequestMapping("/getByPage")
    public JsonRESTResult getByPage(@RequestBody String jsonStr) {
        //获得参数
        Map<String, Object> paramMap;
        List<${className}> ${classNameLower}List = null;
        try {
            paramMap = JsonUtils.parseMap(jsonStr);
            ${classNameLower}List = ${classNameLower}Service.getByPage(paramMap);

        } catch (IOException e) {
            e.printStackTrace();
        }

        JsonRESTResult restResult = new JsonRESTResult();
        if(${classNameLower}List != null){
            restResult.setReturnObj(${classNameLower}List);
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }


    @RequestMapping("/getById")
    public JsonRESTResult getById(@RequestBody String jsonStr) {
        //获得参数
        Map<String, Object> paramMap;
        ${className} ${classNameLower} = null;
        try {
            paramMap = JsonUtils.parseMap(jsonStr);
            String id = (String)paramMap.get("id");
            ${classNameLower} = ${classNameLower}Service.getById(id);

        } catch (IOException e) {
            e.printStackTrace();
        }

        JsonRESTResult restResult = new JsonRESTResult();
        if(${classNameLower} != null){
            restResult.setReturnObj(${classNameLower});
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }


    @RequestMapping(value = "/add${className}", method = RequestMethod.POST)
    public JsonRESTResult add${className}(@RequestBody String jsonStr) {
        //System.out.println("/addMenu ..................................");
        //System.out.println("jsonStr:"+jsonStr);
        Map<String, Object> paramMap = new HashMap<>();
        int count = 0;
        ${className} new${className} = new ${className}();
        try {
            paramMap = JsonUtils.parseMap(jsonStr);

            <@generateAddFunction/>

            count = ${classNameLower}Service.add${className}(new${className});
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonRESTResult restResult = new JsonRESTResult();
        if(count > 0){
            restResult.setReturnObj(new${className}.getId());
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }


    @RequestMapping(value = "/setInvalid", method = RequestMethod.POST)
    public JsonRESTResult setInvalid(@RequestBody String jsonStr) throws IOException {
        Map<String, Object> paramMap = JsonUtils.parseMap(jsonStr);
        ${className} new${className} = new ${className}();
        new${className}.setId((String)paramMap.get("id"));
        int count = ${classNameLower}Service.setInvalid(new${className});

        JsonRESTResult restResult = new JsonRESTResult();
        if(count > 0){
            restResult.setReturnObj(new${className}.getId());
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }

    @RequestMapping(value = "/setValid", method = RequestMethod.POST)
    public JsonRESTResult setValid(@RequestBody String jsonStr) throws IOException {
        Map<String, Object> paramMap = JsonUtils.parseMap(jsonStr);
        ${className} new${className} = new ${className}();
        new${className}.setId((String)paramMap.get("id"));
        int count = ${classNameLower}Service.setValid(new${className});

        JsonRESTResult restResult = new JsonRESTResult();
        if(count > 0){
            restResult.setReturnObj(new${className}.getId());
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public JsonRESTResult deleteById(@RequestBody String jsonStr) throws IOException {
        Map<String, Object> paramMap = JsonUtils.parseMap(jsonStr);
        String deleteId = (String)paramMap.get("id");
        int count = ${classNameLower}Service.deleteById(deleteId);

        JsonRESTResult restResult = new JsonRESTResult();
        if(count > 0){
            restResult.setReturnObj(deleteId);
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }

    @RequestMapping(value = "/deleteBatch", method = RequestMethod.POST)
    public JsonRESTResult deleteBatch(@RequestBody String jsonStr) throws IOException {
        Map<String, Object> paramMap = JsonUtils.parseMap(jsonStr);
        ArrayList<String> arrayList = (ArrayList<String>)paramMap.get("ids");
        int size=arrayList.size();
        String[] array = (String[])arrayList.toArray(new String[size]);
        int count = ${classNameLower}Service.deleteBatch(array);

        JsonRESTResult restResult = new JsonRESTResult();
        if(count > 0){
            restResult.setReturnObj(array);
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public JsonRESTResult update(@RequestBody String jsonStr) throws IOException {
        Map<String, Object> paramMap = JsonUtils.parseMap(jsonStr);
        ${className} new${className} = new ${className}();

        <@generateUpdateFunction/>

        int count = ${classNameLower}Service.update(new${className});

        JsonRESTResult restResult = new JsonRESTResult();
        if(count > 0){
            restResult.setReturnObj(new${className}.getId());
            restResult.setStatusCode(RESTStatusCode.SUCCESS);
        }else{
            restResult.setStatusCode(RESTStatusCode.ERROR);
        }
        return restResult;
    }


}


<#macro generateAddFunction>
    <#list table.columns as column>
            <#if column.columnNameLower == "id">
            new${className}.setId(UUIDUtils.getUUID());
            <#else>
                <#if column.javaType=='int'>
            if(paramMap.get("${column.columnNameLower}")!=null){
                new${className}.set${column.columnName}((${column.javaType}) paramMap.get("${column.columnNameLower}"));
            };
                <#else>
            new${className}.set${column.columnName}((${column.javaType}) paramMap.get("${column.columnNameLower}"));
                </#if>
            </#if>
    </#list>
</#macro>


<#macro generateUpdateFunction>
<#list table.columns as column>
    <#if column.columnNameLower == "modifyDate">
            new${className}.set${column.columnName}(new Date());
    <#else>
        <#if column.javaType=='int'>
        if(paramMap.get("${column.columnNameLower}")!=null){
            new${className}.set${column.columnName}((${column.javaType}) paramMap.get("${column.columnNameLower}"));
        };
        <#else>
        new${className}.set${column.columnName}((${column.javaType}) paramMap.get("${column.columnNameLower}"));
        </#if>
    </#if>
</#list>
</#macro>


<#macro generateQueryFunction>
<#list table.columns as column>
<#if column.javaType=='int'>
        if(paramMap.get("${column.columnNameLower}")!=null){
            ${classNameLower}.set${column.columnName}((${column.javaType}) paramMap.get("${column.columnNameLower}"));
        };
<#else>
        ${classNameLower}.set${column.columnName}((${column.javaType}) paramMap.get("${column.columnNameLower}"));
</#if>
</#list>
</#macro>