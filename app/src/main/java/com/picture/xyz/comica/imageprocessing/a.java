package com.picture.xyz.comica.imageprocessing;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: FastImageProcessingPipeline */
public class a implements GLSurfaceView.Renderer {

    /* renamed from: a  reason: collision with root package name */
    private boolean f29908a = false;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f29909b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<b> f29910c = new ArrayList();

    private synchronized boolean c() {
        return this.f29908a;
    }

    public void a(b bVar) {
        synchronized (this.f29910c) {
            this.f29910c.add(bVar);
        }
    }

    public synchronized void b(b bVar) {
        this.f29909b.add(bVar);
    }

    public synchronized void d() {
        this.f29908a = false;
    }

    public synchronized void e() {
        if (this.f29909b.size() != 0) {
            this.f29908a = true;
        }
    }

    public void onDrawFrame(GL10 gl10) {
        b bVar;
        if (c()) {
            for (int i = 0; i < this.f29909b.size(); i++) {
                synchronized (this) {
                    bVar = this.f29909b.get(i);
                }
                bVar.p();
            }
        }
        synchronized (this.f29910c) {
            for (b c2 : this.f29910c) {
                c2.c();
            }
            this.f29910c.clear();
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
    }
}
