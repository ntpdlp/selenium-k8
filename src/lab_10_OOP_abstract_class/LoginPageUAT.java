package lab_10_OOP_abstract_class;

public class LoginPageUAT extends LoginPage{
    @Override
    public String username() {
        return "UAT username";
    }

    @Override
    public String password() {
        return "UAT password";
    }

    @Override
    public String loginBtn() {
        return "UAT loginBtn";
    }
}
