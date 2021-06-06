package sef.FinalActivity;

import junit.framework.TestCase;

public class TestStudent extends TestCase {
    private Student thePerson;
    protected void setUp() throws Exception {
        super.setUp();
        thePerson = new Student();
    }
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testFirstName() throws SetNameCustomException {
        String firstName;

        // checking the right name
        firstName = "John";
        thePerson.setFirstName(firstName);
        assertEquals("John",(thePerson.getFirstName()));

        //checking for empty name
        firstName = "";
        thePerson.setFirstName(firstName);
        assertEquals("",(thePerson.getFirstName()));

        //checking for name with space inside
        firstName = "John I";
        thePerson.setFirstName(firstName);
        assertEquals("John I",(thePerson.getFirstName()));

    }
    public void testLastName() throws SetNameCustomException {
        String lastName;

        // checking the right name
        lastName = "Doe";
        thePerson.setLastName(lastName);
        assertEquals("Doe",(thePerson.getLastName()));

        //checking the wrong name (with digits)
//        lastName = "D0e";
//        thePerson.setLastName(lastName);
//        assertEquals("Doe",(thePerson.getLastName()));

        //checking for empty name
        lastName = "";
        thePerson.setLastName(lastName);
        assertEquals("",(thePerson.getLastName()));

        //checking for name with space inside
        lastName = "Deja Vu";
        thePerson.setLastName(lastName);
        assertEquals("Deja Vu",(thePerson.getLastName()));
    }
    public void testAge() {
        int age;

        // testing normal age
        age = 45;
        thePerson.setAge(age);
        assertEquals(45, thePerson.getAge());

        //testing zero age
        age = 0;
        thePerson.setAge(age);
        assertEquals(0, thePerson.getAge());

        //testing negative age
        age = -5;
        thePerson.setAge(age);
        assertEquals(-5, thePerson.getAge());


        //testing characters as age

    }
    public void testSchoolName(){
        String school = "RTU";
        thePerson.setSchoolName(school);
        assertEquals(school,thePerson.getSchoolName());

    }
    public void testIntroduce() throws SetNameCustomException {
        String line;
        thePerson.setFirstName("John");
        thePerson.setLastName("Doe");
        thePerson.setSchoolName("RTU");
        line = "My name is John Doe and I study in university RTU";
        assertEquals(line,(thePerson.introduce()));
    }

    public void testThrowException(){

        try {
            thePerson.setFirstName("J0hn"); //checking the wrong name (with digits)
            thePerson.setLastName("D0e"); //checking the wrong name (with digits)
//            thePerson.setAge("45"); //testing characters as age
//            thePerson.setAge("abc"); //testing characters as age

            new Person();

        }
        catch (SetNameCustomException sn){
            fail();
        }
        catch (Exception e) {
            fail();
        }

        catch (Error e) {
            fail();
        }
    }
}
