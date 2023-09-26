package br.com.fiap.MVP3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.MVP3.model.RankPilarESG;

@Repository
public interface RankPilarESGRepository extends JpaRepository<RankPilarESG, Integer>{

}
