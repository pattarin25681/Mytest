package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BookAdapter extends ArrayAdapter<String> {
//    Context context;
//    int[] images;
//    String[] bookName;
//    String[] bookDes;
    private final Activity context;
    private final String[] bookName;
    private final String[] bookDes;
    private final int[] bookImage;
    public BookAdapter(Activity context, String[] bookName,String[] bookDes, int[] bookImage) {
        super(context, R.layout.single_item, bookName);
        this.context = context;
        this.bookName = bookName;
        this.bookDes = bookDes;
        this.bookImage = bookImage;
}
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_item, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        txtTitle.setText(bookName[position]);

        imageView.setImageResource(bookImage[position]);
        return rowView;
    }
}
//    public BookAdapter(Context context, String[] bookName,int[] images) {
//        super(context, R.layout.single_item,R.id.textView1,bookName);
//        this.context = context;
//        this.images = images;
//        this.bookName = bookName;
//        //this.bookDes = bookDes;
//
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View singleItem = convertView;
//        BookViewHolder holder = null;
//        if(singleItem == null){
//            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            singleItem = layoutInflater.inflate(R.layout.single_item,parent,false);
//            holder = new BookViewHolder(singleItem);
//            singleItem.setTag(holder);
//        }
//        else{
//            holder = (BookViewHolder) singleItem.getTag();
//        }
//        holder.itemImage.setImageResource(images[position]);
//        holder.bookTitle.setText(bookName[position]);
//        //holder.bookDes.setText(bookDes[position]);
//
//        singleItem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Toast.makeText(getContext(),"You click: "+bookName[position],Toast.LENGTH_SHORT).show();
//
//
//
//            }
//        });
//        return singleItem;
//    }
//}
