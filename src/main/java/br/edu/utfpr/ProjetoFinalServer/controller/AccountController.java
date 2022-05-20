package br.edu.utfpr.ProjetoFinalServer.controller;

import br.edu.utfpr.ProjetoFinalServer.model.Account;
import br.edu.utfpr.ProjetoFinalServer.service.AccountService;
import br.edu.utfpr.ProjetoFinalServer.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController extends CrudController<Account, Long>{

    @Autowired
    private AccountService accountService;

    @Override
    protected CrudService<Account, Long> getService() {
        return this.accountService;
    }


}
