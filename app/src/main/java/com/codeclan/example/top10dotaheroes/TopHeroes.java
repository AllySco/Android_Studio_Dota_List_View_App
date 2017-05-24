package com.codeclan.example.top10dotaheroes;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopHeroes {
        private ArrayList<Hero> list;

        public TopHeroes() {
            list = new ArrayList<Hero>();
            list.add(new Hero(1, "Invoker", "Intelligence", "Carry"));
            list.add(new Hero(2, "Terror Blade", "Agility", "Carry"));
            list.add(new Hero(3, "Disruptor", "Intelligence", "Support"));
            list.add(new Hero(4, "Zeus", "Intelligence", "Nuker"));
            list.add(new Hero(5, "Ursa", "Agility", "Jungler"));
            list.add(new Hero(6, "Pudge", "Strength", "Ganker"));
            list.add(new Hero(7, "Tide Hunter", "Strength", "Initiator"));
            list.add(new Hero(8, "Phantom Assassin", "Agility", "Carry"));
            list.add(new Hero(9, "Razor", "Agility", "Pusher"));
            list.add(new Hero(10, "Earth Spirit", "Strength", "Disabler"));

        }

        public ArrayList<Hero> getList() {
            return new ArrayList<Hero>(list);
        }

    }

