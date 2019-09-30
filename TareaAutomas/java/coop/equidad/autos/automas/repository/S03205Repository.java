package coop.equidad.autos.automas.repository;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import coop.equidad.autos.automas.entity.S03205;
import coop.equidad.autos.automas.entity.S03205PK;

public interface S03205Repository extends CrudRepository<S03205, S03205PK> {
	@Query("SELECT s FROM S03205 s WHERE s.id.certif=:cert and s.id.coddet=:codde and s.id.codpla=:codpl and s.id.orden=:ord and s.id.sucur=:suc")
	List<S03205> findByS03205(@Param("cert") String cert, @Param("codde") String codde, @Param("codpl") String codpl,
			@Param("ord") BigDecimal ord, @Param("suc") String suc);
}

