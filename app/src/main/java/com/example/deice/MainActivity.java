package com.example.deice;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
   private ImageView diceimage; // imageview this is your imageview class at the end set image in diceimage
    private Random random  = new Random(); // pick random dice this is random class


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diceimage = (ImageView) findViewById(R.id.diec); // xml with java
        diceimage.setOnClickListener(new View.OnClickListener() {// this is on click event on click
            @Override
            public void onClick(View v) {
                getanydice(); // function get pic function
            }
        });

    }
    public void getanydice()// defined function
    {
        int randomNumberpicker = random.nextInt(6)+1; // 6 because 0 to 5 between any number
        switch (randomNumberpicker)// switch case
        {
            case 1 :
                diceimage.setImageResource(R.drawable.dice1); // in case 1 then set dice1 image
                // one with diceimage
                break;
            case 2 :
                diceimage.setImageResource(R.drawable.dice2); // in case 1 then set dice2 image
                // one with diceimage
                break; case 3 :
            diceimage.setImageResource(R.drawable.dice3); // in case 1 then set dice3 image
            // one with diceimage
            break; case 4 :
            diceimage.setImageResource(R.drawable.dice4); // in case 1 then set dice4 image
            // one with diceimage
            break; case 5 :
            diceimage.setImageResource(R.drawable.dice5); // in case 1 then set dice5 image
            // one with diceimage these images are already save in drawable
            break;
            case 6 :
                diceimage.setImageResource(R.drawable.dice6); // in case 1 then set dice6 image
                // one with diceimage
                break;
        }
if(randomNumberpicker==R.drawable.dice4)
{
    // then set image dice 4 like thisi
}

    }
}
