package com.picture.xyz.comica.imageprocessing.c.j;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.c.BasicFilter;

/* compiled from: LuminanceThresholdFilter */
public class d extends BasicFilter {
    private float A;
    private int z;

    public d(float f2) {
        this.A = f2;
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Threshold;\nvec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   gl_FragColor = vec4(vec3(step(u_Threshold, luminance)), color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.z = GLES20.glGetUniformLocation(this.f11439d, "u_Threshold");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniform1f(this.z, this.A);
    }
}
