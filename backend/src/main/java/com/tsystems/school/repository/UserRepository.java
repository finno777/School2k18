package com.tsystems.school.repository;


import com.tsystems.school.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository  extends CrudRepository<User,Long> {

    @Query("select u from User u where u.name = ?1")
    User getUserByName(String name);
}
