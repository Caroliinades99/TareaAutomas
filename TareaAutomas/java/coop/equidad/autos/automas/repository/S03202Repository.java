package coop.equidad.autos.automas.repository;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import coop.equidad.autos.automas.entity.S03202;
import coop.equidad.autos.automas.entity.S03202PK;

public interface S03202Repository extends CrudRepository<S03202, S03202PK> {
	@Query("SELECT s FROM S03202 s WHERE s.id.certif=:cert and s.id.codpla=:codpl "
			+ "and s.id.sucur=:suc and s.orden=:ord and s.id.vinculacion = 1")
	List<S03202> findByS03202(@Param("cert") String cert, @Param("codpl") String codpl, @Param("suc") String suc,
			@Param("ord") BigDecimal ord);
}
