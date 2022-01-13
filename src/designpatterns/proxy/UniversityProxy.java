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
        return "Instituição inválida";
    }

    @Override
    public String getCourseName() {
        if (checkLogin()) {
            return super.getCourseName();
        }
        return "Nome Inválido";
    }

    private boolean checkLogin() {
        return login == "correto";
    }
}
