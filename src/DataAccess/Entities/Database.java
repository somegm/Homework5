package DataAccess.Entities;

import Entities.Entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class Database implements DataAccess.Abstracts.Database {
    List<Customer> customers = new ArrayList<Customer>();
    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public boolean getEmail(String mail) {
        for (Customer customer : customers) {
            if(customer.getMail() == mail) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getPassword(String password) {
        for (Customer customer : customers){
            if(customer.getPassword() == password);
            return true;
        }
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
