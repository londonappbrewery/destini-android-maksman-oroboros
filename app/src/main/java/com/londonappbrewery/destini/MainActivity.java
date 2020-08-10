package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 3 & 8 - Declare member variables here:
    //  first step is to declare variables that will hold the
   // views from the activity_main.xml



    TextView myTextView;        //from the activity_main.xml
    Button myTopButton;
    Button myBottomButton;
    int mStoryIndex = 1 ;            //index for state of the story

    @Override
    protected void onCreate(Bundle savedInstanceState) {     //start of app
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 4 - Wire up the 3 views from the layout to the member variables:
        //link the member variables here with the views from activity_main.xml

        myTextView = (TextView) findViewById(R.id.storyTextView);
        myTopButton = (Button)  findViewById(R.id.buttonTop);
        myBottomButton = (Button)  findViewById(R.id.buttonBottom);



        // TODO: Steps 5, 6, & 8 - Set a listener on the top button
        ////////////////////////////////////////////////////if top button is pressed,////////////////////////////////////////////////////////
            myTopButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {        //set a on click listener, when button is pressed, do this...

                    if ((mStoryIndex == 1)||(mStoryIndex == 2)) {             // if top button is pressed while at que 1 OR 2

                        Log.d("destini ", "Q1/A1 selected");  //selection for logcat

                        que3();     //call method, update to question 3.
                    }

                    else{              //if top button is pressed whike you at question 3

                        end6();         //call method
                    }
                }

            });

            /////////////////////////////////////////////else if bottom button is pressed///////////////////////////////////////////
                myBottomButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {

                    if (mStoryIndex == 1) {      //if bottom button is pressed while at question 1

                        Log.d("destini", "Q1/A2 selected");

                        que2();     //call method, update to question 2

                    }

                    else if(mStoryIndex == 2){      //if bottom button is pressed while at que 2

                        end4();         //call method

                    }

                    else {         //@ que 3

                        end5();         //call method
                    }
                }
            });






    }

    ////////////////////////////////////////methods for updating questions////////////////////////////////////////////////

    private void que1 (){  //update question and answer option for top button

        myTextView.setText(R.string.T1_Story);        //update textview to q1
        myTopButton.setText(R.string.T1_Ans1);        //update top button text to q2/a1
        myBottomButton.setText(R.string.T1_Ans2);       //update bottom button text to q2/a2

       // mStoryIndex =1;     //update to q2

    }


        private void que2 (){  //update question and answer option for top button

            myTextView.setText(R.string.T2_Story);        //update textview to q2
            myTopButton.setText(R.string.T2_Ans1);        //update top button text to q2/a1
            myBottomButton.setText(R.string.T2_Ans2);       //update bottom button text to q2/a2

            mStoryIndex =2;     //update to q2


        }

        private void que3 (){

            myTextView.setText(R.string.T3_Story);    //update textview to q3

            myTopButton.setText(R.string.T3_Ans1);   //update top button to q3/a1
            myBottomButton.setText(R.string.T3_Ans2);    //update bottom button to q3/a2

            mStoryIndex = 3;     //update to q3

        }

        private void end4 (){

            myTextView.setText(R.string.T4_End); //jump to q4/end

            mStoryIndex = 4;     //update to q4

            myTopButton.setVisibility(View.GONE);           //hide buttons at the end
            myBottomButton.setVisibility(View.GONE);


        }

        private void end5 (){

            myTextView.setText(R.string.T5_End);        //go to q5/end

            mStoryIndex = 5;       //update index to 5

            myTopButton.setVisibility(View.GONE);           //hide buttons at the end
            myBottomButton.setVisibility(View.GONE);

        }

        private void end6 (){

            myTextView.setText(R.string.T6_End);       //go to q6/end

            mStoryIndex = 6;     //update index to 6

            myTopButton.setVisibility(View.GONE);           //hide buttons at the end
            myBottomButton.setVisibility(View.GONE);
        }
}
