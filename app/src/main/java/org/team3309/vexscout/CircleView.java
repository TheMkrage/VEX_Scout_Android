package org.team3309.vexscout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class CircleView extends View {

    //circle and text colors
    private int circleOuterCol, circleInnerCol, labelCol;
    //label text
    private String circleTopText = "DEF", circleBottomText = "";
    //paint for drawing custom vie
    private Paint circlePaint = new Paint();

    public CircleView(Context context) {
        super(context);
        init(context, null);
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }


    private void init(Context context, AttributeSet attrs) {
        circlePaint = new Paint();
        //get the attributes specified in attrs.xml using the name we included
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.CircleView, 0, 0);

        try {
            //get the text and colors specified using the names in attrs.xml
            circleBottomText = a.getString(R.styleable.CircleView_circleBottomLabel);
            circleTopText = a.getString(R.styleable.CircleView_circleTopLabel);
            circleInnerCol = a.getInteger(R.styleable.CircleView_circleInnerColor, 0);
            circleOuterCol = a.getInteger(R.styleable.CircleView_circleOuterColor, 0);
            labelCol = a.getInteger(R.styleable.CircleView_labelColor, 0);
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //get half of the width and height as we are working with a circle
        int viewWidthHalf = this.getMeasuredWidth() / 2;
        int viewHeightHalf = this.getMeasuredHeight() / 2;
        //get the radius as half of the width or height, whichever is smaller
        //subtract ten so that it has some space around it
        int radius = 0;
        if (viewWidthHalf > viewHeightHalf)
            radius = viewHeightHalf - 10;
        else
            radius = viewWidthHalf - 10;
        circlePaint.setStyle(Paint.Style.FILL);
        circlePaint.setAntiAlias(true);
        //set the paint color using the circle color specified
        circlePaint.setColor(circleOuterCol);
        canvas.drawCircle(viewWidthHalf, viewHeightHalf, radius, circlePaint);

        circlePaint.setColor(circleInnerCol);
        canvas.drawCircle(viewWidthHalf, viewHeightHalf, (float) (radius - (radius * 0.1)), circlePaint);

        //set the text color using the color specified
        circlePaint.setColor(labelCol);
        //set text properties
        circlePaint.setTextAlign(Paint.Align.CENTER);


        if(circleTopText == null) {
            circleTopText = "3309B";
        }

        if(this.circleBottomText != null && !this.circleBottomText.isEmpty()) { // If there is a bottom text
            //circlePaint.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "Helvetica.otf"));
            circlePaint.setTextSize(50);
            canvas.drawText(circleTopText, viewWidthHalf, viewHeightHalf, circlePaint);
            circlePaint.setTextSize(40);
            canvas.drawText(circleBottomText, viewWidthHalf, viewHeightHalf + 50, circlePaint);
        }else {
            circlePaint.setTextSize((int) (viewWidthHalf * .4));
            canvas.drawText(circleTopText, viewWidthHalf, viewHeightHalf, circlePaint);
        }
        //draw the text using the string attribute and chosen properties

    }

    public int getCircleColor() {
        return circleOuterCol;
    }

    public int getLabelColor() {
        return labelCol;
    }

    public String getLabelText() {
        return circleTopText;
    }

    public void setCircleColor(int newColor) {
        //update the instance variable
        circleOuterCol = newColor;
        //redraw the view
        invalidate();
        requestLayout();
    }

    public void setLabelColor(int newColor) {
        //update the instance variable
        labelCol = newColor;
        //redraw the view
        invalidate();
        requestLayout();
    }

    public void setLabelText(String newLabel) {
        //update the instance variable
        circleTopText = newLabel;
        //redraw the view
        invalidate();
        requestLayout();
    }
}
