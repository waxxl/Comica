package com.picture.xyz.comica.imageprocessing.p254e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: com.picture.xyz.comica.imageprocessing.e.b */
public class ImageResourceInput extends GLTextureOutputRenderer {

    /* renamed from: A */
    private Bitmap f41152A;

    /* renamed from: B */
    private int f41153B;

    /* renamed from: C */
    private int f41154C;

    /* renamed from: D */
    private boolean f41155D;

    /* renamed from: y */
    private Context f41156y;

    /* renamed from: z */
    private GLSurfaceView f41157z;

    public ImageResourceInput(GLSurfaceView gLSurfaceView, Bitmap bitmap) {
        this.f41157z = gLSurfaceView;
        mo53653H(bitmap);
    }

    /* renamed from: D */
    private void m50970D(Bitmap bitmap) {
        this.f41152A = bitmap;
        this.f41153B = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f41154C = height;
        mo24179t(this.f41153B, height);
        this.f41155D = true;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f15542c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f15542c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f15542c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f15542c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        this.f41157z.requestRender();
    }

    /* renamed from: E */
    private void m50971E(Bitmap bitmap, float f) {
        this.f41152A = bitmap;
        this.f41153B = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f41154C = height;
        int i = this.f41153B;
        if (i < height) {
            this.f41153B = (int) f;
            this.f41154C = (int) (((float) height) * (f / ((float) i)));
        } else {
            this.f41154C = (int) f;
            this.f41153B = (int) (((float) i) * (f / ((float) height)));
        }
        mo24179t(this.f41153B, this.f41154C);
        this.f41155D = true;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f15542c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f15542c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f15542c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f15542c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15542c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        this.f41157z.requestRender();
    }

    /* renamed from: F */
    private void m50972F() {
        int i = this.f15549j;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.f15549j = ImageHelper.m50969a(this.f41152A);
        this.f41155D = false;
        mo24184A();
    }

    /* renamed from: G */
    public void mo53652G(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        m50970D(BitmapFactory.decodeResource(this.f41156y.getResources(), i, options));
    }

    /* renamed from: H */
    public void mo53653H(Bitmap bitmap) {
        m50970D(bitmap);
    }

    /* renamed from: I */
    public void mo53654I(Bitmap bitmap, float f) {
        m50971E(bitmap, f);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f15549j;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.f41155D = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo24166d() {
        if (this.f41155D) {
            m50972F();
        }
        super.mo24166d();
    }

    public ImageResourceInput(GLSurfaceView gLSurfaceView, Bitmap bitmap, float f) {
        this.f41157z = gLSurfaceView;
        mo53654I(bitmap, f);
    }

    public ImageResourceInput(GLSurfaceView gLSurfaceView, Context context, int i) {
        this.f41156y = context;
        this.f41157z = gLSurfaceView;
        mo53652G(i);
    }
}
