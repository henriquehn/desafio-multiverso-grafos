/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiografos.grafos.Comparadores;

import desafiografos.grafos.Caminho;
import java.util.Comparator;

/**
 *
 * @author Henrique
 */
public class ComparadorDeParadas implements Comparator<Caminho>
{
    @Override
    public int compare(Caminho o1, Caminho o2)
    {
        int result = o1.getParadas()- o2.getParadas();
        return result==0 ? 0 : result / Math.abs(result);
    }

}
