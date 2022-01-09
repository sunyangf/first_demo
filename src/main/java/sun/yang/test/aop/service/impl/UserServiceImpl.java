package sun.yang.test.aop.service.impl;

import sun.yang.test.aop.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void print() {
        System.out.println(getClass()+"#print");
    }
}
