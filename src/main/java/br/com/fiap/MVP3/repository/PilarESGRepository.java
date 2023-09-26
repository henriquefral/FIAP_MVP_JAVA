package br.com.fiap.MVP3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.MVP3.model.PilarESG;

@Repository
public interface PilarESGRepository extends JpaRepository<PilarESG, Integer>{

}
