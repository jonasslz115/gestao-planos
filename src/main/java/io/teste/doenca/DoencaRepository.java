package io.teste.doenca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DoencaRepository extends JpaRepository<Doenca, Long>, JpaSpecificationExecutor<Doenca> {

}
