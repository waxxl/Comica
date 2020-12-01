package com.picture.xyz.comica.imageprocessing;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class FastImageProcessingView extends GLSurfaceView {
    public FastImageProcessingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDebugFlags(3);
        mo53631a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53631a() {
        setEGLContextClientVersion(2);
    }

    public void setPipeline(FastImageProcessingPipeline aVar) {
        setRenderer(aVar);
        setRenderMode(0);
    }
}
