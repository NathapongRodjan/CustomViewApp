package com.example.nathapong.customviewapp;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyCustomView extends View{

    private int viewColor;
    private int textColor;
    private String viewText;

    private Paint paintObject;


    public MyCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        paintObject = new Paint();

        TypedArray typedArray = context.getTheme().obtainStyledAttributes
                (attributeSet, R.styleable.MyCustomView, 0,0);

        try {

            viewColor = typedArray.getInteger(R.styleable.MyCustomView_viewColor, 0);
            textColor = typedArray.getInteger(R.styleable.MyCustomView_textColor, 0);
            viewText = typedArray.getString(R.styleable.MyCustomView_viewText);

        }catch (Exception e){

            typedArray.recycle();
        }
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paintObject.setStyle(Paint.Style.FILL);
        paintObject.setAntiAlias(true);
        paintObject.setColor(viewColor);

        canvas.drawCircle(500,500,300,paintObject);

        paintObject.setColor(textColor);
        paintObject.setTextAlign(Paint.Align.CENTER);
        paintObject.setTextSize(50);
        canvas.drawText(viewText, 500,500, paintObject);
    }


    // Getter for instance variable

    public int getViewColor() {
        return viewColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public String getViewText() {
        return viewText;
    }


    // Getter for instance variable

    public void setViewColor(int viewColor) {
        this.viewColor = viewColor;

        // Redraw the whole view
        invalidate();
        requestLayout();
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;

        // Redraw the whole view
        invalidate();
        requestLayout();
    }

    public void setViewText(String viewText) {
        this.viewText = viewText;

        // Redraw the whole view
        invalidate();
        requestLayout();
    }
}
