package com.jonab.fullylocalconnect4;

import android.widget.ImageView;

/**
 * Created by jonab on 3/2/2017.
 * Represents a Connect 4 piece
 */

public class C4Piece {



    private ImageView pieceView;
    private int position;
    private Color team;

    public void setTeam(Color team) {
        this.team = team;
    }

    public int getPosition() {
        return position;
    }

    public ImageView getPieceView() {
        return pieceView;
    }

    public void setPieceView(ImageView pieceView) {
        this.pieceView = pieceView;
    }

    /// Default Constructor
    public C4Piece(){

    }
}
