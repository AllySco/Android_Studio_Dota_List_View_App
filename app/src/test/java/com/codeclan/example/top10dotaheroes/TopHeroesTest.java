package com.codeclan.example.top10dotaheroes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class TopHeroesTest {

    @Test
    public void getListTest() {
        TopHeroes topHeroes = new TopHeroes();
        assertEquals(10, topHeroes.getList().size());
    }

}