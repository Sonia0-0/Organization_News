//package models;
//
//import junit.framework.TestCase;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class DepartmentsTest {
//    @Test
//    public void testDepartments_getCorrectName_String() {
//        Departments departments = new Departments("Sports","sports department", 8);
//        assertEquals("Sports", departments.getName());
//    }
//
//    @Test
//    public void testDepartments_getCorrectDescription_String() {
//        Departments departments = new Departments("Sports", "sports department", 8);
//        assertEquals("sports department", departments.getDescription());
//    }
//
//    @Test
//    public void testDepartments_getCorrectNumberOfEmployees_Int() {
//        Departments departments = new Departments("Sports", "sports department", 8);
//        assertEquals(8, departments.getNumOfEmployees());
//    }
//
//    @Test
//    public void testDepartments_UpdatesName_String(){
//        Departments departments = new Departments("Sports", "sports department", 8);
//        departments.setName("ICT");
//        assertEquals("ICT", departments.getName());
//    }
//
//    @Test
//    public void testDepartments_UpdatesDescription_String(){
//        Departments departments = new Departments("Sports", "sports department", 8);
//        departments.setDescription("Sports affairs");
//        assertEquals("Sport affairs", departments.getDescription());
//    }
//
//    @Test
//    public void testDepartments_UpdatesNumberOfEmployees_Int(){
//        Departments departments = new Departments("Sports", "sports department", 8);
//        departments.setNumOfEmployees(8);
//        assertEquals(8, departments.getNumOfEmployees());
//    }
//
//
//}