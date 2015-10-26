package org.team3309.vexscout;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TheMkrage on 10/5/2015.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.SubViewHolder>{
    List<Team> list;
    public CardAdapter(List<Team> list) {
        this.list = list;
    }

    public class SubViewHolder extends RecyclerView.ViewHolder implements View
            .OnClickListener {
        CardView cardView;
        TextView record, highScore, events;

        SubViewHolder(View view) {
            super(view);
            Log.d("TEAG", "HELLO");
            cardView = (CardView) view.findViewById(R.id.card_view);
            record = (TextView) view.findViewById(R.id.record);
            highScore = (TextView) view.findViewById(R.id.highScore);
            events = (TextView) view.findViewById(R.id.events);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            String title = ((TextView) cardView.findViewById(R.id.cardTitle)).getText().toString();
            Log.d("TEAG", title);
        }
    }

    @Override
    public CardAdapter.SubViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_team_card_view, viewGroup, false);
        return new SubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardAdapter.SubViewHolder subViewHolder, int i) {
        subViewHolder.record.setText(list.get(i).name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
