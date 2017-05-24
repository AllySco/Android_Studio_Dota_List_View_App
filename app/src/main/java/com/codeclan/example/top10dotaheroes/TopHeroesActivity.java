package com.codeclan.example.top10dotaheroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopHeroesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heroes_list);

        TopHeroes topHeroes = new TopHeroes();
        ArrayList<Hero> list = topHeroes.getList();
        TopHeroesAdapter heroesAdapter = new TopHeroesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(heroesAdapter);
    }

    public void getHeroOnClick(View listItem) {
        Hero hero = (Hero) listItem.getTag();
        Log.d("Hero Name: ", hero.getName());

    }
}
