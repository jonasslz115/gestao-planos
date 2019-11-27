package beneficiarioDoenca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BeneficiarioDoencaRepository extends JpaRepository<BeneficiarioDoenca, Long>, JpaSpecificationExecutor<BeneficiarioDoenca> {

}
