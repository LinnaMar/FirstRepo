package HillelBtntext;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy
            (id = "addNewRecordButton")
    WebElement addButton;

    @FindBy
            (id = "firstName")
    WebElement firstName;

    @FindBy
            (id = "lastName")
    WebElement lastName;

    @FindBy
            (id = "userEmail")
    WebElement email;

    @FindBy
            (id = "age")
    WebElement userAge;

    @FindBy
            (id = "salary")
    WebElement userSalary;

    @FindBy
            (id = "department")
    WebElement department;

    @FindBy
            (id = "submit")
    WebElement submitButton;

    @FindBy
            (id = "searchBox")
    WebElement searchBox;



    private String emailName = "abv@gmail.com";
    public String getEmailName() {
        return emailName;
    }

    private String firstName1 = "Mary";
    public String getFirstName() {
        return firstName1;
    }

    private String lastName1 = "Zubova";
    public String getLastName() {
        return lastName1;
    }

    private String age = "35";
    public String getAge () {
        return age;
    }

    private String wrongUsersalary = "abv";
    public String getWrongUsersalary() {
        return wrongUsersalary;
    }




}
