package Registration;

public class Registration {

    //variables
    private String email;
    private String userName;
    private String password;


    // setting email method with validation
    public void setEmail(String email)
    {
        if(email != null && email.toLowerCase().endsWith("@yahoo.com"))
        {
            this.email = email;
            System.out.println("Email set successfully.");
        }
        else
        {
            System.out.println("Invalid email. only Yahoo emails are accepted must ends with @yahoo.com.");
        }
    }

    //setting username method with validation
    public void setUserName(String userName)
    {
        if(userName != null && userName.length() > 6 && !userName.isEmpty())
        {
            this.userName =userName;
            System.out.println("Username set successfully.");
        }
        else
        {
            System.out.println("Invalid username. must be longer than 6 characters and not empty.");
        }
    }

    //setting password method with validation
    public void setPassword(String password)
    {
        if(password !=null && password.length() > 6 && !password.isEmpty())
        {
            if(userName != null && password.contains(userName))
            {

                System.out.println("Invalid password. Password cannot contain username.");
            }
            else
            {
                this.password = password;
                System.out.println("Password set successfully.");
            }
        }
        else
        {
            System.out.println("Invalid password. Must be longer than 6 and not empty.");
        }
    }


    public String getEmail()
    {
        return email;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }


    public static void main(String[] args) {

        System.out.println("=== Testing Registration System ===");
        Registration user = new Registration();

        //Test Email
        System.out.println("\n--- Testing Email validation---");
        user.setEmail(("test@gmail.com"));
        user.setEmail(("test@yahoo.com"));

        //Test userName
        System.out.println("\n--- Testing Username validation---");
        user.setUserName("Short");
        user.setUserName("");
        user.setUserName("Validusername");


        //Test Password
        System.out.println("\n ---Testing password validation---");
        user.setPassword("Short");
        user.setPassword("");
        user.setPassword("Validusername123@");
        user.setPassword("validpass123");

    }

}

