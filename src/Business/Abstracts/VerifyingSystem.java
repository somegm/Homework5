package Business.Abstracts;

public interface VerifyingSystem {
    void sendVerificationMail(String mail);
    boolean checkMail(String mail);
    boolean checkVerifyMail(String mail);
}
