package com.owolabiezekiel.colorgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class EasyGameActivity extends AppCompatActivity implements View.OnClickListener {
  private TextView colorRedText, colorGreenText, colorBlueText, firstTextView, secondTextView, thirdTextView, fourthTextView, playerOneScore, playerTwoScore;
  private ImageView firstImage, secondImage, thirdImage, fourthImage;
  private CardView firstCardView, secondCardView, thirdCardView, fourthCardView;
  private RelativeLayout firstRelativeLayout, secondRelativeLayout, thirdRelativeLayout, fourthRelativeLayout;
  private Button restartGame, selectLevel, resetGame;
  private int selectedCardView;
  private int playerTurn = 1;
  private String correctOption;
  private String selectedOption;
  private int red, green, blue;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_easy_game);
    initUI();
    setGuessColors();
    Toast.makeText(getApplicationContext(), "Player " + playerOneScore.getText().toString() + " turn", Toast.LENGTH_SHORT).show();
    Toast.makeText(getApplicationContext(), "Player " + playerTurn + " turn", Toast.LENGTH_SHORT).show();
  }

  private void initUI(){
    playerOneScore = findViewById(R.id.easyPlayerOneScore);
    playerTwoScore = findViewById(R.id.easyPlayerTwoScore);
    colorRedText = findViewById(R.id.colorRedText);
    colorGreenText = findViewById(R.id.colorGreenText);
    colorBlueText = findViewById(R.id.colorBlueText);
    firstTextView = findViewById(R.id.firstTextView);
    secondTextView = findViewById(R.id.secondTextView);
    thirdTextView = findViewById(R.id.thirdTextView);
    fourthTextView = findViewById(R.id.fourthTextView);
    firstCardView = findViewById(R.id.firstCardView);
    secondCardView = findViewById(R.id.secondCardView);
    thirdCardView = findViewById(R.id.thirdCardView);
    fourthCardView = findViewById(R.id.fourthCardView);
    firstRelativeLayout = findViewById(R.id.firstRelativeView);
    secondRelativeLayout = findViewById(R.id.secondRelativeView);
    thirdRelativeLayout = findViewById(R.id.thirdRelativeView);
    fourthRelativeLayout = findViewById(R.id.fourthRelativeView);
    firstImage = findViewById(R.id.firstImage);
    secondImage = findViewById(R.id.secondImage);
    thirdImage = findViewById(R.id.thirdImage);
    fourthImage = findViewById(R.id.fourthImage);
    restartGame = findViewById(R.id.easyRestart);
    resetGame = findViewById(R.id.easyReset);
    selectLevel = findViewById(R.id.easySelectLevel);
    firstCardView.setOnClickListener(this);
    secondCardView.setOnClickListener(this);
    thirdCardView.setOnClickListener(this);
    fourthCardView.setOnClickListener(this);
    restartGame.setOnClickListener(this);
    selectLevel.setOnClickListener(this);
    resetGame.setOnClickListener(this);
  }

  private void setGuessColors(){
    red = (int)(Math.random()*((255 - 0) + 1)) + 0;
    green = (int)(Math.random()*((255 - 0) + 1)) + 0;
    blue = (int)(Math.random()*((255 - 0) + 1)) + 0;
    colorRedText.setText(String.valueOf(red));
    colorGreenText.setText(String.valueOf(green));
    colorBlueText.setText(String.valueOf(blue));

    setCorrectCardView();
  }

  private void setCorrectCardView(){
    selectedCardView = (int)(Math.random()*((4 - 1) + 1)) + 1;
    System.out.println("-----------------------------------"+selectedCardView + red + green + blue);
    switch (selectedCardView){
      case 1:
        correctOption = "firstCardView";
        firstCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        firstRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        secondRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        thirdCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        thirdRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        fourthCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        fourthRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        break;
      case 2:
        correctOption = "secondCardView";
        secondCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        secondRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        firstCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        firstRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        thirdCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        thirdRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        fourthCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        fourthRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        break;
      case 3:
        correctOption = "thirdCardView";
        thirdCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        thirdRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        secondRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        firstCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        firstRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        fourthCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        fourthRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        break;
      case 4:
        correctOption = "fourthCardView";
        fourthCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        fourthRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        secondRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        thirdCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        thirdRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        firstCardView.setCardBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        firstRelativeLayout.setBackgroundColor(Color.rgb((int)(Math.random()*((255 - 1) + 1)) + 1, (int)(Math.random()*((255 - 0) + 1)) + 0, (int)(Math.random()*((255 - 0) + 1)) + 0));
        break;
    }
  }


  @Override
  public void onClick(View view) {
    switch(view.getId()){
      case R.id.firstCardView:
        selectedOption = "firstCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          firstImage.setImageResource(R.drawable.ic_check_black_24dp);
          firstTextView.setText("CORRECT");
          firstTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllCardViews();
          if(playerTurn == 1){
            int score = Integer.valueOf(playerOneScore.getText().toString());
            score = score + 1;
            playerOneScore.setText(String.valueOf(score));
            return;
          }
          if(playerTurn == 2){
            int score = Integer.valueOf(playerTwoScore.getText().toString());
            score = score + 1;
            playerTwoScore.setText(String.valueOf(score));
            return;
          }

        }else {
          firstImage.setImageResource(R.drawable.ic_clear);
          firstTextView.setText("INCORRECT");
          firstTextView.setTextColor(getResources().getColor(R.color.red));
          disableAllCardViews();
        }
        break;
      case R.id.secondCardView:
        selectedOption = "secondCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          secondImage.setImageResource(R.drawable.ic_check_black_24dp);
          secondTextView.setText("CORRECT");
          secondTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllCardViews();
          if(playerTurn == 1){
            int score = Integer.valueOf(playerOneScore.getText().toString());
            score = score + 1;
            playerOneScore.setText(String.valueOf(score));
            return;
          }
          if(playerTurn == 2){
            int score = Integer.valueOf(playerTwoScore.getText().toString());
            score = score + 1;
            playerTwoScore.setText(String.valueOf(score));
            return;
          }
        }else {
          secondImage.setImageResource(R.drawable.ic_clear);
          secondTextView.setText("INCORRECT");
          secondTextView.setTextColor(getResources().getColor(R.color.red));
          disableAllCardViews();
        }
        break;
      case R.id.thirdCardView:
        selectedOption = "thirdCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          thirdImage.setImageResource(R.drawable.ic_check_black_24dp);
          thirdTextView.setText("CORRECT");
          thirdTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllCardViews();
          if(playerTurn == 1){
            int score = Integer.valueOf(playerOneScore.getText().toString());
            score = score + 1;
            playerOneScore.setText(String.valueOf(score));
            return;
          }
          if(playerTurn == 2){
            int score = Integer.valueOf(playerTwoScore.getText().toString());
            score = score + 1;
            playerTwoScore.setText(String.valueOf(score));
            return;
          }
        }else {
          thirdImage.setImageResource(R.drawable.ic_clear);
          thirdTextView.setText("INCORRECT");
          thirdTextView.setTextColor(getResources().getColor(R.color.red));
          disableAllCardViews();
        }
        break;
      case R.id.fourthCardView:
        selectedOption = "fourthCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          fourthImage.setImageResource(R.drawable.ic_check_black_24dp);
          fourthTextView.setText("CORRECT");
          fourthTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllCardViews();
          if(playerTurn == 1){
            int score = Integer.valueOf(playerOneScore.getText().toString());
            score = score + 1;
            playerOneScore.setText(String.valueOf(score));
            return;
          }
          if(playerTurn == 2){
            int score = Integer.valueOf(playerTwoScore.getText().toString());
            score = score + 1;
            playerTwoScore.setText(String.valueOf(score));
            return;
          }
        }else {
          fourthImage.setImageResource(R.drawable.ic_clear);
          fourthTextView.setText("INCORRECT");
          fourthTextView.setTextColor(getResources().getColor(R.color.red));
          disableAllCardViews();
        }
        break;

      case R.id.easyReset:
        recreate();
        break;

      case R.id.easySelectLevel:
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();

      case R.id.easyRestart:
        setGuessColors();
        enableAllCardViews();
        clearTextAndImages();
        if(playerTurn == 1){
          playerTurn = 2;
          Toast.makeText(getApplicationContext(), "Player " + playerTurn + " turn", Toast.LENGTH_LONG).show();
          return;
        }
        if(playerTurn == 2){
          playerTurn = 1;
          Toast.makeText(getApplicationContext(), "Player " + playerTurn + " turn", Toast.LENGTH_LONG).show();
          return;
        }
    }
  }

  private void disableAllCardViews(){
    firstCardView.setEnabled(false);
    secondCardView.setEnabled(false);
    thirdCardView.setEnabled(false);
    fourthCardView.setEnabled(false);
  }

  private void enableAllCardViews(){
    firstCardView.setEnabled(true);
    secondCardView.setEnabled(true);
    thirdCardView.setEnabled(true);
    fourthCardView.setEnabled(true);
  }

  private void clearTextAndImages(){
    firstTextView.setText("");
    secondTextView.setText("");
    thirdTextView.setText("");
    fourthTextView.setText("");
    firstImage.setImageDrawable(null);
    secondImage.setImageDrawable(null);
    thirdImage.setImageDrawable(null);
    fourthImage.setImageDrawable(null);
  }
}
