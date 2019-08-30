/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teriolabs.jsf.namedBeans;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**
 *
 * @author ext_lesters
 */

@Named
@RequestScoped
public class RegistrationBean {
    private String salutation;    
    private String firstName;    
    private String lastName;    
    private Integer age;    
    private String email;

    public RegistrationBean() {

    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
