package br.com.fiap.MVP3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.MVP3.model.Formulario;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Integer>{

}
