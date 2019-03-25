package com.diksha.coonect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int k = 0, n1r = 0, n2r = 0, n3r = 0, n4r = 0, n5r = 0, n6r = 0, n7r = 0, n8r = 0, n9r = 0, n1y = 0, n2y = 0, n3y = 0, n4y = 0, n5y = 0, n6y = 0, n7y = 0, n8y = 0, n9y = 0;
    int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0;
    int flag=0;
    boolean over = false;

        public void one (View view){
            if (p1 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redone);
                    red.animate().alpha(1f).setDuration(500);
                    n1r = 1;


                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellowone);
                    yellow.animate().alpha(1f).setDuration(500);
                    n1y = 1;
                }
                k++;
                p1 = 1;
                ans();
            }


        }

        public void two (View view){
            if (p2 == 0 && over == false) {

                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redtwo);
                    red.animate().alpha(1f).setDuration(500);
                    n2r = 1;


                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellowtwo);
                    yellow.animate().alpha(1f).setDuration(500);
                    n2y = 1;

                }
                ans();
                k++;
                p2 = 1;
            }
        }

        public void three (View view){
            if (p3 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redthree);
                    red.animate().alpha(1f).setDuration(500);
                    n3r = 1;

                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellowthree);
                    yellow.animate().alpha(1f).setDuration(500);
                    n3y = 1;

                }
                k++;
                ans();
                p3 = 1;
            }
        }

        public void four (View view){
            if (p4 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redfour);
                    red.animate().alpha(1f).setDuration(500);
                    n4r = 1;

                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellowfour);
                    yellow.animate().alpha(1f).setDuration(500);
                    n4y = 1;
                }
                k++;
                ans();
                p4 = 1;
            }
        }

        public void five (View view){
            if (p5 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redfive);
                    red.animate().alpha(1f).setDuration(500);
                    n5r = 1;
                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellowfive);
                    yellow.animate().alpha(1f).setDuration(500);
                    n5y = 1;
                }
                k++;
                ans();
                p5 = 1;
            }


        }

        public void six (View view){
            if (p6 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redsix);
                    red.animate().alpha(1f).setDuration(500);
                    n6r = 1;

                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellowsix);
                    yellow.animate().alpha(1f).setDuration(500);
                    n6y = 1;
                }
                k++;
                ans();
                p6 = 1;
            }

        }

        public void seven (View view){
            if (p7 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redseven);
                    red.animate().alpha(1f).setDuration(500);
                    n7r = 1;
                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellowseven);
                    yellow.animate().alpha(1f).setDuration(500);
                    n7y = 1;
                }
                k++;
                p7 = 1;
                ans();
            }

        }

        public void eight (View view){
            if (p8 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.redeight);
                    red.animate().alpha(1f).setDuration(500);
                    n8r = 1;

                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yelloweight);
                    yellow.animate().alpha(1f).setDuration(500);
                    n8y = 1;
                }
                k++;
                ans();
                p8 = 1;
            }

        }

        public void nine (View view){
            if (p9 == 0 && over == false) {
                if (k % 2 == 0) {
                    ImageView red = (ImageView) findViewById(R.id.rednine);
                    red.animate().alpha(1f).setDuration(500);
                    n9r = 1;


                } else {
                    ImageView yellow = (ImageView) findViewById(R.id.yellownine);
                    yellow.animate().alpha(1f).setDuration(500);
                    n9y = 1;

                }
                k++;
                ans();
                p9 = 1;
            }
        }

        public void ans ()
        {
            if ((n1r == 1 && n4r == 1 && n7r == 1) || (n2r == 1 && n5r == 1 && n8r == 7) || (n3r == 1 && n6r == 1 && n9r == 1) || (n1r == 1 && n3r == 1 && n2r == 1) || (n4r == 1 && n5r == 1 && n6r == 1) || (n7r == 1 && n8r == 1 && n9r == 1) || (n1r == 1 && n5r == 1 && n9r == 1) || (n3r == 1 && n5r == 1 && n7r == 1)) {
                TextView red = (TextView) findViewById(R.id.redwwin);
                red.animate().alpha(1f).setDuration(500);
                //red.getText().toString();
                over = true;



            } else if ((n1y == 1 && n4y == 1 && n7y == 1) || (n2y == 1 && n5y == 1 && n8y == 7) || (n3y == 1 && n6y == 1 && n9y == 1) || (n1y == 1 && n3y == 1 && n2y == 1) || (n4y == 1 && n5y == 1 && n6y == 1) || (n7y == 1 && n8y == 1 && n9y == 1) || (n1y == 1 && n5y == 1 && n9y == 1) || (n3y == 1 && n5y == 1 && n7y == 1)) {
                TextView yellow = (TextView) findViewById(R.id.yellowwin);
                yellow.animate().alpha(1f).setDuration(500);
                //yellow.getText().toString();
                over = true;

            } else if ((p1 == 1) && (p2 == 1) && (p3 == 1) && (p4 == 1) && (p5 == 1) && (p6 == 1) && (p7 == 1) && (p8 == 1) && (p9 == 1)) {
                TextView draw = (TextView) findViewById(R.id.draw);
                draw.animate().alpha(1f).setDuration(500);
                //yellow.getText().toString();
                over = true;
            }

        }

    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
