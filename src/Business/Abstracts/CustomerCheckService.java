package Business.Abstracts;

import Entities.Entities.Customer;

public interface CustomerCheckService {
    boolean checkEmailService(Customer customer);
    boolean checkFirstName(Customer customer);
    boolean checkLastName(Customer customer);
    boolean checkPassword(Customer customer);
    boolean checkValidUp(Customer customer);
}
