package bllose.controller;

import com.opensymphony.xwork2.ActionSupport;

import bllose.object.Person;

public class Register extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    private Person personBean;


    @Override
    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        
        return SUCCESS;
    }
    
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }
    
    /**
     * <pre>
     * When the user presses the submit button on the register form, 
     * Struts 2 will transfer the user¡¯s input to the personBean¡¯s instance fields. 
     * Then Struts 2 will automatically execute the validate method. 
     * If any of the if statements are true, Struts 2 will call its addFieldError method 
     * (which our Action class inherited by extending ActionSupport).
     * 
     * If any errors have been added then Struts 2 will not proceed to call the execute method. 
     * Rather the Struts 2 framework will return <U>input</U> as the result of calling the action.
     * </pre>*/
    @Override
    public void validate(){
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }

        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }
}
