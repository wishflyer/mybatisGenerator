
package cn.dd.demo.myBatis.repository.converter;

import cn.dd.demo.myBatis.dal.dataobject.TestDO;
import cn.dd.demo.myBatis.repository.model.Test;

import java.util.ArrayList;
import java.util.List;


public class TestRepositoryConverter {

    public static TestDO convert2TestDO(Test source) {
        TestDO target = new TestDO();
    
        target.setMsg(source.getMsg());
        
        return target;
    }

    public static List<TestDO> convert2TestDOList(Iterable<Test> list) {
        List<TestDO> results = new ArrayList();
        for(Test source : list) {
            results.add(convert2TestDO(source));
        }
        return results;
    }

    
    public static Test convert2Test(TestDO source) {
        Test target = new Test();
    
        target.setMsg(source.getMsg());
        
        return target;
    }

    public static List<Test> convert2TestList(Iterable<TestDO> list) {
        List<Test> results = new ArrayList();
        for(TestDO source : list) {
            results.add(convert2Test(source));
        }
        return results;
    }

    
    
}
        
