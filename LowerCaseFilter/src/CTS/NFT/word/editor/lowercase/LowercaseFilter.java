/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTS.NFT.word.editor.lowercase;

import org.openide.util.lookup.ServiceProvider;
import CTS.NFT.word.editor.api.WordFilter;
/**
 *
 * @author 397832
 */
@ServiceProvider(service=WordFilter.class)
public class LowercaseFilter implements WordFilter {
    
    @Override
    public String process(String g){
        return g.toLowerCase();
    }
}
