package com.karetis.task.dataaccessobject;

import com.karetis.task.domainobject.UserDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserDO, Long> {

    Optional<UserDO> findByUsernameAndPassword(String username, String password);

}