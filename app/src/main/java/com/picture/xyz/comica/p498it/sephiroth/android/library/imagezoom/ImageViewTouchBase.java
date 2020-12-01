package com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

import com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom.p499a.C11650a;
import com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom.p499a.C11651b;
import com.picture.xyz.comica.p498it.sephiroth.android.library.imagezoom.p500b.C11652a;


/* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase */
@SuppressLint("AppCompatCustomView")
public class ImageViewTouchBase extends ImageView {

    /* renamed from: a */
    protected C11651b f41050a = new C11650a();

    /* renamed from: b */
    protected Matrix f41051b = new Matrix();

    /* renamed from: c */
    protected Matrix f41052c = new Matrix();

    /* renamed from: d */
    protected Handler f41053d = new Handler();

    /* renamed from: e */
    protected Runnable f41054e = null;

    /* renamed from: f */
    protected float f41055f;

    /* renamed from: g */
    protected final Matrix f41056g = new Matrix();

    /* renamed from: h */
    protected final float[] f41057h = new float[9];

    /* renamed from: i */
    protected int f41058i = -1;

    /* renamed from: j */
    protected int f41059j = -1;

    /* renamed from: k */
    protected boolean f41060k = false;

    /* renamed from: l */
    protected RectF f41061l = new RectF();

    /* renamed from: m */
    protected RectF f41062m = new RectF();

    /* renamed from: n */
    protected RectF f41063n = new RectF();

    /* renamed from: o */
    private C11649d f41064o;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$a */
    class C11646a implements Runnable {

        /* renamed from: b */
        private final /* synthetic */ Drawable f41066b;

        /* renamed from: c */
        private final /* synthetic */ boolean f41067c;

        /* renamed from: d */
        private final /* synthetic */ Matrix f41068d;

        /* renamed from: e */
        private final /* synthetic */ float f41069e;

        C11646a(Drawable drawable, boolean z, Matrix matrix, float f) {
            this.f41066b = drawable;
            this.f41067c = z;
            this.f41068d = matrix;
            this.f41069e = f;
        }

