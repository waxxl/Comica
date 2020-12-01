package com.picture.xyz.comica.imageprocessing.p253c.p502j;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.j.b */
public class ColourMatrixFilter extends BasicFilter {

    /* renamed from: A */
    private float f41128A;

    /* renamed from: B */
    private int f41129B;

    /* renamed from: C */
    private int f41130C;

    /* renamed from: z */
    private float[] f41131z;

    public ColourMatrixFilter(float[] fArr, float f) {
        this.f41131z = fArr;
        f = f < 0.0f ? 0.0f : f;
        this.f41128A = f > 1.0f ? 1.0f : f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Intensity;\nuniform mat4 u_ColorMatrix;\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   vec4 matrixResult = vec4(color.rgb, 1.0) * u_ColorMatrix;\n   vec4 colorResult = u_Intensity * matrixResult + (1.0 - u_Intensity) * color;\n   gl_FragColor = vec4(colorResult.rgb, color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41129B = GLES20.glGetUniformLocation(this.f15543d, "u_ColorMatrix");
        this.f41130C = GLES20.glGetUniformLocation(this.f15543d, "u_Intensity");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniformMatrix4fv(this.f41129B, 1, false, this.f41131z, 0);
        GLES20.glUniform1f(this.f41130C, this.f41128A);
    }
}
