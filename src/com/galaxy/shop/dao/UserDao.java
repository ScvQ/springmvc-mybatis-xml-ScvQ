package com.galaxy.shop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.galaxy.shop.model.entity.User;

@Repository("userDao")
public interface UserDao {

    public List<User> list();

}
