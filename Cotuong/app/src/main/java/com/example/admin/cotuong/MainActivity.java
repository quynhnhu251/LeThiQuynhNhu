package com.example.admin.cotuong;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Chessboard chessboard;
    Bitmap bitmap;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chessboard = new Chessboard(this, 800, 900, 8, 8);
        chessboard.innit();
        bitmap = chessboard.drawBoard();

    }
}
