import com.lencho.mybatis.MyBatisMain8857;
import com.lencho.mybatis.service.SqlSessionService;
import com.lencho.mybatis.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-07-31 8:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= MyBatisMain8857.class)
public class MyBatisDemo {
    @Resource
    private TestService testService;

    @Test
    public void queryStudents(){
        List<Map> maps = testService.queryStudents();
        System.out.println(maps);
    }

    @Autowired
    private SqlSessionService sessionService;

    @Test
    public void queryStus(){
        List<Map> maps = sessionService.queryStus();
        System.out.println(maps);
    }

}
