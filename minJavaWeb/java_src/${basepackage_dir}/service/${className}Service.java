<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;

import ${basepackage}.entity.${className};
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashMap;
import java.util.Map;
import java.util.List;

public interface ${className}Service {


    /**
     * 添加${className}
     * @return 成功添加条数
     */
    int add${className}(${className} new${className});


    /**
     * 置无效
     * @return 成功置无效条数
     */
    int setInvalid(${className} entity);


    /**
     * 置无效
     * @return 成功置有效条数
     */
    int setValid(${className} entity);


    /**
     * 删除
     * @return 成功删除条数
     */
    int deleteById(String id);

    /**
     * 批量删除
     */
    int deleteBatch(String[] id);

    /**
     * 批量删除
     */
    int update(${className} entity);

    /**
     * 根据ID获取对象
     */
    ${className} getById(String id);

    /**
     * 根据param获取分页对象
     */
    List<${className}> getByPage(Map param);

    /**
     * 根据条件获取分页对象
     */
    List<${className}> getByParam(${className} entity);

    /**
     * 根据ids批量设置有效
     */
    int setValidBatch(String[] ids);

    /**
     * 根据ids批量设置无效
     */
    int setInvalidBatch(String[] ids);

    /**
     * 根据ids批量添加
     */
    int insertBatch(List<${className}> entityList);

}
