package com.example.admin.cotuong;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 3/28/2018.
 */

public class Chessboard {

    private Bitmap bitmap;
    private Canvas canvas;
    private Paint paint;
    private Context context;
    private int[][] board;
    private int colQty, rowQty;
    private int bitmapWith, bitmapHeight;
    private List<Line> listLine;


    public Chessboard(Context context, int colQty, int rowQty, int bitmapWith, int bitmapHeight) {
        this.context = context;
        this.colQty = colQty;
        this.rowQty = rowQty;
        this.bitmapWith = bitmapWith;
        this.bitmapHeight = bitmapHeight;
    }

    public void innit(){
        bitmap = Bitmap.createBitmap(bitmapWith, bitmapHeight, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        paint = new Paint();
        paint.setStrokeWidth(2);
        board = new int[rowQty][colQty];
        listLine = new ArrayList<>();

        int cellWidth = bitmapWith / colQty;
        int cellHeight = bitmapHeight / rowQty;

        for (int i = 0; i <= rowQty; i++){
            listLine.add(new Line(0, i * cellHeight, bitmapWith, i * cellHeight));
        }

        for (int i = 0; i <= colQty; i++){
            listLine.add(new Line(cellWidth * i,0,cellWidth * i, bitmapHeight));
        }

    }

    public Bitmap drawBoard(){
        Line line;

        for (int i = 0; i < listLine.size(); i++){
            line = listLine.get(i);
            canvas.drawLine(line.getStartX(), line.getStartY(), line.getStopX(), line.getStopY(), paint);
        }

        return this.bitmap;

    }
}
