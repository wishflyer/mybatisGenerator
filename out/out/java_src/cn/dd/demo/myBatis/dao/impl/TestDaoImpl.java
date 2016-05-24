package cn.dd.demo.myBatis.dao;

import cn.dd.core.myBatis.base.BaseMybatisDao;
import cn.dd.demo.myBatis.entity.Test;
import cn.dd.demo.myBatis.dao.TestDao;
import org.springframework.stereotype.Repository;


@Repository("testDao")
public class TestDaoImpl extends BaseMybatisDao<Test,String> implements TestDao{
	
	@Override
	public String getMybatisMapperNamesapce() {
		return "cn.dd.demo.myBatis.dao.Test";
	}

}
