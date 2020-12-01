package com.picture.xyz.comica.imageprocessing.p505d;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: com.picture.xyz.comica.imageprocessing.d.a */
public class ImageHelper {
    /* renamed from: a */
    public static int m50969a(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return iArr[0];
    }
}
