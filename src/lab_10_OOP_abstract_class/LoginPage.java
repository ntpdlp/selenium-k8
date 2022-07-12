package lab_10_OOP_abstract_class;

public abstract class LoginPage {
    public abstract String username();
    public abstract String password();
    public abstract String loginBtn();

    public void login(){
        System.out.println("enter username" + username());
        System.out.println("enter password" + password());
        System.out.println("click Login button" + loginBtn());
    }
}
