package masip.marc.sharedcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    private TextView counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        counter = (TextView) findViewById(R.id.counter);
    }

    public void restarUn(View view) {
    }

    public void sumarUn(View view) {
    }

    public void reset(View view) {
    }
}
