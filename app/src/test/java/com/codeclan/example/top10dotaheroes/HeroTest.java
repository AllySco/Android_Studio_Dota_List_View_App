package com.codeclan.example.top10dotaheroes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class HeroTest {

    Hero hero;

    @Before
    public void before() {
        hero = new Hero(1, "Puck", "Intelligence", "Initiator");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, hero.getRanking());
    }

    @Test
    public void getNameTest() {
        assertEquals("Puck", hero.getName());
    }

    @Test
    public void getMainStatTest() {
        assertEquals("Intelligence", hero.getMainStat());
    }

    @Test
    public void getRoleTest() {
        assertEquals("Initiator", hero.getRole());
    }

}