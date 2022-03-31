package com.jack.demo02;

/**
 * @ClassName userServiceProxy
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 3:48 PM
 * @Version 1.0
 **/
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
