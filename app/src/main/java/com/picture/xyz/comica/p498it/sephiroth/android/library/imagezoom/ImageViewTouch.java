package com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

/* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch */
public class ImageViewTouch extends ImageViewTouchBase {

    /* renamed from: p */
    protected ScaleGestureDetector f41038p;

    /* renamed from: q */
    protected GestureDetector f41039q;

    /* renamed from: r */
    protected float f41040r;

    /* renamed from: s */
    protected float f41041s;

    /* renamed from: t */
    protected int f41042t;

    /* renamed from: u */
    protected GestureDetector.OnGestureListener f41043u;

    /* renamed from: v */
    protected ScaleGestureDetector.OnScaleGestureListener f41044v;

    /* renamed from: w */
    protected boolean f41045w = true;

    /* renamed from: x */
    protected boolean f41046x = true;

    /* renamed from: y */
    protected boolean f41047y = true;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$a */
    public class C11644a extends GestureDetector.SimpleOnGestureListener {
        public C11644a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            Log.i("image", "onDoubleTap. double tap enabled? " + ImageViewTouch.this.f41045w);
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.f41045w) {
                float scale = imageViewTouch.getScale();
                ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                float min = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(imageViewTouch2.mo53580z(scale, imageViewTouch2.getMaxZoom()), 0.9f));
                ImageViewTouch imageViewTouch3 = ImageViewTouch.this;
                imageViewTouch3.f41040r = min;
                imageViewTouch3.mo53616y(min, motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Log.i("image", "onFling. double tap enabled? " + ImageViewTouch.this.f41045w);
            if (!ImageViewTouch.this.f41047y || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || ImageViewTouch.this.f41038p.isInProgress()) {
                return false;
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(f) > 800.0f || Math.abs(f2) > 800.0f) {
                ImageViewTouch.this.mo53604q(x / 2.0f, y / 2.0f, 300.0d);
                ImageViewTouch.this.invalidate();
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.f41038p.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!ImageViewTouch.this.f41047y || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || ImageViewTouch.this.f41038p.isInProgress() || ImageViewTouch.this.getScale() == 1.0f) {
                return false;
            }
            ImageViewTouch.this.mo53603p(-f, -f2);
            ImageViewTouch.this.invalidate();
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$b */
    public class C11645b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C11645b() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getCurrentSpan();
            scaleGestureDetector.getPreviousSpan();
            float scaleFactor = ImageViewTouch.this.f41040r * scaleGestureDetector.getScaleFactor();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (!imageViewTouch.f41046x) {
                return false;
            }
            float min = Math.min(imageViewTouch.getMaxZoom(), Math.max(scaleFactor, 0.9f));
            ImageViewTouch.this.mo53615x(min, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
            imageViewTouch2.f41040r = Math.min(imageViewTouch2.getMaxZoom(), Math.max(min, 0.9f));
            ImageViewTouch imageViewTouch3 = ImageViewTouch.this;
            imageViewTouch3.f41042t = 1;
            imageViewTouch3.invalidate();
            return true;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo53569b(Drawable drawable, boolean z, Matrix matrix, float f) {
        super.mo53569b(drawable, z, matrix, f);
        this.f41041s = getMaxZoom() / 3.0f;
    }

    public boolean getDoubleTapEnabled() {
        return this.f41045w;
    }

    /* access modifiers changed from: protected */
    public GestureDetector.OnGestureListener getGestureListener() {
        return new C11644a();
    }

    /* access modifiers changed from: protected */
    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new C11645b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo53573i() {
        super.mo53573i();
        ViewConfiguration.getTouchSlop();
        this.f41043u = getGestureListener();
        this.f41044v = getScaleListener();
        this.f41038p = new ScaleGestureDetector(getContext(), this.f41044v);
        this.f41039q = new GestureDetector(getContext(), this.f41043u, (Handler) null, true);
        this.f41040r = 1.0f;
        this.f41042t = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo53574k(Drawable drawable) {
        super.mo53574k(drawable);
        float[] fArr = new float[9];
        this.f41052c.getValues(fArr);
        this.f41040r = fArr[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo53575l(float f) {
        super.mo53575l(f);
        if (!this.f41038p.isInProgress()) {
            this.f41040r = f;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f41038p.onTouchEvent(motionEvent);
        if (!this.f41038p.isInProgress()) {
            this.f41039q.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1 && getScale() < 1.0f) {
            mo53614w(1.0f, 50.0f);
        }
        return true;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f41045w = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f41046x = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f41047y = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public float mo53580z(float f, float f2) {
        if (this.f41042t == 1) {
            float f3 = this.f41041s;
            if ((2.0f * f3) + f <= f2) {
                return f + f3;
            }
            this.f41042t = -1;
            return f2;
        }
        this.f41042t = 1;
        return 1.0f;
    }
}
