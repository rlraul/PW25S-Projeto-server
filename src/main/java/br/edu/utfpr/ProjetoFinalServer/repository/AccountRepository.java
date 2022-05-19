package br.edu.utfpr.ProjetoFinalServer.repository;

import br.edu.utfpr.ProjetoFinalServer.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
