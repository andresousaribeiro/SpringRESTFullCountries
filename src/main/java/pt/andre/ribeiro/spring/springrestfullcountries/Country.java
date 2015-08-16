/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.andre.ribeiro.spring.springrestfullcountries;

/**
 *
 * @author AndreRibeiro
 */
public class Country {
    
    String name;
    String code;

    public Country() {
    }

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }
    
    
    
    
    
}
