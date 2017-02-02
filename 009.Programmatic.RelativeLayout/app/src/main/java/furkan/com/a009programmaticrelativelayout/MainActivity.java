package furkan.com.a009programmaticrelativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private RelativeLayout.LayoutParams params1,params2;
    private Button button1 , button2;

    private void init() {
        layout = new RelativeLayout(this);
        //------------------------------

        button1 = new Button(this);
        button1.setText("Button1");
        button1.setId(1);

        params1 = new RelativeLayout.LayoutParams(200,80);
        params1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        params1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        button1.setLayoutParams(params1);

        //---------------------

        button2 = new Button(this);
        button2.setText("Button2");
        button2.setId(2);

        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(170,90);
        params2.addRule(RelativeLayout.LEFT_OF , button1.getId());
        params2.addRule(RelativeLayout.ABOVE , button1.getId());
        button2.setLayoutParams(params2);
        /*
            addRule(verb,subject)
         * @param verb a layout verb, such as {@link #ALIGN_RIGHT}
         * @param subject the ID of another view to use as an anchor, or a
         *                boolean value (represented as {@link #TRUE} for true
         *                or 0 for false)
         */

        /** LEFT_OF
         * Rule that aligns a child's right edge with another child's left edge.
         * Button1 in sol kenarına button2 nin sağ kenarı
         */
        //----------------------------------
        layout.addView(button1);
        layout.addView(button2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(layout);
    }
}
