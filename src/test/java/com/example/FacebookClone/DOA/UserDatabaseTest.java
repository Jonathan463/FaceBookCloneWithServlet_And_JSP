//package com.example.FacebookClone.DOA;
//
//import dbConnectionProvider.DbConnection;
//import com.example.FacebookClone.model.User;
//import com.example.FacebookClone.utils.PasswordHashing;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserDatabaseTest {
//
//    User user = null;
//
//    @BeforeEach
//    void setup(){
//        String password = PasswordHashing.encryptPassword("password");
//        user = new User("firstname","surname","numEmail",password,"sob","gender");
//    }
//
//    @Test
//    void userCrud(){
//        UserDatabase userDatabaseTest = new UserDatabase(DbConnection.getConnection());
//
//        boolean success = userDatabaseTest.registerUser(user);
//        assertTrue(success);
//
//        User user = loginUser("numEmail", "password");
//        assertNotNull(user);
//
//        assertNotNull(user.getUserName());
//        assertNotNull(user.getFirstName());
//        assertNotNull(user.getLastName());
//        assertNotNull(user.getEmail());
//        assertNotNull(user.getPassword());
//
//
//        assertEquals(user.getUserName(), "username");
//        assertEquals(user.getFirstName(), "firstname");
//        assertEquals(user.getLastName(), "lastname");
//        assertEquals(user.getEmail(), "email");
//        assertEquals(PasswordHashing.decryptPassword(user.getPassword()), "password");
//
//        //delete
////        boolean result = deleteUser("numEmail");
////        assertTrue(result);
//    }
//
//    User loginUser(String numEmail, String password){
//        UserDatabase userDatabaseTest = new UserDatabase(DbConnection.getConnection());
//        User success = userDatabaseTest.loginUser(numEmail, password);
//        return success;
//    }
//
////    boolean deleteUser(String data){
////        UserDatabase userDatabaseTest = new UserDatabase(DbConnection.getConnection());
////        boolean success = userDatabaseTest.deleteUser(data);
////        return success;
////    }
//}