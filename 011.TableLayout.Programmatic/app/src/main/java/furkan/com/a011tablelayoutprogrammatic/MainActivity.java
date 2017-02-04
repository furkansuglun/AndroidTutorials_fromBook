package furkan.com.a011tablelayoutprogrammatic;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    private TableLayout tableLayout;
    private TableRow tableRow;
    private Button button;

    private void init() {

        tableLayout = new TableLayout(this);

        for(int i=1;i<=5;++i) {

            tableRow = new TableRow(this);
            for(int j=1;j<=4;++j) {

                button = new Button(this);
                button.setText(String.format("Row:%d Col:%d" , i,j));
                button.setWidth(150);
                button.setHeight(60);

                tableRow.addView(button);

            }

            tableLayout.addView(tableRow);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    init();
    setContentView(tableLayout);
    //get Child
    TableRow tr = (TableRow) tableLayout.getChildAt(2); //2.satır
    tr.getChildAt(1).setBackgroundColor(Color.GREEN);  //1. sütun
        //bu sekilde event handling yapılabilir.vs.!
    }
}
