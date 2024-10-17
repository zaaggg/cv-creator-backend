package com.iset.Tp1.Controller;

import com.iset.Tp1.Model.Account;
import com.iset.Tp1.Repository.AccountRepository;
import com.iset.Tp1.ServiceImpliment.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class AccountController {
    @Autowired
    private AccountServiceImp accountService;
    @Autowired
    private AccountRepository AccountRepo;


    @GetMapping("/Login/{email}/{password}")
    public Account login(@PathVariable("email")String email,@PathVariable("password") String password){
        return this.accountService.login( email,  password);
    }

    @GetMapping("/testLogin/{email}/{password}")
    public boolean testLogin(@PathVariable("email")String email,@PathVariable("password") String password){
        return this.accountService.testLogin( email,  password);
    }

    @GetMapping("/Accounts")
    public List<Account> listAllHobbies(){
        return this.accountService.ListAllAccounts();
    }

    @PostMapping("/Account/add")
    public boolean addAccount(@RequestBody Account account){
        String[] listEmail = AccountRepo.listEmail();
        boolean t = true;

        for (int i = 0; i < listEmail.length; i++) {
            if (listEmail[i].equals(account.getEmail())) {
                t = false;
                break;
            }
        }

        if (t) {
            accountService.addAccount(account);
        }

        return t;
    }

    @GetMapping("/isCreated/{id}")
    public boolean isCreated(@PathVariable("id")long id){return accountService.isCreated(id);}

    @GetMapping("/PdfData/{id}")
    public String getPdfData(@PathVariable("id")long id){return accountService.getPdfData(id);}


}
        /*do{
            if (listEmail[i]==account.getEmail()){
                t = false;
                break;
            }
        }while((i==listEmail.length-1)||(t==false));*/
