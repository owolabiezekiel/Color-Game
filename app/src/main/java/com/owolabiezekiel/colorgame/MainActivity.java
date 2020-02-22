package com.owolabiezekiel.colorgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  private Button easyGameButton;
  private Button hardGameButton;
  private String gameDifficulty = "";
  private Button startGame;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setupUI();
  }

  private void setupUI(){
    easyGameButton = findViewById(R.id.easy_game_button);
    hardGameButton = findViewById(R.id.hard_game_button);
    startGame = findViewById(R.id.start_game);
    easyGameButton.setOnClickListener(this);
    hardGameButton.setOnClickListener(this);
    startGame.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()){
      case R.id.easy_game_button:
        if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN) {
          view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_selected));
          gameDifficulty = "easy";
          ((Button)view).setTextColor(Color.parseColor("#008000"));
          hardGameButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.round_button_layout));
          hardGameButton.setTextColor(Color.parseColor("#ffffff"));
        } else {
          view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_selected));
          gameDifficulty = "easy";
          ((Button)view).setTextColor(Color.parseColor("#008000"));
          hardGameButton.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.round_button_layout));
          hardGameButton.setTextColor(Color.parseColor("#ffffff"));
        }
        return;

      case R.id.hard_game_button:
        if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN) {
          view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_selected));
          gameDifficulty = "hard";
          ((Button)view).setTextColor(Color.parseColor("#008000"));
          easyGameButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.round_button_layout));
          easyGameButton.setTextColor(Color.parseColor("#ffffff"));
        } else {
          view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_selected));
          gameDifficulty = "hard";
          ((Button)view).setTextColor(Color.parseColor("#008000"));
          easyGameButton.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.round_button_layout));
          easyGameButton.setTextColor(Color.parseColor("#ffffff"));
        }
        return;

      case R.id.start_game:
        if(gameDifficulty.equalsIgnoreCase("easy")){
          startActivity(new Intent(getApplicationContext(), EasyGameActivity.class));
          return;
        }else if(gameDifficulty.equalsIgnoreCase("hard")){
          startActivity(new Intent(getApplicationContext(), HardGameActivity.class));
          return;
        }else{
          Toast.makeText(getApplicationContext(), "Please select a level to proceed", Toast.LENGTH_LONG).show();
          return;
        }

    }
  }
}
