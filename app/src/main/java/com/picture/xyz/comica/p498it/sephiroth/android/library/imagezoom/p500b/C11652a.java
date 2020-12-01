package com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom.p500b;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: it.sephiroth.android.library.imagezoom.b.a */
/* compiled from: FastBitmapDrawable */
public class C11652a extends Drawable {

    /* renamed from: a */
    protected Bitmap f41084a;

    /* renamed from: b */
    protected Paint f41085b;

    public C11652a(Bitmap bitmap) {
        this.f41084a = bitmap;
        Paint paint = new Paint();
        this.f41085b = paint;
        paint.setDither(true);
        this.f41085b.setFilterBitmap(true);
    }

    /* renamed from: a */
    public Bitmap mo53622a() {
        return this.f41084a;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.f41084a, 0.0f, 0.0f, this.f41085b);
    }

    public int getIntrinsicHeight() {
        return this.f41084a.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f41084a.getWidth();
    }

    public int getMinimumHeight() {
        return this.f41084a.getHeight();
    }

    public int getMinimumWidth() {
        return this.f41084a.getWidth();
    }

    @SuppressLint("WrongConstant")
    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f41085b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f41085b.setColorFilter(colorFilter);
    }
}
