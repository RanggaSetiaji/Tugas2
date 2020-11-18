package com.example.tugasrangga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "081367601294" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void whatsapps(View view){
        String chat = "https://wa.me/6281367601294";
        String text = "Assalamualaikum warahmatullahi wabarakatuh";
        Intent wa = new Intent (Intent.ACTION_VIEW);
        wa.setData(Uri.parse(chat));
        startActivity(wa);
    }

    public void email (View view){
        Intent pesan = new Intent (Intent.ACTION_SEND);
        pesan.setType("text/plain");
        pesan.putExtra(Intent.EXTRA_EMAIL,new String[]{"grafikarangga@gmail.com"});
        pesan.putExtra(Intent.EXTRA_CC,new String[]{"ajierik10tkj1@gmail.com"});
        pesan.putExtra(Intent.EXTRA_SUBJECT,"Pesan Pembuka");
        pesan.putExtra(Intent.EXTRA_TEXT,"Assalamu'alaikum, Ahlan wa Sahlan !");
        startActivity(pesan);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void Pindahmaps(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }
}
