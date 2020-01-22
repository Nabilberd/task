package com.karetis.task.dataaccessobject;

import com.karetis.task.domainobject.RandowDataDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandowDataRepository extends CrudRepository<RandowDataDO, Long> {
}