package com.example.biodata12212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Uri uri;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_alamat = (Button) findViewById(R.id.btn_alamat);
        btn_alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.580928895015724, 111.05898717549412"));
                startActivity(intent);
            }
        });
        Button btn_telp = (Button) findViewById(R.id.btn_telp);
        btn_telp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "081390979375" ;
                Intent panggil = new Intent(Intent. ACTION_DIAL);
                panggil.setData(Uri. fromParts("tel",nomor,null));
                startActivity(panggil);
            }
        });
        Button btn_email = (Button) findViewById(R.id.btn_email);
        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:najah.nailun88@gmail.com")); // only email apps should handle this
                startActivity(intent);
            }

        });
    }
}