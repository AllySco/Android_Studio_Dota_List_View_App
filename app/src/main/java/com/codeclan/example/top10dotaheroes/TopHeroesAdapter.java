package com.codeclan.example.top10dotaheroes;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;
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

        ImageView image = (ImageView) listItemView.findViewById(R.id.hero_icon);
        String nameIcon = currentHero.getName().toLowerCase();

        try {
            Class res = R.drawable.class;
            Field field = res.getField(nameIcon);
            int drawableId = field.getInt(null);
            image.setImageResource(drawableId);

        }
        catch (Exception e) {
            Log.e("MyTag", "Failure to get drawable id.", e);
        }



        listItemView.setTag(currentHero);

        return listItemView;
    }
}
