package DataAccess.Abstracts;

import Entities.Entities.Customer;

import java.util.List;

public interface Database {
    List<Customer> getAll();
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    boolean getEmail(String email);
    boolean getPassword(String email);


}
