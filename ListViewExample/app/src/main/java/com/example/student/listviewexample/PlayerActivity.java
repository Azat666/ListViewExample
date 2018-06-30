package com.example.student.listviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ArrayList<Player> players = new ArrayList<>();
        Player player = new Player();
        player.setName("Lionel Messi");
        player.getClubname();
        player.setImageUrl(" https://image.freepik.com/free-vector/lionel-messi-with-argentina-flag_72147493996.jpg");
        Player player1 = new Player();
        player1.setName("mohamed Salah");
        player1.getClubname();
        player1.setImageUrl(" http://e1.365dm.com/17/08/800x600/skysports-premier-league-football-mohamed-salah-liverpool_4071859.jpg?20170812142748");
        Player player2 = new Player();
        player2.setName("Inesta");
        player2.getClubname();
        player2.setImageUrl("https://i.pinimg.com/originals/6f/8d/d0/6f8dd0d8fe83d305a8040f662782afd1.jpg");
        Player player3 = new Player();
        player3.setName("Ter shtegen");
        player3.getClubname();
        player3.setImageUrl(" http://www.weloba.com/sites/default/files/styles/player_detail/public/images/general/ter-stegen_2.jpg?itok=ABCuxUqx");
        Player player4 = new Player();
        player4.setName("Coutinio");
        player4.getClubname();
        player4.setImageUrl(" https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Philippe_Coutinho_850_1692.jpg/220px-20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Philippe_Coutinho_850_1692.jpg");

        players.add(player);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        final PlayersAdapter playersAdapter = new PlayersAdapter(this,R.layout.player_iteam_view,players);
        final ListView listView  = (ListView) findViewById(R.id.postsList);
        listView.setAdapter(playersAdapter);
    }

}
