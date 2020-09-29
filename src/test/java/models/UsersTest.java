//package models;
//
//import junit.framework.TestCase;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class UsersTest {
//    @Test
//    public void testEquals_ReturnBothInstancesTrue() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        Users users1 = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        assertEquals(users, users1);
//    }
//
//    @Test
//    public void getName_savesNameCorrectly() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        assertEquals("Nihilist", users.getName());
//    }
//
//    @Test
//    public void setName_changesNameSuccessfully() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        users.setName("Deeeez Nuts");
//        assertEquals("Deeeez Nuts", users.getName());
//    }
//
//    @Test
//    public void getPosition_returnsPositionCorrectly() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        assertEquals("Junior Dev", users.getPosition());
//    }
//
//    @Test
//    public void setPosition_changesPosition() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        users.setPosition("Senior Dev");
//        assertEquals("Senior Dev", users.getPosition());
//    }
//
//    @Test
//    public void getRole_returnsRoleSuccessfully() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        assertEquals("Back end Developer", users.getRole());
//    }
//
//    @Test
//    public void setRole_changesRoleSuccessfully() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        users.setRole("Dev Ops");
//        assertEquals("Dev Ops", users.getRole());
//    }
//
//    @Test
//    public void getDepartmentId_returnsDepartmentId() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        assertEquals(1, users.getDepartmentId());
//    }
//
//    @Test
//    public void setDepartmentId_changesDepartmentID() {
//        Users users = new Users("Nihilist","Junior Dev","Back end Developer",1);
//        users.setDepartmentId(2);
//        assertEquals(2, users.getDepartmentId());
//    }
//}
//
//
//
//
