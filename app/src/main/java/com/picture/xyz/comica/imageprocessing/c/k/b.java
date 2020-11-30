package com.picture.xyz.comica.imageprocessing.c.k;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.c.BasicFilter;

/* compiled from: PosterizeFilter */
public class b extends BasicFilter {
    private float A;
    private int z;

    public b(float f2) {
        this.A = f2;
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Quantization;\nvoid main(){\n   vec4 color = texture2D(u_Texture0, v_TexCoord);\n   vec3 posterizedImageColor = floor((color.rgb * u_Quantization) + 0.5) / u_Quantization;\n   gl_FragColor = vec4(posterizedImageColor, color.a);\n}\n";
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.z = GLES20.glGetUniformLocation(this.f11439d, "u_Quantization");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniform1f(this.z, this.A);
    }
}
