package bllose.model;

public class MessageStore {
    private String message;
    
    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }
    
    public String toString() {
        return message + " (from toString)";
    }

	public void setMessage(String string) {
		message = string;
	}
}
