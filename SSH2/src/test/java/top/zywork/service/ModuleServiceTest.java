package top.zywork.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 权限服务测试类<br />
 * 创建于2017-09-11
 *
 * @author 王振宇
 */
@ContextConfiguration(locations = {"classpath:/config/spring-hibernate.xml",
        "classpath:/config/spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ModuleServiceTest {

    @Resource
    private ModuleService moduleService;

    @Test
    public void testGetById() {
        System.out.println(moduleService.getById(1L).getTitle());
    }

}
