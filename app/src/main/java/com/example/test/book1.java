package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class book1 extends AppCompatActivity {
    TextView TextView,TextView1;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        imageView = findViewById(R.id.imageView2);
        TextView = findViewById(R.id.textView);
        TextView1 = findViewById(R.id.textView1);
        // Receiving value into activity using intent.
        String TempHolder = getIntent().getStringExtra("ListViewClickedValue");
        String TempHolder2 = getIntent().getStringExtra("ListViewClickedValue2");
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            imageView.setImageResource(resId);
        }
        // Setting up received value into EditText.
        TextView.setText(TempHolder);
        TextView1.setText(TempHolder2);
    }
}