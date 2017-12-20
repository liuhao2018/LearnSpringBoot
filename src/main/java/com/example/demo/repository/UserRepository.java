package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;

/**
 * @author liuhao
 */
@Repository
@Table(name = "user")
@Qualifier("userRepository")
public interface UserRepository extends CrudRepository<User,Long> {

    /** get user info
     * @param id user id
     * @return user info
     */
    @Override
    User findOne(Long id);

    /**
     * all user
     * @return all user
     */
    @Override
    List<User> findAll();

    /**
     * user
     * @param entity user
     * @return user info
     */
    @Override
    User save(User entity);
}
