package pt.andre.ribeiro.spring.springrestfullcountries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static LinkedHashMap<String,Country>  LOCALE_LIST = new LinkedHashMap<String,Country>();
    public static void main( String[] args )
    {
         Locale [] locales = Locale.getAvailableLocales();
         for (Locale locale : locales) {
            LOCALE_LIST.put(locale.getCountry(),new Country(locale.getDisplayCountry(locale), locale.getCountry()));
        }
         SpringApplication.run(App.class, args);
    }
}
