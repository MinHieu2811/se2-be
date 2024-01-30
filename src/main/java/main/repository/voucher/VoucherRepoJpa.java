package main.repository.voucher;

import main.repository.voucher.model.VoucherRepoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoucherRepoJpa extends JpaRepository<VoucherRepoModel, String> {
    Optional<VoucherRepoModel> findByCode(String s);
    Optional<VoucherRepoModel> findByVisibility(String visibility);

    Long deleteByCode(String code);
}
