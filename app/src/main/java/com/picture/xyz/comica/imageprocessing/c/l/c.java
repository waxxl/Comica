package com.picture.xyz.comica.imageprocessing.c.l;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.c.f;

/* compiled from: SharpenFilter */
public class c extends f {
    private float D;
    private int E;

    public c(float f2) {
        this.D = f2;
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_TexelWidth;\nuniform float u_TexelHeight;\nuniform float u_SharpenAmount;\nvoid main(){\n   vec2 singleStepOffset = vec2(u_TexelWidth, u_TexelHeight);\n   vec4 sum = vec4(0,0,0,0);\n   vec2 up = vec2(0.0, u_TexelHeight);\n   vec2 left = vec2(u_TexelWidth, 0.0);\n   sum += texture2D(u_Texture0, v_TexCoord) * (1.0 + 4.0 * u_SharpenAmount);\n   sum += texture2D(u_Texture0, v_TexCoord + up) * -u_SharpenAmount;\n   sum += texture2D(u_Texture0, v_TexCoord - up) * -u_SharpenAmount;\n   sum += texture2D(u_Texture0, v_TexCoord + left) * -u_SharpenAmount;\n   sum += texture2D(u_Texture0, v_TexCoord - left) * -u_SharpenAmount;\n   gl_FragColor = sum;\n}\n";
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.E = GLES20.glGetUniformLocation(this.f11439d, "u_SharpenAmount");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniform1f(this.E, this.D);
    }
}
