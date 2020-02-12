package com.xyinc.gps.repository;

import com.xyinc.gps.model.Pois;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PoisRepository extends CrudRepository<Pois, Integer>,  JpaSpecificationExecutor<Pois> {

    @Query(value = "FROM Pois WHERE SQRT(POWER(?1-cooX1,2)+POWER(?2-cooY1,2)) <= 10")
    List<Pois> findByCoo(@Param("cooX2") Integer cooX2, @Param("cooY2") Integer cooY2);
}



