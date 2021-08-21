package Core;

import Business.Abstracts.VerifyingSystem;
import Entities.Entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class googleService implements VerifyingSystem {
    List<String> verificatedmails = new ArrayList<String>();
    Customer customer;

    @Override
    public void sendVerificationMail(String mail) {
        System.out.println(customer.getMail() + " adresine mail gönderildi.");
    }

    @Override
    public boolean checkMail(String mail) {
        if (verificatedmails.contains(mail)) {
            return true;
        }
        return false;


    }

    @Override
    public boolean checkVerifyMail(String mail) {
        if (verificatedmails.add(mail)) {
            System.out.println(mail + " doğrulandı");
            return true;

        }
        return false;


    }
}

