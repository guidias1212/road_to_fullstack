package com.dbexample;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
   /** 
      * This is the method to be used to initialize
      * database resources ie. connection.
   */
   public void setDataSource(DataSource ds);
   
   /** 
      * This is the method to be used to create
      * a record in the Student table.
   */
   public void create(String name, Integer age);
   
   /** 
      * This is the method to be used to list down
      * a record from the Student table corresponding
      * to a passed student id.
   */
   public Student getStudent(Integer id);
   
   /** 
      * This is the method to be used to list down
      * all the records from the Student table.
   */
   public List<Student> listStudents();
   
   /** 
      * This is the method to be used to delete
      * a record from the Student table corresponding
      * to a passed student id.
   */
   public void delete(Integer id);
   
   /** 
      * This is the method to be used to update
      * a record into the Student table.
   */
   public void update(Integer id, Integer age);
}
