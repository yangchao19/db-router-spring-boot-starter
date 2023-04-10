package com.yang.test;

import com.yang.db.router.annotation.DBRouter;



public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);

}
