package Business.Entities;
import Business.Abstracts.CustomerCheckService;
import DataAccess.Abstracts.Database;
import Entities.Entities.Customer;


public class CustomerService implements Business.Abstracts.CustomerService {
    public CustomerService(Business.Entities.CustomerCheckService customerCheckService, VerifyingSystem verifyingSystem, Business.Abstracts.CustomerService customerService){
        this.customerCheckService=customerCheckService;
        this.verifyingSystem=verifyingSystem;
        this.customerService= (CustomerService) customerService;
    }

    CustomerCheckService customerCheckService;
    VerifyingSystem verifyingSystem;
    CustomerService customerService;
    Database database;

    public CustomerService() {

    }


    @Override
    public void signUp(Customer customer) {
        if(customerCheckService.checkEmailService(customer) == true){
            System.out.println(customer.getFirstName()+" Adlı kişi kaydoldu");
        }

    }

    @Override
    public void signIn(Customer customer) {
        if(database.getEmail(customer.getMail()) && database.getPassword(customer.getPassword()) == true ){
            System.out.println(customer.getCustomerId()+ " kullanıcı giriş yaptı");

        }
        else{
            System.out.println("Kullanıcı yanlış mail veya şifre girdi");
        }

    }

    @Override
    public void logOut(Customer customer) {
        System.out.println(customer.getCustomerId() + " kullanıcı çıkış yaptı");

    }

}
