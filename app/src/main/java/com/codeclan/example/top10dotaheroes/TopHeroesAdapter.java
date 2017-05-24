package com.codeclan.example.top10dotaheroes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopHeroesAdapter extends ArrayAdapter<Hero> {

    public TopHeroesAdapter(Context context, ArrayList<Hero> heroes) {
        super(context, 0, heroes);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.heroes_item, parent, false);
        }

        Hero currentHero = getItem(position);
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentHero.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentHero.getName());

        TextView mainStat = (TextView) listItemView.findViewById(R.id.mainStat);
        mainStat.setText(currentHero.getMainStat());

        TextView role = (TextView) listItemView.findViewById(R.id.role);
        role.setText(currentHero.getRole());

        listItemView.setTag(currentHero);

        return listItemView;
    }
}
