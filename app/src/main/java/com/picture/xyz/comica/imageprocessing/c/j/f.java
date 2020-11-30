package com.picture.xyz.comica.imageprocessing.c.j;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.c.BasicFilter;

/* compiled from: SaturationFilter */
public class f extends BasicFilter {
    private int A;
    private float z;

    public f(float f2) {
        this.z = f2 < 0.0f ? 0.0f : f2;
    }

    public float G() {
        return this.z;
    }

    public void H(float f2) {
        this.z = f2;
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Saturation;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   vec3 greyScaleColor = vec3(luminance);\n   gl_FragColor = vec4(mix(greyScaleColor, color.rgb, u_Saturation), color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.A = GLES20.glGetUniformLocation(this.f11439d, "u_Saturation");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniform1f(this.A, this.z);
    }
}
