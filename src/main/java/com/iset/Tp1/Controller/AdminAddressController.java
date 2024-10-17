
package com.iset.Tp1.Controller;



import com.iset.Tp1.Model.AdminAddress;
import com.iset.Tp1.Repository.AdminAddressRepository;
import com.iset.Tp1.ServiceImpliment.AdminAddressServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class AdminAddressController {
    @Autowired
    private AdminAddressServiceImp adminAddressService;
    @Autowired
    private AdminAddressRepository AdminAddressRepo;

    @GetMapping("/AllAddress")
    public List<AdminAddress> listAllAdminEmails(){
        return this.adminAddressService.ListAllAddresses();
    }

}