package com.example.mybatisplusdemo;

import com.example.mybatisplusdemo.sys.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//    }
//
//    @Test
//    public void testInsert() {
//        System.out.println(("----- insert method test ------"));
//        User user = new User();
//        user.setId(6L);
//        user.setName("xiaojun");
//        user.setAge(33);
//        user.setEmail("xiaoj@qq.com");
//        userMapper.insert(user);
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(6, userList.size());
//        userList.forEach(System.out::println);
//
//        User user1 = userMapper.selectById(6);
//        System.out.println("user6:" + user1);
//
//    }

    @Test
    public void testSelect(){
        User user = new User();
        user.setUserId(1L);
        User user1 = user.selectById();
        System.out.println(user1);
    }
}
