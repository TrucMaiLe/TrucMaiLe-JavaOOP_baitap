package JAVAOOP_BAI3.testcases;

import JAVAOOP_BAI3.common.BaseTest;

public class Testcases extends BaseTest {
    private String mail;
    private String pass;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public void getInfoLogin() {
        System.out.println("Email: " + getMail());
        System.out.println("Password: " + getPass());
    }

    public void TC_Login() {
        System.out.println("Step 1 : Open browser ");
        createDriver();
        System.out.println("Step 2 :Login browser ");
        setMail("admin@example.com");
        setPass("123456");
        getInfoLogin();
        System.out.println("Login successfuly");
        System.out.println("Step 3: Close browser ");
        closeDriver("Chrome");
    }

    public void TC_AddCategory() {
        System.out.println("Step 1 : Open browser");
        createDriver();
        System.out.println("Step 2: Add Category");
        System.out.println("Step 3: Close browser ");
        closeDriver("Chrome");

    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.TC_Login();
        System.out.println("===============================================");
        testcases.TC_AddCategory();
    }
}
