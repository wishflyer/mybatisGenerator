<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.ctyun.core.base.service.GenericService;

@Service
@Transactional
public interface ${className}Service extends GenericService{



}
