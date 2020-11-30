package com.picture.xyz.comica.imageprocessing.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import com.picture.xyz.comica.imageprocessing.d.ImageHelper;

/* compiled from: ImageResourceInput */
public class ImageResourceInput extends a {
    private Bitmap A;
    private int B;
    private int C;
    private boolean D;
    private Context y;
    private GLSurfaceView z;
    FloatBuffer[] f11438c;
    int j;

    public ImageResourceInput(GLSurfaceView gLSurfaceView, Bitmap bitmap) {
        this.z = gLSurfaceView;
        H(bitmap);
    }

    private void D(Bitmap bitmap) {
        this.A = bitmap;
        this.B = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.C = height;
        t(this.B, height);
        this.D = true;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f11438c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f11438c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f11438c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f11438c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        this.z.requestRender();
    }

    private void E(Bitmap bitmap, float f2) {
        this.A = bitmap;
        this.B = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.C = height;
        int i = this.B;
        if (i < height) {
            this.B = (int) f2;
            this.C = (int) (((float) height) * (f2 / ((float) i)));
        } else {
            this.C = (int) f2;
            this.B = (int) (((float) i) * (f2 / ((float) height)));
        }
        t(this.B, this.C);
        this.D = true;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f11438c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f11438c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f11438c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f11438c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11438c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        this.z.requestRender();
    }

    private void F() {
        int i = this.j;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.j = ImageHelper.a(this.A);
        this.D = false;
        A();
    }

    public void G(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        D(BitmapFactory.decodeResource(this.y.getResources(), i, options));
    }

    public void H(Bitmap bitmap) {
        D(bitmap);
    }

    public void I(Bitmap bitmap, float f2) {
        E(bitmap, f2);
    }

    public void c() {
        super.c();
        int i = this.j;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.D = true;
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (this.D) {
            F();
        }
        super.d();
    }

    public ImageResourceInput(GLSurfaceView gLSurfaceView, Bitmap bitmap, float f2) {
        this.z = gLSurfaceView;
        I(bitmap, f2);
    }

    public ImageResourceInput(GLSurfaceView gLSurfaceView, Context context, int i) {
        this.y = context;
        this.z = gLSurfaceView;
        G(i);
    }
}
