package com.ex;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by appu on 5/1/17.
 */
public interface UserRepo extends JpaRepository<User,Long> {
    public User findOne(String user);
}
