/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ryuki.ticketmachine.test;

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31512585
 */
public class PapelMoedaTest {

    public PapelMoedaTest() {
    }

    @Test
    public void testGetValorEQuantidade() {
        PapelMoeda pm = new PapelMoeda(10, 2);
        Assert.assertEquals(10, pm.getValor());
        Assert.assertEquals(2, pm.getQuantidade());
    }
    
    
}
