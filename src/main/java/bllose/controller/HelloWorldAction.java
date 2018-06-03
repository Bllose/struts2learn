package bllose.controller;

import com.opensymphony.xwork2.ActionSupport;

import bllose.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
	
    public int getHelloCount() {
        return helloCount;
    }

    @Override
    public String execute() {
        messageStore = new MessageStore() ;
        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }
        helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
