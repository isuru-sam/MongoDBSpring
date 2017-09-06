package com.testmongo;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="users")
public class Users {
    private String id;
    private String firstName;
    private String lastName;

    public Users() {
    }
        public Users(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
     /**
     * @return the id
     */
    public String getId() {
    return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
    this.id = id;
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
   
    }
