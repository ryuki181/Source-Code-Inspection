/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ryuki.ticketmachine.test;

import br.calebe.ticketmachine.core.TicketMachine;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class TicketMachineTest {
    
    @Test
    public void testInserirPapelMoeda() throws Exception{
        TicketMachine tm = new TicketMachine(10);
        tm.inserir(20);
        Assert.assertEquals(20, tm.getSaldo());
        tm.imprimir();
        Assert.assertEquals(10, tm.getSaldo());
        
    }
    
}
