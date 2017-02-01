package furkan.com.a003programmaticmethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layout;
    private CheckBox checkBox;
    private Button button;

    private void init() {
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        for (int i = 1; i <= 30; i++) {

            if (    i % 2 == 0) {
                checkBox = new CheckBox(this);
                checkBox.setId(i);
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
                button.setId(i);
                button.setText("Buton " + i);

                //Layout Parameters
                LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(250,90);
                params2.setMargins(10,5,10,5);
                params2.gravity = Gravity.RIGHT;
                button.setLayoutParams(params2);

                layout.addView(button);
            }

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(layout);
    }
}
