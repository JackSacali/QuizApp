package li.saca.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Calculate score and show the result
    public void submitAnswers(View view) {
        int score = 0;

        // Assign the name of the user to a variable
        EditText playerName = (EditText) findViewById(R.id.player_name);
        String playerEnteredName = playerName.getText().toString();
        if (playerEnteredName.equals("")) {
            playerEnteredName = "unknown";
        }

        // Check the gender and assign a string to address the player
        Spinner gender = (Spinner) findViewById(R.id.gender_spinner);
        String genderText = gender.getSelectedItem().toString();
        String addressing = "Mr./Mrs. ";
        if (genderText.equals("Male")) {
            addressing = "Mr. ";
        } else if (genderText.equals("Female")) {
            addressing = "Mrs. ";
        }

        // Check answer No. 1 and increment the score if it was correct
        RadioButton question1 = (RadioButton) findViewById(R.id.question1_answer2);
        boolean answer1 = question1.isChecked();
        if (answer1) {
            score += 1;
        }

        // Check answer No. 2 and increment the score if it was correct
        RadioButton question2 = (RadioButton) findViewById(R.id.question2_answer1);
        boolean answer2 = question2.isChecked();
        if (answer2) {
            score += 1;
        }

        // Check answer No. 3 and increment the score if it was correct
        RadioButton question3 = (RadioButton) findViewById(R.id.question3_answer2);
        boolean answer3 = question3.isChecked();
        if (answer3) {
            score += 1;
        }

        // Check answer No. 4 and increment the score if it was correct
        RadioButton question4 = (RadioButton) findViewById(R.id.question4_answer3);
        boolean answer4 = question4.isChecked();
        if (answer4) {
            score += 1;
        }

        // Check answer No. 5 and increment the score if it was correct
        RadioButton question5 = (RadioButton) findViewById(R.id.question5_answer1);
        boolean answer5 = question5.isChecked();
        if (answer5) {
            score += 1;
        }

        // Check answer No. 6 and increment the score if it was correct
        RadioButton question6 = (RadioButton) findViewById(R.id.question6_answer1);
        boolean answer6 = question6.isChecked();
        if (answer6) {
            score += 1;
        }

        // Check answer No. 7 and increment the score if it was correct
        RadioButton question7 = (RadioButton) findViewById(R.id.question7_answer3);
        boolean answer7 = question7.isChecked();
        if (answer7) {
            score += 1;
        }

        // Check answer No. 8 and increment the score if it was correct
        RadioButton question8 = (RadioButton) findViewById(R.id.question8_answer1);
        boolean answer8 = question8.isChecked();
        if (answer8) {
            score += 1;
        }

        // Generate result message
        String scoreMessage;
        if (score < 4) {
            scoreMessage = "Unfortunately, Your score is only: " + score;
        } else if (score < 8) {
            scoreMessage = "Bravo! Your score is: " + score;
        } else {
            scoreMessage = "Impressive! You got all the answers right! Your score is: " + score;
        }

        String toastMessage = addressing + playerEnteredName;
        toastMessage += "\n" + scoreMessage;
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
    }
}
