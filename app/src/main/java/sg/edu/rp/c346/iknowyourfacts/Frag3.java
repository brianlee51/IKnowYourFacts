package sg.edu.rp.c346.iknowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class Frag3 extends Fragment {

    Button btnChangeColor;

    public Frag3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_frag3, container,false);
        btnChangeColor = view.findViewById(R.id.btnColor);
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(4);
                int color;
                if (n == 0) {
                    color = Color.GREEN;
                } else if (n == 1) {
                    color = Color.GRAY;
                } else if (n == 2) {
                    color = Color.RED;
                } else {
                    color = Color.BLUE;
                }
                view.setBackgroundColor(color);
            }
        });
        return view;
    }

}
