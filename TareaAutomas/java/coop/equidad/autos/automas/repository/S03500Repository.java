package coop.equidad.autos.automas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import coop.equidad.autos.automas.entity.S03500;
import coop.equidad.autos.automas.entity.S03500PK;

public interface S03500Repository extends CrudRepository<S03500, S03500PK> {
	@Query("SELECT s FROM S03500 s WHERE s.id.codigo=:cod")
	List<S03500> findByS03500(@Param("cod") String cod);
}