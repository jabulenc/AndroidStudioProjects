package com.jonab.fullylocalconnect4;

import android.annotation.TargetApi;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.List;
import java.util.Stack;

/**
 * Created by jonab on 3/2/2017.
 */

public class C4Column extends Stack<C4Piece>{
    private final int MAX_SIZE = 4;
    private boolean isFull;
    private LinearLayout columnLayout;

    public boolean isFull() {
        return this.size() == 4;
    }

    public C4Column() {

    }
    public C4Column(List<C4Piece> initialPieces, LinearLayout layout)
    {
        columnLayout = layout;
        this.addAll(initialPieces);
    }
    public boolean addPiece(C4Piece newPiece)
    {
        if (this.isFull()){
            Log.i("C4Column","Column was full");
            return false;
        }
        this.push(newPiece);
        return true;
    }
}
