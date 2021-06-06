package sef.FinalActivity;

import junit.framework.TestCase;

public class TestEmployee extends TestCase {
    private Employee thePerson;
    protected void setUp() throws Exception {
        super.setUp();
        thePerson = new Employee();
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

        //checking the wrong name (with digits)
//        firstName = "J0hn";
//        thePerson.setFirstName(firstName);
//        assertEquals("John",(thePerson.getFirstName()));

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
    public void testSalary() {
        int salary;

        //test normal salary
        salary = 1000;
        thePerson.setSalary(salary);
        assertEquals(salary, thePerson.getSalary());

        //test zero salary
        salary = 0;
        thePerson.setSalary(salary);
        assertEquals(salary, thePerson.getSalary());

        //test negative salary
        salary = -1000;
        thePerson.setSalary(salary);
        assertEquals(salary, thePerson.getSalary());
    }
    public void testTitle(){
        String title;

        //test normal title
        title = "Manager";
        thePerson.setTitle(title);
        assertEquals(title, thePerson.getTitle());

        //test empty title
        title = "";
        thePerson.setTitle(title);
        assertEquals(title, thePerson.getTitle());

        //test title with spaces
        title = "TOP VIP";
        thePerson.setTitle(title);
        assertEquals(title, thePerson.getTitle());

        //test space title
        title = "     ";
        thePerson.setTitle(title);
        assertEquals(title, thePerson.getTitle());
    }
    public void testCompany(){
        String company;

        // test normal company
        company = "ABC";
        thePerson.setCompany(company);
        assertEquals(company, (thePerson.getCompany()));

//        //test empty company
//        company = "";
//        thePerson.setTitle(company);
//        assertEquals(company, thePerson.getCompany());

        //test company wish space
        company = "Google Inc";
        thePerson.setTitle(company);
        assertEquals(company, thePerson.getCompany());

        //test company wish all spaces
        company = "      ";
        thePerson.setTitle(company);
        assertEquals(company, thePerson.getCompany());
    }
    public void testId(){
        String id;

        //test for normal id
        id = "AA";
        thePerson.setId(id);
        assertEquals(id,thePerson.getId());

        //test for empty id
        id = "";
        thePerson.setId(id);
        assertEquals(id,thePerson.getId());

        //test for space id
        id = " ";
        thePerson.setId(id);
        assertEquals(id,thePerson.getId());

        //test for id with spases
        id = "A A";
        thePerson.setId(id);
        assertEquals(id,thePerson.getId());

    }

    public void testIntroduce() throws SetNameCustomException {
        String introduce = "My name is John Doe and I am 45 years old. I work as a Not specified in Not specified";;
        thePerson.setFirstName("John");
        thePerson.setLastName("Doe");
        thePerson.setAge(45);
//
        assertEquals(introduce, thePerson.introduce());
        //assertEquals(introduce,thePerson.introduce());
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