        public void run() {
            ImageViewTouchBase.this.mo53612u(this.f41066b, this.f41067c, this.f41068d, this.f41069e);
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$b */
    class C11647b implements Runnable {

        /* renamed from: a */
        double f41070a = 0.0d;

        /* renamed from: b */
        double f41071b = 0.0d;

        /* renamed from: d */
        private final /* synthetic */ double f41073d;

        /* renamed from: e */
        private final /* synthetic */ long f41074e;

        /* renamed from: f */
        private final /* synthetic */ double f41075f;

        /* renamed from: g */
        private final /* synthetic */ double f41076g;

        C11647b(double d, long j, double d2, double d3) {
            this.f41073d = d;
            this.f41074e = j;
            this.f41075f = d2;
            this.f41076g = d3;
        }

        public void run() {
            double min = Math.min(this.f41073d, (double) (System.currentTimeMillis() - this.f41074e));
            double d = min;
            double a = ImageViewTouchBase.this.f41050a.mo53621a(d, 0.0d, this.f41075f, this.f41073d);
            double a2 = ImageViewTouchBase.this.f41050a.mo53621a(d, 0.0d, this.f41076g, this.f41073d);
            ImageViewTouchBase.this.mo53599m(a - this.f41070a, a2 - this.f41071b);
            this.f41070a = a;
            this.f41071b = a2;
            if (min < this.f41073d) {
                ImageViewTouchBase.this.f41053d.post(this);
                return;
            }
            RectF d2 = ImageViewTouchBase.this.mo53587d(true, true);
            if (d2.left != 0.0f || d2.top != 0.0f) {
                ImageViewTouchBase.this.mo53603p(d2.left, d2.top);
            }
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$c */
    class C11648c implements Runnable {

        /* renamed from: b */
        private final /* synthetic */ float f41078b;

        /* renamed from: c */
        private final /* synthetic */ long f41079c;

        /* renamed from: d */
        private final /* synthetic */ float f41080d;

        /* renamed from: e */
        private final /* synthetic */ float f41081e;

        /* renamed from: f */
        private final /* synthetic */ float f41082f;

        /* renamed from: g */
        private final /* synthetic */ float f41083g;

        C11648c(float f, long j, float f2, float f3, float f4, float f5) {
            this.f41078b = f;
            this.f41079c = j;
            this.f41080d = f2;
            this.f41081e = f3;
            this.f41082f = f4;
            this.f41083g = f5;
        }

        public void run() {
            float min = Math.min(this.f41078b, (float) (System.currentTimeMillis() - this.f41079c));
            ImageViewTouchBase.this.mo53615x(this.f41080d + (this.f41081e * min), this.f41082f, this.f41083g);
            if (min < this.f41078b) {
                ImageViewTouchBase.this.f41053d.post(this);
            }
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$d */
    public interface C11649d {
        /* renamed from: a */
        void mo53620a(Drawable drawable);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo53573i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo53569b(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (drawable != null) {
            if (this.f41060k) {
                mo53589f(drawable, this.f41051b);
            } else {
                mo53588e(drawable, this.f41051b);
            }
            super.setImageDrawable(drawable);
        } else {
            this.f41051b.reset();
            super.setImageDrawable((Drawable) null);
        }
        if (z) {
            this.f41052c.reset();
            if (matrix != null) {
                this.f41052c = new Matrix(matrix);
            }
        }
        setImageMatrix(getImageViewMatrix());
        if (f < 1.0f) {
            this.f41055f = mo53598j();
        } else {
            this.f41055f = f;
        }
        mo53574k(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo53586c(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF d = mo53587d(z, z2);
            if (d.left != 0.0f || d.top != 0.0f) {
                mo53601o(d.left, d.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r0 < r7) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* renamed from: d */
    public RectF mo53587d(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float height = 1920;
        float f4 = 0;
        if (getDrawable() == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        RectF bitmapRect = getBitmapRect();
        float height2 = bitmapRect.height();
        float width = bitmapRect.width();
        if (z2) {
            float height3 = (float) getHeight();
            if (height2 < height3) {
                height = (height3 - height2) / 2.0f;
                f4 = bitmapRect.top;
            } else {
                float f5 = bitmapRect.top;
                if (f5 > 0.0f) {
                    f = -f5;
                    if (z) {
                        float width2 = (float) getWidth();
                        if (width < width2) {
                            width2 = (width2 - width) / 2.0f;
                            f3 = bitmapRect.left;
                        } else {
                            float f6 = bitmapRect.left;
                            if (f6 > 0.0f) {
                                f2 = -f6;
                                this.f41062m.set(f2, f, 0.0f, 0.0f);
                                return this.f41062m;
                            }
                            f3 = bitmapRect.right;
                        }
                        f2 = width2 - f3;
                        this.f41062m.set(f2, f, 0.0f, 0.0f);
                        return this.f41062m;
                    }
                    f2 = 0.0f;
                    this.f41062m.set(f2, f, 0.0f, 0.0f);
                    return this.f41062m;
                } else if (bitmapRect.bottom < height3) {
                    height = (float) getHeight();
                    f4 = bitmapRect.bottom;
                }
            }
            f = height - f4;
            if (z) {
            }
            f2 = 0.0f;
            this.f41062m.set(f2, f, 0.0f, 0.0f);
            return this.f41062m;
        }
        f = 0.0f;
        if (z) {
        }
        f2 = 0.0f;
        this.f41062m.set(f2, f, 0.0f, 0.0f);
        return this.f41062m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo53588e(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        if (intrinsicWidth > width || intrinsicHeight > height) {
            float min = Math.min(Math.min(width / intrinsicWidth, 2.0f), Math.min(height / intrinsicHeight, 2.0f));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
            return;
        }
        matrix.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo53589f(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        float min = Math.min(Math.min(width / intrinsicWidth, 2.0f), Math.min(height / intrinsicHeight, 2.0f));
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public float mo53590g(Matrix matrix) {
        return mo53597h(matrix, 0);
    }

    /* access modifiers changed from: protected */
    public RectF getBitmapRect() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix imageViewMatrix = getImageViewMatrix();
        this.f41061l.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        imageViewMatrix.mapRect(this.f41061l);
        return this.f41061l;
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f41052c);
    }

    public Matrix getImageViewMatrix() {
        this.f41056g.set(this.f41051b);
        this.f41056g.postConcat(this.f41052c);
        return this.f41056g;
    }

    public float getMaxZoom() {
        return this.f41055f;
    }

    public float getRotation() {
        return 0.0f;
    }

    public float getScale() {
        return mo53590g(this.f41052c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public float mo53597h(Matrix matrix, int i) {
        matrix.getValues(this.f41057h);
        return this.f41057h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo53573i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public float mo53598j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f41058i), ((float) drawable.getIntrinsicHeight()) / ((float) this.f41059j)) * 4.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo53574k(Drawable drawable) {
        C11649d dVar = this.f41064o;
        if (dVar != null) {
            dVar.mo53620a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo53575l(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo53599m(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f41063n.set((float) d, (float) d2, 0.0f, 0.0f);
        mo53613v(bitmapRect, this.f41063n);
        RectF rectF = this.f41063n;
        mo53601o(rectF.left, rectF.top);
        mo53586c(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo53600n(float f, float f2, float f3) {
        this.f41052c.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo53601o(float f, float f2) {
        this.f41052c.postTranslate(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f41058i = i3 - i;
        this.f41059j = i4 - i2;
        Runnable runnable = this.f41054e;
        if (runnable != null) {
            this.f41054e = null;
            runnable.run();
        }
        if (getDrawable() != null) {
            if (this.f41060k) {
                mo53589f(getDrawable(), this.f41051b);
            } else {
                mo53588e(getDrawable(), this.f41051b);
            }
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* renamed from: p */
    public void mo53603p(float f, float f2) {
        mo53599m((double) f, (double) f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo53604q(float f, float f2, double d) {
        double d2 = d;
        this.f41053d.post(new C11647b(d2, System.currentTimeMillis(), (double) f, (double) f2));
    }

    /* renamed from: r */
    public void mo53605r(Bitmap bitmap, boolean z) {
        mo53606s(bitmap, z, (Matrix) null);
    }

    /* renamed from: s */
    public void mo53606s(Bitmap bitmap, boolean z, Matrix matrix) {
        mo53611t(bitmap, z, matrix, -1.0f);
    }

    public void setFitToScreen(boolean z) {
        if (z != this.f41060k) {
            this.f41060k = z;
            requestLayout();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        mo53605r(bitmap, true);
    }

    public void setImageDrawable(Drawable drawable) {
        mo53612u(drawable, true, (Matrix) null, -1.0f);
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setOnBitmapChangedListener(C11649d dVar) {
        this.f41064o = dVar;
    }

    /* renamed from: t */
    public void mo53611t(Bitmap bitmap, boolean z, Matrix matrix, float f) {
        Log.i("image", "setImageBitmap: " + bitmap);
        if (bitmap != null) {
            mo53612u(new C11652a(bitmap), z, matrix, f);
        } else {
            mo53612u((Drawable) null, z, matrix, f);
        }
    }

    /* renamed from: u */
    public void mo53612u(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (getWidth() <= 0) {
            this.f41054e = new C11646a(drawable, z, matrix, f);
        } else {
            mo53569b(drawable, z, matrix, f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo53613v(RectF rectF, RectF rectF2) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (rectF.top >= 0.0f && rectF.bottom <= height) {
            rectF2.top = 0.0f;
        }
        if (rectF.left >= 0.0f && rectF.right <= width) {
            rectF2.left = 0.0f;
        }
        float f = rectF.top;
        if (rectF2.top + f >= 0.0f && rectF.bottom > height) {
            rectF2.top = (float) ((int) (0.0f - f));
        }
        float f2 = rectF.bottom;
        float f3 = height - 0.0f;
        if (rectF2.top + f2 <= f3 && rectF.top < 0.0f) {
            rectF2.top = (float) ((int) (f3 - f2));
        }
        float f4 = rectF.left;
        if (rectF2.left + f4 >= 0.0f) {
            rectF2.left = (float) ((int) (0.0f - f4));
        }
        float f5 = rectF.right;
        float f6 = width - 0.0f;
        if (rectF2.left + f5 <= f6) {
            rectF2.left = (float) ((int) (f6 - f5));
        }
    }

    /* renamed from: w */
    public void mo53614w(float f, float f2) {
        mo53616y(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo53615x(float f, float f2, float f3) {
        setScaleType(ImageView.ScaleType.MATRIX);
        float f4 = this.f41055f;
        if (f > f4) {
            f = f4;
        }
        mo53600n(f / getScale(), f2, f3);
        mo53575l(getScale());
        mo53586c(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo53616y(float f, float f2, float f3, float f4) {
        long currentTimeMillis = System.currentTimeMillis();
        float scale = (f - getScale()) / f4;
        this.f41053d.post(new C11648c(f4, currentTimeMillis, getScale(), scale, f2, f3));
    }
}
