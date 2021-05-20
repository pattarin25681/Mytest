package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    ListView lvbook;
    String[] bookName = {"ฮัสกี้หน้าโง่กับอาจารย์เหมียวขาวของเขา ","นักรบพเนจรสุดขอบฟ้า เล่ม1","นักรบพเนจรสุดขอบฟ้า(เล่มจบ)","ตัวร้ายอย่างข้า...จะหนีเอาตัวรอดยังไงดี เล่ม 1",
            "THE BOOK THIEF จอมโจรขโมยหนังสือ","แตกสลาย","ล่าสไลม์มา 300 ปี รู้ตัวอีกทีก็เลเวล MAX ซะแล้ว เล่ม 6",
            "สารพันปัญหาวุ่นวาย ของยัยแวมไพร์ขี้จุ๊ เล่ม 1","ANIMAL FARM แอนิมอล ฟาร์ม : การเมืองเรื่องสรรพสัตว์ (ปกแข็ง)","2484 : 80 ปี ญี่ปุ่นบุก!"};
    String[] bookDes ={"เป็นเรื่องราวของโม่เวยอวี่ พระเอกที่ตายแล้วย้อนอดีตมาช่วงเด็กก่อนจะเกิดเรื่องวุ่นวายขึ้นจนทำให้เปลี่ยนไปคนละคน ฉู่หวั่นหนิงนายเอกเป็นซือจุน อาจารย์ของพระเอก ","โจวจื่อซูเข้าไปยุ่งเกี่ยวพัวพันกับเรื่องราวในยุทธภพยังวุ่นวายไม่พอหรือไร ",
            "โจวจื่อซูเข้าไปยุ่งเกี่ยวพัวพันกับเรื่องราวในยุทธภพยังวุ่นวายไม่พอหรือไร เขาถึงได้มีคนน่ารำคาญเช่นนี้ตามติดไปทั่ว!","เดิมทีเขาเป็นเพียงเด็กหนุ่มใกล้ตายคนหนึ่ง เมื่อลาจากโลกไปแล้วกลับตื่นขึ้นมาพบว่าตนอยู่ในร่างของตัวร้าย",
            "พลังจากตัวหนังสือสามารถเปลี่ยนแปลงโลกได้ทั้งใบ วรรณกรรมคลาสสิกระดับโลกที่จะทำให้เห็นว่าถ้อยคำและตัวหนังสือมีพลังมากกว่าสิ่งอื่นใด","สมมติว่าไม่มีอะไรที่เป็นความสุขเลย มีแต่ความทุกข์เต็มไปหมดคิดว่าหัวใจจะเป็นยังไง","เรื่องราวทำงานอันยุ่งเหยิงของเบลเซบับค่ะ",
            "เรื่องราวคอมิคอลแฟนตาซีที่เล่าเรื่องราวของโคมาริ ซึ่งอาศัยความโชคดีกับการบลัฟ ตะลุยฝ่าอุปสรรคต่างๆ !","สัตว์ทุกตัวล้วนเสมอภาคกัน แต่สัตว์บางตัวเสมอภาคกว่าตัวอื่นๆ",
            "วีรกรรม ข้อเท็จจริงและปริศนาซ่อนเร้นเมื่อทัพญี่ปุ่นบุกไทย"};
    int[] bookImage ={R.drawable.book1,R.drawable.book2,R.drawable.book3,R.drawable.book4,R.drawable.book5,R.drawable.book6,
                        R.drawable.book7,R.drawable.book8,R.drawable.book9,R.drawable.book10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lvbook = findViewById(R.id.lvbook);
        BookAdapter bookAdapter = new BookAdapter(this, bookName,bookDes,bookImage);
        //BookAdapter bookAdapter = new BookAdapter(this, bookName,bookImage,bookDes);
        lvbook.setAdapter(bookAdapter);
        lvbook.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(HomeActivity.this, "You Clicked at " +bookName[+ position], Toast.LENGTH_SHORT).show();

                String TempListViewClickedValue = bookName[position].toString();
                String TempListViewClickedValue2 = bookDes[position].toString();
                int TempListViewClickedValue3 = bookImage[position];
                Intent intent = new Intent(HomeActivity.this, book1.class);
                intent.putExtra("ListViewClickedValue", TempListViewClickedValue);
                intent.putExtra("ListViewClickedValue2", TempListViewClickedValue2);
                intent.putExtra("resId", TempListViewClickedValue3);
                startActivity(intent);

            }
        });
    }
}