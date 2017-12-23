package com.csalgorithms.web.repository;

import com.csalgorithms.web.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {}
