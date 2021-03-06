package com.tu.curd.service;

import com.tu.curd.model.User;
import com.tu.curd.util.DataSource;

/**
 * Created by tuyongjian on 2019/1/6.
 */
public interface IUserService {

    @DataSource("slave")//这个就是从库中读取数据
    User queryUser(int id);

    int addUser(User user);

    int updateUser(User user);

    int queryCount();
}
