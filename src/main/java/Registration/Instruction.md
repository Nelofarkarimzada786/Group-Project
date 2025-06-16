-
Create Registration Class in which you would have 
variables such as email, userName and password that have 
an access scope only within its own class. After creating 
an object of the class, the user should be able to call methods 
and in each method separately pass values to set users email, username and password.

**Requirements:**
Valid email consider to be only yahoo
Valid userName and password cannot be empty 
and should be of length larger than 6 characters.
Also, valid passwords cannot contain userName.

**Solution**

1. create registration class 
2. create instance variables(private which is only accessible within Registration class) which contains: 
      
        private String email;
        Private String userName;
        private String password;

3. create setEmail method with validation as follows: 

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

4. Create setUserName method with validation as follows: 
        
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

5. create setPassword method as follows: 

            public void setPassword(String password)
              {
                 if(password !=null && password.length() > 6 && !password.isEmpty())
                    {
                      if(userName != null && password.contains(userName))
                          {
                            this.password = password;
                            System.out.println("Invalid password. Password cannot contain username.");
                           }
                            else
                              {
                                System.out.println("Password set successfully.");
                               }
                    }
                      else
                       {
                          System.out.println("Invalid password. Must be longer than 6 and not empty.");
                        }
              }

6.Getter Methods as follows: 
            
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
7. creating main method as follows: 
            
            public static void main(String[] args) 
               {
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