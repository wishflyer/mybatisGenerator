<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.impl;

import ${basepackage}.entity.${className};
import ${basepackage}.dao.${className}Dao;
import ${basepackage}.service.${className}Service;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
@Service
@Transactional
public class ${className}ServiceImpl implements ${className}Service {
    @Resource
	private ${className}Dao ${classNameLower}Dao;


    @Override
    public int add${className}(${className} new${className}) {
        return ${classNameLower}Dao.insert(new${className});
    }

    @Override
    public int setInvalid(${className} entity) {
        return ${classNameLower}Dao.setInvalid(entity);
    }

    @Override
    public int setValid(${className} entity) {
        return ${classNameLower}Dao.setValid(entity);
    }

    @Override
    public int deleteById(String id) {
        return ${classNameLower}Dao.deleteById(id);
    }

    @Override
    public int deleteBatch(String[] id) {
        return ${classNameLower}Dao.deleteBatch(id);
    }

    @Override
    public int update(${className} entity) {
        return ${classNameLower}Dao.update(entity);
    }

    @Override
    public ${className} getById(String id) {
        return ${classNameLower}Dao.getById(id);
    }

    @Override
    public List<${className}> getByPage(Map param) {
        return ${classNameLower}Dao.getByPage(param);
    }

    @Override
    public List<${className}> getByParam(Map param) {
        return ${classNameLower}Dao.getByParam(param);
    }

    @Override
    public int setValidBatch(String[] ids) {
            return ${classNameLower}Dao.setValidBatch(ids);
            }

    @Override
    public int setInvalidBatch(String[] ids) {
        return ${classNameLower}Dao.setInvalidBatch(ids);
    }

    @Override
    public int insertBatch(List<${className}> entityList) {
        return ${classNameLower}Dao.insertBatch(entityList);
    }

    @Override
    public int getCountByParam(Map param){
        return ${classNameLower}Dao.getCountByParam(param);
    }

}
