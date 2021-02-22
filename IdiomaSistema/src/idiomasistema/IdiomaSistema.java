/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.*;
        
/**
 *
 * @author Marcos
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Seu sistema está em ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println(idioma.getLanguage());
        System.out.println(idioma.getDisplayCountry());
    }
    
}
