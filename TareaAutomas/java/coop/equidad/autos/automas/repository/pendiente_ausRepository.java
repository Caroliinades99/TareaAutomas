package coop.equidad.autos.automas.repository;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import coop.equidad.autos.automas.entity.pendiente_aus;
import coop.equidad.autos.automas.entity.pendiente_ausPK;
import org.springframework.data.repository.query.Param;

public interface pendiente_ausRepository extends CrudRepository<pendiente_aus, pendiente_ausPK> {

	@Query("SELECT p FROM pendiente_aus p WHERE p.estado = :estad")
	List<pendiente_aus> findBy(@Param("estad") BigDecimal estad);
	
	@Query("SELECT p FROM pendiente_aus p WHERE p.estado = :estad and p.id.certif = :certif")
	List<pendiente_aus> findByCertif(@Param("estad") BigDecimal estad, @Param("certif") String certif);

}
