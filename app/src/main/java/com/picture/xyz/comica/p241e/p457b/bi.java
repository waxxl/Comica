package com.picture.xyz.comica.p241e.p457b;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.Buffer;
import com.picture.xyz.comica.p488g.g;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: e.b.d */
public class bi extends BasicFilter {
    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo24186C() {
        if (g.f39812a) {
            GLES30.glTexImage2D(3553, 0, 34842, mo24173l(), mo24171j(), 0, 6408, 5131, (Buffer) null);
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, mo24173l(), mo24171j(), 0, 6408, 5121, (Buffer) null);
        }
    }
}
