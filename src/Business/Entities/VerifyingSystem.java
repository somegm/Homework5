package Business.Entities;

import java.util.ArrayList;
import java.util.List;

public class VerifyingSystem implements Business.Abstracts.VerifyingSystem {
    List<String> verificatedMails = new ArrayList<String>();
    @Override
    public void sendVerificationMail(String mail) {
        verificatedMails.add(mail);
        System.out.println(mail+ " başarılı bir şekilde doğrulandı");


    }

    @Override
    public boolean checkMail(String mail) {
        return false;
    }

    @Override
    public boolean checkVerifyMail(String mail) {
        if(verificatedMails.contains(mail)){
            return true;
        }
        return false;

    }
}
