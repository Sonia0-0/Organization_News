//package models;
//
//import junit.framework.TestCase;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class NewsTest  {
//    @Test
//    public void testNews_getTitle_String(){
//        News news = new News("Group Work","group work", 7);
//        assertEquals("Group Work",news.getTitle());
//    }
//
//    @Test
//    public void testNews_getContent_String(){
//        News news = new News("Group Work","group work", 7);
//        assertEquals("group work",news.getContent());
//    }
//
//    @Test
//    public void testNews_getDepartmentId_Int(){
//        News news = new News("Group Work","group work", 7);
//        assertEquals(7,news.getId());
//    }
//
//    @Test
//    public void setNewTitle_String(){
//        News news = new News("Group Work","group work", 7);
//        news.setTitle("Nihilism");
//        assertEquals("Nihilism", news.getTitle());
//    }
//
//    @Test
//    public void setNewContent_String(){
//        News news = new News("Group Work","group work", 7);
//        news.setContent("Nihilism");
//        assertEquals("philosophy", news.getContent());
//    }
//
//    @Test
//    public void setNewId_Int(){
//        News news = new News("Group Work","group work", 7);
//        news.setId(7);
//        assertEquals(7, news.getId());
//    }
//
//    @Test
//    public void setNewDepartmentId_Int(){
//        News news = new News("Group Work","group work", 7);
//        news.setDepartmentId(7);
//        assertEquals(7, news.getDepartmentId());
//    }
//
//
//
//
//
//
//    }