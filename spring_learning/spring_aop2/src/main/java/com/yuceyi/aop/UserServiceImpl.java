package com.yuceyi.aop;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(User user){
        System.out.println("增加User:" + user.getUid());
    }

    @Override
    public void deleteUser(int uid) {
        int a = 1 / uid;
        System.out.println("删除User:" + uid);
    }
} 
