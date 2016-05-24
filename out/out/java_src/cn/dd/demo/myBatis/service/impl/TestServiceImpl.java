package cn.dd.demo.myBatis.service.impl;

import cn.dd.demo.myBatis.dao.TestDao;
import cn.dd.demo.myBatis.service.TestService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Resource
	private TestDao testDao;

}
