package com.picture.xyz.comica.comica;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.picture.xyz.comica.p243f.p244a.p245a.s;
import com.picture.xyz.comica.imageprocessing.p255f.BitmapOutput;
import com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom.ImageViewTouch;
import com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom.p500b.C11652a;

/* renamed from: gr.gamebrain.comica.ImageViewTarget */
/* compiled from: xa */
public class ImageViewTarget extends ImageViewTouch implements BitmapOutput.C11653a {

    /* renamed from: A */
    Activity f39740A;

    /* renamed from: B */
    private int f39741B = 0;

    /* renamed from: C */
    private long f39742C = 0;

    /* renamed from: z */
    private int f39743z = 0;

    /* renamed from: gr.gamebrain.comica.ImageViewTarget$a */
    /* compiled from: xa */
    class C11200a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bitmap f39744a;

        C11200a(Bitmap bitmap) {
            this.f39744a = bitmap;
        }

        public void run() {
            ImageViewTarget.this.setFitToScreen(true);
            ImageViewTarget.this.setAdjustViewBounds(true);
            ImageViewTarget.this.setImageBitmap(this.f39744a);
        }
    }

    public ImageViewTarget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39740A = (Activity) context;
    }

    /* renamed from: a */
    public void mo51898a(Bitmap bitmap) {
        if (this.f39743z != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) (-this.f39743z));
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        this.f39740A.runOnUiThread(new C11200a(bitmap));
    }

    public void setDegree(int i) {
        int i2 = i >= 0 ? i % 360 : (i % 360) + 360;
        this.f39743z = i2;
        this.f39742C = AnimationUtils.currentAnimationTimeMillis();
        int i3 = this.f39743z - this.f39741B;
        if (i3 < 0) {
            i3 += 360;
        }
        if (i3 > 180) {
            i3 -= 360;
        }
        int abs = (Math.abs(i3) * 1000) / 540;
        Bitmap a = ((C11652a) getDrawable()).mo53622a();
        Matrix matrix = new Matrix();
        matrix.postRotate((float) (-i3));
        setImageBitmap(Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true));
        this.f39741B = i2;
    }

    public void setDegreeInstant(int i) {
        int i2 = i >= 0 ? i % 360 : (i % 360) + 360;
        if (i2 != this.f39743z) {
            this.f39743z = i2;
            this.f39742C = AnimationUtils.currentAnimationTimeMillis();
            int i3 = this.f39743z - this.f39741B;
            if (i3 < 0) {
                i3 += 360;
            }
            if (i3 > 180) {
                int i4 = i3 - 360;
            }
            invalidate();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.mo53605r(bitmap, true);
        Display defaultDisplay = ((WindowManager) getContext().getSystemService(s.m48664a("\u0005\"\u001c/\u001d<"))).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        float f = ((float) point.y) / ((float) point.x);
        float height = ((float) bitmap.getHeight()) / ((float) bitmap.getWidth());
        if (((double) height) <= 1.4d || height >= f) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            setScaleType(ImageView.ScaleType.FIT_START);
        }
    }
}
