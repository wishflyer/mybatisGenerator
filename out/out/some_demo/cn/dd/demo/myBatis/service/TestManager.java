/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package cn.dd.demo.myBatis.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import cn.dd.demo.myBatis.model.*;
import cn.dd.demo.myBatis.dao.*;
import cn.dd.demo.myBatis.service.*;
import cn.dd.demo.myBatis.vo.query.*;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class TestManager extends BaseManager<Test,String>{

	private TestDao testDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setTestDao(TestDao dao) {
		this.testDao = dao;
	}
	
	public EntityDao getEntityDao() {
		return this.testDao;
	}
	
	/** */
	public Test createTest(Test test) {
	    Assert.notNull(test,"'test' must be not null");
	    initDefaultValuesForCreate(test);
	    new TestChecker().checkCreateTest(test);
	    this.testDao.save(test);
	    return test;
	}
	
    public Test updateTest(Test test) {
        Assert.notNull(test,"'test' must be not null");
        new TestChecker().checkUpdateTest(test);
        this.testDao.update(test);
        return test;
    }	

    public void deleteTestById(String id) {
        Assert.notNull(id,"'id' must be not null");
        this.testDao.deleteById(id);
    }
    
    public Test getTestById(String id) {
        Assert.notNull(id,"'id' must be not null");
        return this.testDao.getById(id);
    }
    
	@Transactional(readOnly=true)
	public Page findPage(TestQuery query) {
	    Assert.notNull(query,"'query' must be not null");
		return testDao.findPage(query);
	}
	
    
    public void initDefaultValuesForCreate(Test v) {
    }
    
    public class TestChecker {
        /**可以在此检查只有更新才需要的特殊检查 */
        public void checkUpdateTest(Test v) {
            checkTest(v);
        }
    
        /**可以在此检查只有创建才需要的特殊检查 */
        public void checkCreateTest(Test v) {
            checkTest(v);
        }
        
        /** 检查到有错误请直接抛异常，不要使用 return errorCode的方式 */
        public void checkTest(Test v) {
            //各个属性的检查一般需要分开写几个方法，如 checkProperty1(v),checkProperty2(v)
        }
    }
}
