package beneficiario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long>, JpaSpecificationExecutor<Beneficiario> {
	
}