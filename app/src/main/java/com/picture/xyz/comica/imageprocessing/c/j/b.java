package com.picture.xyz.comica.imageprocessing.c.j;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.c.BasicFilter;

/* compiled from: ColourMatrixFilter */
public class b extends BasicFilter {
    private float A;
    private int B;
    private int C;
    private float[] z;

    public b(float[] fArr, float f2) {
        this.z = fArr;
        f2 = f2 < 0.0f ? 0.0f : f2;
        this.A = f2 > 1.0f ? 1.0f : f2;
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Intensity;\nuniform mat4 u_ColorMatrix;\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   vec4 matrixResult = vec4(color.rgb, 1.0) * u_ColorMatrix;\n   vec4 colorResult = u_Intensity * matrixResult + (1.0 - u_Intensity) * color;\n   gl_FragColor = vec4(colorResult.rgb, color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.B = GLES20.glGetUniformLocation(this.f11439d, "u_ColorMatrix");
        this.C = GLES20.glGetUniformLocation(this.f11439d, "u_Intensity");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniformMatrix4fv(this.B, 1, false, this.z, 0);
        GLES20.glUniform1f(this.C, this.A);
    }
}
