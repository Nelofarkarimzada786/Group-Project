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
      
        private String email; // will store 
        Private String userName; // will store username
        private String password; /. wil store password

3. create setEmail method with validation as follows: 

             public void setEmail(String email)
              {
                 if(email != null && email.toLowerCase().endsWith("@yahoo.com")) // email != null  will ensure the email is not null, email.tpLowerCase().endsWith("Yahoo.com") --> this converts the emails to lowercase and check if it ends with @yahoo.com 
                   {
                      this.email = email; // stores the email 
                      System.out.println("Email set successfully."); / print the success messsgae 
                    }
                      else
                         {
                            System.out.println("Invalid email. only Yahoo emails are accepted must ends with @yahoo.com."); // print an error message 
                          }
              }

4. Create setUserName method with validation as follows: 
        
                public void setUserName(String userName)
                 {
                    if(userName != null && userName.length() > 6 && !userName.isEmpty()) // userName != null -- this ensures username is not null, userName.lenght() > 6 this ensures that the username is longer than 6 characters , !userName.isEmpty() this ensures the username is not empty 
                      {
                        this.userName =userName;  // stores the username 
                        System.out.println("Username set successfully."); // print success message 
                       }
                      else
                       {
                        System.out.println("Invalid username. must be longer than 6 characters and not empty."); // print error message 
                       }
                 }

5. create setPassword method as follows: 

            public void setPassword(String password)  
              {
                 if(password !=null && password.length() > 6 && !password.isEmpty()) // Password != null this ensures that password is not null , password.lenght() > this ensures that the password is longer than 6 characters , !password.isEmpty this ensures that the password is not empty 
                    {
                      if(userName != null && password.contains(userName))  // password.contains(userName) this check if the password contains username 
                          {
                            
                            System.out.println("Invalid password. Password cannot contain username."); // print error message 
                           }
                            else
                              {
                                this.password = password; // stores the passowrd ,  if password does not contain user name 
                                System.out.println("Password set successfully."); // print success message 
                               }
                    }
                      else
                       {
                          System.out.println("Invalid password. Must be longer than 6 and not empty."); // if basic checks fail prints an error message 
                        }
              }

6.Getter Methods as follows: 
            
            public String getEmail() // this metod will return the stored email 
              {
                return email;
               }

            public String getUserName()  // this method will return the sotred userName 
               {
                return userName;
                }

           public String getPassword() // this method will return the stored password 
              {
                return password;
              }
7. creating main method as follows: 
            
            public static void main(String[] args) 
               {
                 System.out.println("=== Testing Registration System ==="); // this will print title 
                 Registration user = new Registration(); // this will create registration object 

               //Test Email
                System.out.println("\n--- Testing Email validation---");
                user.setEmail(("test@gmail.com")); // invalid will be reject 
                user.setEmail(("test@yahoo.com")); // valid yahoo email will be accepted 

               //Test userName
               System.out.println("\n--- Testing Username validation---");
               user.setUserName("Short"); // Rejected(too short) 
               user.setUserName(""); //Rejected (empty)
               user.setUserName("Validusername"); //Accepted (valid lenght)


        //Test Password
        System.out.println("\n ---Testing password validation---");
        user.setPassword("Short"); //Rejected (too short)
        user.setPassword("");      //Rejected (empty)
        user.setPassword("Validusername123@"); //Rejected (contains userName)
        user.setPassword("validpass123");   // Accepted (valid password)

   }