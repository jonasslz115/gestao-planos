package beneficiarioDoenca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import doenca.Doenca;

public interface BeneficiarioDoencaRepository extends JpaRepository<BeneficiarioDoenca, Long>, JpaSpecificationExecutor<BeneficiarioDoenca> {

}
