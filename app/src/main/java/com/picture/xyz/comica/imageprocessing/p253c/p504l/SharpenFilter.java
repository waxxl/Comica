package com.picture.xyz.comica.imageprocessing.p253c.p504l;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.MultiPixelRenderer;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.l.c */
public class SharpenFilter extends MultiPixelRenderer {

    /* renamed from: D */
    private float f41145D;

    /* renamed from: E */
    private int f41146E;

    public SharpenFilter(float f) {
        this.f41145D = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_TexelWidth;\nuniform float u_TexelHeight;\nuniform float u_SharpenAmount;\nvoid main(){\n   vec2 singleStepOffset = vec2(u_TexelWidth, u_TexelHeight);\n   vec4 sum = vec4(0,0,0,0);\n   vec2 up = vec2(0.0, u_TexelHeight);\n   vec2 left = vec2(u_TexelWidth, 0.0);\n   sum += texture2D(u_Texture0, v_TexCoord) * (1.0 + 4.0 * u_SharpenAmount);\n   sum += texture2D(u_Texture0, v_TexCoord + up) * -u_SharpenAmount;\n   sum += texture2D(u_Texture0, v_TexCoord - up) * -u_SharpenAmount;\n   sum += texture2D(u_Texture0, v_TexCoord + left) * -u_SharpenAmount;\n   sum += texture2D(u_Texture0, v_TexCoord - left) * -u_SharpenAmount;\n   gl_FragColor = sum;\n}\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41146E = GLES20.glGetUniformLocation(this.f15543d, "u_SharpenAmount");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f41146E, this.f41145D);
    }
}
