package com.picture.xyz.comica.imageprocessing.p253c.p503k;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.k.b */
public class PosterizeFilter extends BasicFilter {

    /* renamed from: A */
    private float f41140A;

    /* renamed from: z */
    private int f41141z;

    public PosterizeFilter(float f) {
        this.f41140A = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Quantization;\nvoid main(){\n   vec4 color = texture2D(u_Texture0, v_TexCoord);\n   vec3 posterizedImageColor = floor((color.rgb * u_Quantization) + 0.5) / u_Quantization;\n   gl_FragColor = vec4(posterizedImageColor, color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41141z = GLES20.glGetUniformLocation(this.f15543d, "u_Quantization");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f41141z, this.f41140A);
    }
}
