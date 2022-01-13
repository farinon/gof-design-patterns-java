package designpatterns.proxy;

public class UniversityProxy extends University {

    public String login;

    public UniversityProxy(String login) {
        this.login = login;
    }

    @Override
    public String getInstitutionName() {
        if (checkLogin()) {
            return super.getInstitutionName();
        }
        return "Institui��o inv�lida";
    }

    @Override
    public String getCourseName() {
        if (checkLogin()) {
            return super.getCourseName();
        }
        return "Nome Inv�lido";
    }

    private boolean checkLogin() {
        return login == "correto";
    }
}
