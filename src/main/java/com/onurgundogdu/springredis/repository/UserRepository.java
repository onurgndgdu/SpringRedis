package com.onurgundogdu.springredis.repository;

import com.onurgundogdu.springredis.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
