/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbds.taskM.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author michel
 */
@Entity
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String  taskName;
    private Date taskDateBegin;
    private Date taskDateEnd;
    private String status;
    private String taskDescription;

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @ManyToOne
    private Person person;
    public int getId() {
        return id;
    }

    public Task() {
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
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "mbds.taskM.entities.Task[ id=" + id + " taskName "+this.taskName +
                " date begin " +this.taskDateBegin+" date end " + this.taskDateEnd+" ]";
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getTaskDateBegin() {
        return taskDateBegin;
    }

    public void setTaskDateBegin(Date taskDateBegin) {
        this.taskDateBegin = taskDateBegin;
    }

    public Date getTaskDateEnd() {
        return taskDateEnd;
    }

    public void setTaskDateEnd(Date taskDateEnd) {
        this.taskDateEnd = taskDateEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
