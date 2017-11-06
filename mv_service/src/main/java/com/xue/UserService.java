package com.xue;

public class UserService {
    public void  userService(String userName,String passWorld){

        UserDao userDao = new UserDao();
        userDao.userDao(userName,passWorld);
        System.out.println("service层输出 " +userName +"==" +passWorld);
    }
}