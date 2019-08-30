/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.jsf.resourcelibrarycontracts.namedbeans;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author ext_lesters
 */
@Named
@RequestScoped
public class ThemeSelector {
    private String themeName="dark";
    
    public String getThemeName() {
        return themeName;
    }
    
    public void setThemeName(String themeName){
        this.themeName = themeName;
    }
            
    
}
