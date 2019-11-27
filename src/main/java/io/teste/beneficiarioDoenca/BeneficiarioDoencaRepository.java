package io.teste.beneficiarioDoenca;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BeneficiarioDoencaRepository extends JpaRepository<BeneficiarioDoenca, Long>, JpaSpecificationExecutor<BeneficiarioDoenca> {

	public List<BeneficiarioDoenca> findByBeneficiarioId(Long beneficiarioId);
}
