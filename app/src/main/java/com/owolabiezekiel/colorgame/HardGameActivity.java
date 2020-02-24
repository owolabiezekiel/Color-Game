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

public class HardGameActivity extends AppCompatActivity implements View.OnClickListener{
  private TextView colorRedText, colorGreenText, colorBlueText, firstTextView, secondTextView, thirdTextView, fourthTextView, fifthTextView, sixthTextView, seventhTextView, eighthTextView, ninthTextView;
  private ImageView firstImage, secondImage, thirdImage, fourthImage, fifthImage, sixthImage, seventhImage, eighthImage, ninthImage;
  private CardView firstCardView, secondCardView, thirdCardView, fourthCardView, fifthCardView, sixthCardView, seventhCardView, eighthCardView, ninthCardView;
  private RelativeLayout firstRelativeLayout, secondRelativeLayout, thirdRelativeLayout, fourthRelativeLayout, fifthRelativeLayout, sixthRelativeLayout, seventhRelativeLayout, eighthRelativeLayout, ninthRelativeLayout;
  private Button restartGame, selectLevel;
  private int selectedCardView;
  private boolean won;
  private String correctOption;
  private String selectedOption;
  private int red, green, blue;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_hard_game);

    initUI();
    setGuessColors();
  }

  private void initUI(){
    //the three color text views
    colorRedText = findViewById(R.id.colorRedTextHard);
    colorGreenText = findViewById(R.id.colorGreenTextHard);
    colorBlueText = findViewById(R.id.colorBlueTextHard);

    //the text views in the card layouts
    firstTextView = findViewById(R.id.firstTextViewHard);
    secondTextView = findViewById(R.id.secondTextViewHard);
    thirdTextView = findViewById(R.id.thirdTextViewHard);
    fourthTextView = findViewById(R.id.fourthTextViewHard);
    fifthTextView = findViewById(R.id.fifthTextViewHard);
    sixthTextView = findViewById(R.id.sixthTextViewHard);
    seventhTextView = findViewById(R.id.seventhTextViewHard);
    eighthTextView = findViewById(R.id.eighthTextViewHard);
    ninthTextView = findViewById(R.id.ninthTextViewHard);

    //the card views
    firstCardView = findViewById(R.id.firstCardViewHard);
    secondCardView = findViewById(R.id.secondCardViewHard);
    thirdCardView = findViewById(R.id.thirdCardViewHard);
    fourthCardView = findViewById(R.id.fourthCardViewHard);
    fifthCardView = findViewById(R.id.fifthCardViewHard);
    sixthCardView = findViewById(R.id.sixthCardViewHard);
    seventhCardView = findViewById(R.id.seventhCardViewHard);
    eighthCardView = findViewById(R.id.eighthCardViewHard);
    ninthCardView = findViewById(R.id.ninthCardViewHard);

    //the relative layouts
    firstRelativeLayout = findViewById(R.id.firstRelativeViewHard);
    secondRelativeLayout = findViewById(R.id.secondRelativeViewHard);
    thirdRelativeLayout = findViewById(R.id.thirdRelativeViewHard);
    fourthRelativeLayout = findViewById(R.id.fourthRelativeViewHard);
    fifthRelativeLayout = findViewById(R.id.fifthRelativeViewHard);
    sixthRelativeLayout = findViewById(R.id.sixthRelativeViewHard);
    seventhRelativeLayout = findViewById(R.id.seventhRelativeViewHard);
    eighthRelativeLayout = findViewById(R.id.eighthRelativeViewHard);
    ninthRelativeLayout = findViewById(R.id.ninthRelativeViewHard);

    //the image views
    firstImage = findViewById(R.id.firstImageHard);
    secondImage = findViewById(R.id.secondImageHard);
    thirdImage = findViewById(R.id.thirdImageHard);
    fourthImage = findViewById(R.id.fourthImageHard);
    fifthImage = findViewById(R.id.fifthImageHard);
    sixthImage = findViewById(R.id.sixthImageHard);
    seventhImage = findViewById(R.id.seventhImageHard);
    eighthImage = findViewById(R.id.eighthImageHard);
    ninthImage = findViewById(R.id.ninthImageHard);

    //other control buttons
    restartGame = findViewById(R.id.hardRestart);
    selectLevel = findViewById(R.id.hardSelectLevel);
    firstCardView.setOnClickListener(this);
    secondCardView.setOnClickListener(this);
    thirdCardView.setOnClickListener(this);
    fourthCardView.setOnClickListener(this);
    fifthCardView.setOnClickListener(this);
    sixthCardView.setOnClickListener(this);
    seventhCardView.setOnClickListener(this);
    eighthCardView.setOnClickListener(this);
    ninthCardView.setOnClickListener(this);
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
    selectedCardView = (int)(Math.random()*((9 - 1) + 1)) + 1;
    System.out.println("-----------------------------------"+selectedCardView + red + green + blue);
    switch (selectedCardView){
      case 1:
        correctOption = "firstCardView";
        firstCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        firstRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(randomColorGenerator());
        secondRelativeLayout.setBackgroundColor(randomColorGenerator());
        thirdCardView.setCardBackgroundColor(randomColorGenerator());
        thirdRelativeLayout.setBackgroundColor(randomColorGenerator());
        fourthCardView.setCardBackgroundColor(randomColorGenerator());
        fourthRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        eighthCardView.setCardBackgroundColor(randomColorGenerator());
        eighthRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 2:
        correctOption = "secondCardView";
        secondCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        secondRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        thirdCardView.setCardBackgroundColor(randomColorGenerator());
        thirdRelativeLayout.setBackgroundColor(randomColorGenerator());
        fourthCardView.setCardBackgroundColor(randomColorGenerator());
        fourthRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        eighthCardView.setCardBackgroundColor(randomColorGenerator());
        eighthRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 3:
        correctOption = "thirdCardView";
        thirdCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        thirdRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(randomColorGenerator());
        secondRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        fourthCardView.setCardBackgroundColor(randomColorGenerator());
        fourthRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        eighthCardView.setCardBackgroundColor(randomColorGenerator());
        eighthRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 4:
        correctOption = "fourthCardView";
        fourthCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        fourthRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(randomColorGenerator());
        secondRelativeLayout.setBackgroundColor(randomColorGenerator());
        thirdCardView.setCardBackgroundColor(randomColorGenerator());
        thirdRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        eighthCardView.setCardBackgroundColor(randomColorGenerator());
        eighthRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 5:
        correctOption = "fifthCardView";
        fifthCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        fifthRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(randomColorGenerator());
        secondRelativeLayout.setBackgroundColor(randomColorGenerator());
        thirdCardView.setCardBackgroundColor(randomColorGenerator());
        thirdRelativeLayout.setBackgroundColor(randomColorGenerator());
        fourthCardView.setCardBackgroundColor(randomColorGenerator());
        fourthRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        eighthCardView.setCardBackgroundColor(randomColorGenerator());
        eighthRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 6:
        correctOption = "sixthCardView";
        sixthCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        sixthRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        thirdCardView.setCardBackgroundColor(randomColorGenerator());
        thirdRelativeLayout.setBackgroundColor(randomColorGenerator());
        fourthCardView.setCardBackgroundColor(randomColorGenerator());
        fourthRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        eighthCardView.setCardBackgroundColor(randomColorGenerator());
        eighthRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 7:
        correctOption = "seventhCardView";
        seventhCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        seventhRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(randomColorGenerator());
        secondRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        fourthCardView.setCardBackgroundColor(randomColorGenerator());
        fourthRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        eighthCardView.setCardBackgroundColor(randomColorGenerator());
        eighthRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 8:
        correctOption = "eighthCardView";
        eighthCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        eighthRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(randomColorGenerator());
        secondRelativeLayout.setBackgroundColor(randomColorGenerator());
        thirdCardView.setCardBackgroundColor(randomColorGenerator());
        thirdRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        ninthCardView.setCardBackgroundColor(randomColorGenerator());
        ninthRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
      case 9:
        correctOption = "ninthCardView";
        ninthCardView.setCardBackgroundColor(Color.rgb(red, green, blue));
        ninthRelativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
        secondCardView.setCardBackgroundColor(randomColorGenerator());
        secondRelativeLayout.setBackgroundColor(randomColorGenerator());
        thirdCardView.setCardBackgroundColor(randomColorGenerator());
        thirdRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        fifthCardView.setCardBackgroundColor(randomColorGenerator());
        fifthRelativeLayout.setBackgroundColor(randomColorGenerator());
        sixthCardView.setCardBackgroundColor(randomColorGenerator());
        sixthRelativeLayout.setBackgroundColor(randomColorGenerator());
        seventhCardView.setCardBackgroundColor(randomColorGenerator());
        seventhRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        firstCardView.setCardBackgroundColor(randomColorGenerator());
        firstRelativeLayout.setBackgroundColor(randomColorGenerator());
        break;
    }
  }

  @Override
  public void onClick(View view) {
    switch(view.getId()){
      case R.id.firstCardViewHard:
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
      case R.id.secondCardViewHard:
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
      case R.id.thirdCardViewHard:
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
      case R.id.fourthCardViewHard:
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
      case R.id.fifthCardViewHard:
        selectedOption = "fifthCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          fifthImage.setImageResource(R.drawable.ic_check_black_24dp);
          fifthTextView.setText("CORRECT");
          fifthTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          fifthImage.setImageResource(R.drawable.ic_clear);
          fifthTextView.setText("INCORRECT");
          fifthTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;
      case R.id.sixthCardViewHard:
        selectedOption = "sixthCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          sixthImage.setImageResource(R.drawable.ic_check_black_24dp);
          sixthTextView.setText("CORRECT");
          sixthTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          sixthImage.setImageResource(R.drawable.ic_clear);
          sixthTextView.setText("INCORRECT");
          sixthTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;
      case R.id.seventhCardViewHard:
        selectedOption = "seventhCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          seventhImage.setImageResource(R.drawable.ic_check_black_24dp);
          seventhTextView.setText("CORRECT");
          seventhTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          seventhImage.setImageResource(R.drawable.ic_clear);
          seventhTextView.setText("INCORRECT");
          seventhTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;
      case R.id.eighthCardViewHard:
        selectedOption = "eighthCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          eighthImage.setImageResource(R.drawable.ic_check_black_24dp);
          eighthTextView.setText("CORRECT");
          eighthTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          eighthImage.setImageResource(R.drawable.ic_clear);
          eighthTextView.setText("INCORRECT");
          eighthTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;
      case R.id.ninthCardViewHard:
        selectedOption = "ninthCardView";
        if(selectedOption.equalsIgnoreCase(correctOption)){
          ninthImage.setImageResource(R.drawable.ic_check_black_24dp);
          ninthTextView.setText("CORRECT");
          ninthTextView.setTextColor(getResources().getColor(R.color.green));
          disableAllTextViews();
        }else {
          ninthImage.setImageResource(R.drawable.ic_clear);
          ninthTextView.setText("INCORRECT");
          ninthTextView.setTextColor(getResources().getColor(R.color.red));
        }
        break;

      case R.id.hardRestart:
        recreate();
        break;

      case R.id.hardSelectLevel:
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }
  }

  private int randomColorGenerator(){
    int randomred = (int)(Math.random()*((255 - 0) + 1)) + 0;
    int randomgreen = (int)(Math.random()*((255 - 0) + 1)) + 0;
    int randomblue = (int)(Math.random()*((255 - 0) + 1)) + 0;
    return Color.rgb(randomred, randomgreen, randomblue);
  }

  private void disableAllTextViews(){
    firstCardView.setEnabled(false);
    secondCardView.setEnabled(false);
    thirdCardView.setEnabled(false);
    fourthCardView.setEnabled(false);
    fifthCardView.setEnabled(false);
    sixthCardView.setEnabled(false);
    seventhCardView.setEnabled(false);
    eighthCardView.setEnabled(false);
    ninthCardView.setEnabled(false);
  }
}
