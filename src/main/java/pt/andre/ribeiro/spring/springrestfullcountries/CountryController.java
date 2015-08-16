/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.andre.ribeiro.spring.springrestfullcountries;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AndreRibeiro
 */
@RestController
public class CountryController {

    /**
     *
     * @param code
     * @return
     */
    @RequestMapping(value = {"/countries/{code}","/countries"})
    public Country country(
            @PathVariable("code")
            @RequestParam(value="code", defaultValue="PT") 
            String code
    ) {

        if (App.LOCALE_LIST.get(code).getName() == null) {
            code = "PT";
        }
        return App.LOCALE_LIST.get(code);
    }

    /**
     *
     * @param code
     * @return
     */
    @RequestMapping("/countries/all")
    public List<Country> country() {
        List<Country> returnValue = new ArrayList<Country>();
        for (Map.Entry<String, Country> entry : App.LOCALE_LIST.entrySet()) {

            returnValue.add(entry.getValue());

        }
        return returnValue;

    }
}
