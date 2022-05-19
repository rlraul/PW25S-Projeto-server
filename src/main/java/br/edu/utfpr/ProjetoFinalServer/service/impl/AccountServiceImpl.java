package br.edu.utfpr.ProjetoFinalServer.service.impl;

import br.edu.utfpr.ProjetoFinalServer.model.Account;
import br.edu.utfpr.ProjetoFinalServer.repository.AccountRepository;
import br.edu.utfpr.ProjetoFinalServer.service.AccountService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends CrudServiceImpl<Account, Long> implements AccountService{

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    protected JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }
}
