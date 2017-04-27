package mr_auspicious.shivam_kr_shiv.com.material_design;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = (Button) findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        View v = layoutInflater.inflate(R.layout.dialog,null);

         AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setView(v);




// get the center for the clipping circle
        int cx = (v.getLeft() + v.getRight()) / 2;
        int cy = (v.getTop() + v.getBottom()) / 2;

// get the final radius for the clipping circle
        int finalRadius = Math.max(v.getWidth(), v.getHeight());

// create the animator for this view (the start radius is zero)
     Animator anim = ViewAnimationUtils.createCircularReveal(v, cx, cy, 0, finalRadius);

// make the view visible and start the animation
        v.setVisibility(View.VISIBLE);
        anim.start();

        alertDialog.show();



    }


}
