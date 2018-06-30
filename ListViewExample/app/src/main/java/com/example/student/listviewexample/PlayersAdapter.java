package com.example.student.listviewexample;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PlayersAdapter extends ArrayAdapter<Player> {
    private Context context;
    private List<Player> list;
    private int layoutId;

    public PlayersAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Player> list) {
        super(context, resource, list);
        this.context = context;
        this.list = list;
        layoutId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listIteam = convertView;
        if (listIteam == null) {
            listIteam = LayoutInflater.from(context).inflate(layoutId, parent, false);
        }
        final Player player = (Player) list.get(position);
        ImageView imageView = (ImageView) listIteam.findViewById(R.id.player_image);
        TextView playerclube = (TextView) listIteam.findViewById(R.id.clube);
        playerclube.setText(player.getClubname());
        Picasso.with(context).load(player.getImageUrl()).into(imageView);
        return listIteam;
    }
}
