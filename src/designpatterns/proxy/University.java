package designpatterns.proxy;

public class University {

    private String institutionName;
    private String courseName;

    public String getInstitutionName() {
    	institutionName = "IFRS - RS";
        return institutionName;
    }

    public String getCourseName() {
    	courseName =  "ADS";
        return courseName;
    }

}
