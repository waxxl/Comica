package com.picture.xyz.comica.imageprocessing;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.picture.xyz.comica.imageprocessing.a */
public class FastImageProcessingPipeline implements GLSurfaceView.Renderer {

    /* renamed from: a */
    private boolean f41086a = false;

    /* renamed from: b */
    private List<GLRenderer> f41087b = new ArrayList();

    /* renamed from: c */
    private List<GLRenderer> f41088c = new ArrayList();

    /* renamed from: c */
    private synchronized boolean m50896c() {
        return this.f41086a;
    }

    /* renamed from: a */
    public void mo53633a(GLRenderer bVar) {
        synchronized (this.f41088c) {
            this.f41088c.add(bVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo53634b(GLRenderer bVar) {
        this.f41087b.add(bVar);
    }

    /* renamed from: d */
    public synchronized void mo53635d() {
        this.f41086a = false;
    }

    /* renamed from: e */
    public synchronized void mo53636e() {
        if (this.f41087b.size() != 0) {
            this.f41086a = true;
        }
    }

    public void onDrawFrame(GL10 gl10) {
        GLRenderer bVar;
        if (m50896c()) {
            for (int i = 0; i < this.f41087b.size(); i++) {
                synchronized (this) {
                    bVar = this.f41087b.get(i);
                }
                bVar.mo24176p();
            }
        }
        synchronized (this.f41088c) {
            for (GLRenderer c : this.f41088c) {
                c.mo24165c();
            }
            this.f41088c.clear();
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
    }
}
