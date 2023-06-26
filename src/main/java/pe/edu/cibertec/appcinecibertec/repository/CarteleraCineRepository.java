package pe.edu.cibertec.appcinecibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.appcinecibertec.model.sp.CarteleraCineSp;

@Repository
public interface CarteleraCineRepository extends JpaRepository<CarteleraCineSp, Integer> {
	
	@Query(value = "{call sp_listarCartelera()}",nativeQuery = true)
	public List<CarteleraCineSp> listarCartelera();
	
	@Query(value = "{call sp_listarCartelera(:estado)}",nativeQuery = true)
	public List<CarteleraCineSp> listarCartelera(
			@Param("estado") Integer estado);

}
