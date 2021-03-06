package springboot.example.usemysql;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import springboot.example.usemysql.entity.Deparment;
import springboot.example.usemysql.entity.Role;
import springboot.example.usemysql.entity.User;
import springboot.example.usemysql.repository.DeparmentRepository;
import springboot.example.usemysql.repository.RoleRepository;
import springboot.example.usemysql.repository.UserRepository;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfiguration.class)
public class MysqlTest {
    private static Logger logger=LoggerFactory.getLogger(MysqlTest.class);

    @Autowired
    UserRepository userRepository;
    @Autowired
    DeparmentRepository deparmentRepository;
    @Autowired
    RoleRepository roleRepository;

    @Before
    public void initData(){
//        userRepository.deleteAll();
//        roleRepository.deleteAll();
//        deparmentRepository.deleteAll();
//
//        Deparment deparment=new Deparment();
//        deparment.setName("开发部");
//        deparmentRepository.save(deparment);
//        Assert.notNull(deparment.getId());
//
//        Role role=new Role();
//        role.setName("admin");
//        roleRepository.save(role);
//        Assert.notNull(role.getId());
//
//        User user=new User();
//        user.setName("user");
//        user.setCreatedate(new Date());
//        user.setDeparment(deparment);
//        List<Role>roles=roleRepository.findAll();
//        Assert.notNull(roles);
//        user.setRoles(roles);
//
//        userRepository.save(user);
//        Assert.notNull(user.getId());
    }

    @Test
    public void findPage(){
//        Pageable pageable=new PageRequest(0,10,new Sort(Sort.Direction.ASC,"id"));
//        Page<User>page=userRepository.findAll(pageable);
//        Assert.notNull(page);
//        page.forEach(user -> logger.info("=====user name:{}, department name:{}, role name:{}",user.getName(),user.getDeparment().getName(),
//                user.getRoles().get(0).getName()));

    }
}
