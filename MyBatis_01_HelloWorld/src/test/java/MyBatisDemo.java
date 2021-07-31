import com.lencho.mybatis.MyBatisMain8857;
import com.lencho.mybatis.entites.Student;
import com.lencho.mybatis.service.SqlSessionService;
import com.lencho.mybatis.service.StudentService;
import com.lencho.mybatis.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-07-31 8:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyBatisMain8857.class)
public class MyBatisDemo {
    @Resource
    private TestService testService;

    @Test
    public void queryStudents() {
        List<Map> maps = testService.queryStudents();
        System.out.println(maps);
    }

    @Autowired
    private SqlSessionService sessionService;

    @Test
    public void queryStus() {
        List<Map> maps = sessionService.queryStus();
        System.out.println(maps);
    }

    @Resource
    private StudentService studentService;

    @Test
    public void selectForPage1() {
        List<Student> students = studentService.selectForPage1(2, 3);
        System.out.println("-----------------------");
        System.out.println(students);
    }

    @Test
    public void selectForPage2() {
        int currentPage = 1;
        int pageSize = 5;
        Map<String, Object> map = new HashMap<>();
        map.put("startIndex", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<Student> students = studentService.selectForPage2(map);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void selectCount(){
        Integer count = studentService.selectCount();
        System.out.println(count);
        System.out.println("------------end-----------");
    }

    @Test
    public void selectForPage4(){
        List<Student> students = studentService.selectForPage4(0, 2, "h");
        System.out.println(students);
    }
}
