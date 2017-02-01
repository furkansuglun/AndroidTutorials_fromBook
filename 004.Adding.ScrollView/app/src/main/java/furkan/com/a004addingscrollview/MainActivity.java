package furkan.com.a004addingscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private ScrollView scrollView; // --> ViewGroup object
    private LinearLayout layout;
    private Button button;
    private CheckBox checkBox;

    private void init() {
        scrollView = new ScrollView(this);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        for(int i=1; i <= 20; i++) {
            if(i % 2 == 0) {
                checkBox = new CheckBox(this);
                checkBox.setText("Seçenek " + i);

                //Layout Parameters
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(200,80);
                params.setMargins(10,5,10,5);
                params.gravity = Gravity.LEFT;
                checkBox.setLayoutParams(params);

                layout.addView(checkBox);
            }
            else {

                button = new Button(this);
                button.setText("Buton " + i);

                //Layout Parameters
                LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(250,90);
                params2.setMargins(10,5,10,5);
                params2.gravity = Gravity.RIGHT;
                button.setLayoutParams(params2);

                layout.addView(button);
            }
        }

        //linearlayout --> scrollview
        scrollView.addView(layout);

        //if we want to horizonal scroll then we have to use HorizontalScrollView!
        /*
        scrollView = new HorizontalScrollView(this);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
         */

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(scrollView);
    }
}
