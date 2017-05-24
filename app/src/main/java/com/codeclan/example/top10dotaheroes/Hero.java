package com.codeclan.example.top10dotaheroes;

/**
 * Created by user on 24/05/2017.
 */

public class Hero {

        private int ranking;
        private String name;
        private String mainStat;
        private String role;

        public Hero(Integer ranking, String name, String mainStat, String role) {
            this.ranking = ranking;
            this.name = name;
            this.mainStat = mainStat;
            this.role = role;
        }

        public Integer getRanking() {
            return ranking;
        }

        public String getName() {
            return name;
        }

        public String getMainStat() {
            return mainStat;
        }

        public String getRole() {
            return role;
        }
}
