package Business.Entities;

import Entities.Entities.Customer;


import java.util.regex.Pattern;

public class CustomerCheckService implements Business.Abstracts.CustomerCheckService {

    @Override
    //Soner Çelik adlı kullanıcının  regex kodlarını kullandım burda kendisine teşekkür ederim.
    public boolean checkEmailService(Customer customer) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        if (customer.getMail().isEmpty()) {
            System.out.println("Email alanı boş bırakılamaz.");
            return false;
        } else {
            if (pattern.matcher(customer.getMail()).find() == false) {
                System.out.println("Girilen email adresi formata uygun değil. Örnek: ornek@ornek.com");
                return false;
            }
        }
        return true;

    }


    @Override
    public boolean checkFirstName(Customer customer) {
        if(customer.getFirstName().isEmpty()){
            System.out.println("İsim kısmı boş olamaz");
            return false;
        }
        else{
            if(customer.getFirstName().length() < 3){
                System.out.println("İsim 2 karakterden daha küçük olamaz");
                return false;
        }
        return true;
        }



    }

    @Override
    public boolean checkLastName(Customer customer) {
        if (customer.getLastName().isEmpty()) {
            System.out.println("Soyad kısmı boş olamaz");
            return false;
        } else {
            if (customer.getLastName().length() < 3) {
                System.out.println("Soyad 2 karakterden daha küçük olamaz");
                return false;
            }
            return true;

        }


    }

    @Override
    public boolean checkPassword(Customer customer) {
        if(customer.getPassword().isEmpty()){
            System.out.println("Şifre boş bırakılamaz");
            return false;
        }
        else{
            if(customer.getPassword().length()<7){
                System.out.println("Şifre 6 karakterden küçük olamaz");
                return false;
            }
            return true;
        }
    }

    @Override
    public boolean checkValidUp(Customer customer) {
        if(checkFirstName(customer) && checkLastName(customer) && checkEmailService(customer) && checkPassword(customer) == true){
            return true;

        }
        return false;
    }
}
