package com.picture.xyz.comica.imageprocessing.p253c.p502j;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.j.d */
public class LuminanceThresholdFilter extends BasicFilter {

    /* renamed from: A */
    private float f41132A;

    /* renamed from: z */
    private int f41133z;

    public LuminanceThresholdFilter(float f) {
        this.f41132A = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Threshold;\nvec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   gl_FragColor = vec4(vec3(step(u_Threshold, luminance)), color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41133z = GLES20.glGetUniformLocation(this.f15543d, "u_Threshold");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f41133z, this.f41132A);
    }
}
