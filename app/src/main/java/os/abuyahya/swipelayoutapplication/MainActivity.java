package os.abuyahya.swipelayoutapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.swipe.SwipeLayout;

public class MainActivity extends AppCompatActivity {

    SwipeLayout swipeLayout;
    ImageView imgDelete, imgAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        swipeLayout = findViewById(R.id.swipe);
        swipeLayout.setShowMode(SwipeLayout.ShowMode.PullOut);

        swipeLayout.addDrag(SwipeLayout.DragEdge.Left, swipeLayout.findViewById(R.id.linear_swipe));
        swipeLayout.addDrag(SwipeLayout.DragEdge.Right,null);

        imgDelete = findViewById(R.id.img_delete);
        imgAdd = findViewById(R.id.img_add);

        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Added", Toast.LENGTH_SHORT).show();
            }

        });

    }
}
