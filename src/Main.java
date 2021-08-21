import Business.Abstracts.CustomerService;
import Business.Entities.CustomerCheckService;
import Business.Entities.VerifyingSystem;
import Entities.Entities.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerId("1");
        customer1.setFirstName("Hasan Fatih");
        customer1.setLastName("Ertürk");
        customer1.setMail("hasanfatiherturk35@gmail.com");
        customer1.setPassword("987654321");

        Customer customer2 = new Customer();
        customer2.setCustomerId("2");
        customer2.setFirstName("Eren Batu");
        customer2.setLastName("Günaydın");
        customer2.setMail("erenbatugunaydın@hotmail.com");
        customer2.setPassword("123456789");

        Customer customer3 = new Customer();
        customer3.setCustomerId("3");
        customer3.setFirstName("Ahmethan");
        customer3.setLastName("Fat");
        customer3.setMail("amethanfat@hotmail.com");
        customer3.setPassword("123459876");
        CustomerService customerService = new Business.Entities.CustomerService(new CustomerCheckService(), new VerifyingSystem(), new Business.Entities.CustomerService());




    }
}
