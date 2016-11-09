/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbds.taskM.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author michel
 */
@Entity
public class Person implements Serializable {

    @OneToMany(mappedBy = "person")
    private List<Task> tasks = new ArrayList<>();
    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mbds.taskM.entities.Person[ id=" + id + " username " + this.username+ " email" +this.email+
        " phoneNumber " +this.phoneNumber +" ]";
    }

    public List<Task> getTasks() {
        return tasks;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person() {
    }
    
    /**
     * add the task to person
     * @param task
     * @return true if add the task or false not
     */
    public boolean addTask(Task task)
    {
        
        if(task==null)
            return false;
            
        if(this.tasks.contains(task))
        {
           this.tasks.remove(task);
        }
        return this.tasks.add(task);
    }
    
    /**
     * 
     * @param task the task to remove
     * @return true if remove the task or false not
     */
    public boolean removeTadk(Task task)
    {
        return task!=null?this.tasks.remove(task):false;
    }
}
