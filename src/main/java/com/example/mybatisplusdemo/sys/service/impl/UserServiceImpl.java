package com.example.mybatisplusdemo.sys.service.impl;

import com.example.mybatisplusdemo.sys.entity.User;
import com.example.mybatisplusdemo.sys.dao.UserDao;
import com.example.mybatisplusdemo.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author xiaojun
 * @since 2018-11-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
