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

public class EasyGameActivity extends AppCompatActivity implements View.OnClickListener {
  private TextView colorRedText, colorGreenText, colorBlueText, firstTextView, secondTextView, thirdTextView, fourthTextView;
  private ImageView firstImage, secondImage, thirdImage, fourthImage;
  private CardView firstCardView, secondCardView, thirdCardView, fourthCardView;
  private RelativeLayout firstRelativeLayout, secondRelativeLayout, thirdRelativeLayout, fourthRelativeLayout;
  private Button restartGame, selectLevel;
  private int selectedCardView;
  private boolean won;
  private String correctOption;
  private String selectedOption;
  private int red, green, blue;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_easy_game);
    initUI();
    setGuessColors();
  }

  private void initUI(){
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
    selectLevel = findViewById(R.id.easySelectLevel);
    firstCardView.setOnClickListener(this);
    secondCardView.setOnClickListener(this);
    thirdCardView.setOnClickListener(this);
    fourthCardView.setOnClickListener(this);
    restartGame.setOnClickListener(this);
    selectLevel.setOnClickListener(this);
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
          disableAllTextViews();
        }else {
          firstImage.setImageResource(R.drawable.ic_clear);
          firstTextView.setText("INCORRECT");
          firstTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;
      case R.id.secondCardView:
        selectedOption = "secondCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          secondImage.setImageResource(R.drawable.ic_check_black_24dp);
          secondTextView.setText("CORRECT");
          secondTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          secondImage.setImageResource(R.drawable.ic_clear);
          secondTextView.setText("INCORRECT");
          secondTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;
      case R.id.thirdCardView:
        selectedOption = "thirdCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          thirdImage.setImageResource(R.drawable.ic_check_black_24dp);
          thirdTextView.setText("CORRECT");
          thirdTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          thirdImage.setImageResource(R.drawable.ic_clear);
          thirdTextView.setText("INCORRECT");
          thirdTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;
      case R.id.fourthCardView:
        selectedOption = "fourthCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          fourthImage.setImageResource(R.drawable.ic_check_black_24dp);
          fourthTextView.setText("CORRECT");
          fourthTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          fourthImage.setImageResource(R.drawable.ic_clear);
          fourthTextView.setText("INCORRECT");
          fourthTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;

      case R.id.easyRestart:
        recreate();
        break;

      case R.id.easySelectLevel:
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }
  }

  private void disableAllTextViews(){
    firstCardView.setEnabled(false);
    secondCardView.setEnabled(false);
    thirdCardView.setEnabled(false);
    fourthCardView.setEnabled(false);
  }
}
