package com.picture.xyz.comica.imageprocessing;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class FastImageProcessingView extends GLSurfaceView {
    public FastImageProcessingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDebugFlags(3);
        a();
    }

    /* access modifiers changed from: protected */
    public void a() {
        setEGLContextClientVersion(2);
    }

    public void setPipeline(a aVar) {
        setRenderer(aVar);
        setRenderMode(0);
    }
}
