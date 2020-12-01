package com.picture.xyz.comica.imageprocessing.p253c.p502j;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.j.f */
public class SaturationFilter extends BasicFilter {

    /* renamed from: A */
    private int f41134A;

    /* renamed from: z */
    private float f41135z;

    public SaturationFilter(float f) {
        this.f41135z = f < 0.0f ? 0.0f : f;
    }

    /* renamed from: G */
    public float mo53650G() {
        return this.f41135z;
    }

    /* renamed from: H */
    public void mo53651H(float f) {
        this.f41135z = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Saturation;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   vec3 greyScaleColor = vec3(luminance);\n   gl_FragColor = vec4(mix(greyScaleColor, color.rgb, u_Saturation), color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41134A = GLES20.glGetUniformLocation(this.f15543d, "u_Saturation");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f41134A, this.f41135z);
    }
}
