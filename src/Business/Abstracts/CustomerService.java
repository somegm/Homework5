package Business.Abstracts;

import Entities.Entities.Customer;

public interface CustomerService {
    void signUp(Customer customer);
    void signIn(Customer customer);
    void logOut(Customer customer);
}
