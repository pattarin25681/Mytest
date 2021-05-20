package com.example.test;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BookViewHolder {

    ImageView itemImage;
    TextView bookTitle;
    TextView bookDes;
    BookViewHolder(View v){
        itemImage = v.findViewById(R.id.imageView);
        bookTitle = v.findViewById(R.id.textView1);
        //bookDes = v.findViewById(R.id.textViewDes1);

    }
}
