package com.picture.xyz.comica.imageprocessing.p253c.p504l;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.l.d */
public class UnsharpMaskFilter extends BasicFilter {

    /* renamed from: A */
    private int f41147A;

    /* renamed from: B */
    private float f41148B;

    /* renamed from: C */
    private int f41149C;

    /* renamed from: D */
    private int f41150D;

    /* renamed from: z */
    private float f41151z;

    public UnsharpMaskFilter(int i, float f) {
        this.f41151z = f;
        this.f41150D = i;
        this.f41148B = 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Intensity;\nuniform float u_Threshold;\nconst int  blur_size =" + this.f41150D + ";\nvec3 W = vec3(0.2125, 0.7154, 0.0721);\nvec4 quickblur(vec2 pos)\n{\nvec4 pixval = vec4(0.);\nfloat csum = 0.;\nfloat blur_width = 1.0;\nint nb = 2*blur_size+1;\nfor (int y=0; y<nb; y++)\n{\nfor (int x=0; x<nb; x++)\n{ \n   vec2 ipos = pos + vec2(blur_width*float(x-blur_size)/256.0, blur_width*float(y-blur_size)/256.0);\n   pixval+= texture2D(" + "u_Texture0" + ", ipos);\n}\n}\nreturn pixval/pow(float(nb), 2.);\n}\nvoid main(){\n   vec4 sharp = texture2D(" + "u_Texture0" + ", " + "v_TexCoord" + ");\n   vec4 blur =quickblur(" + "v_TexCoord" + ");\n   vec4 difff = vec4(sharp.rgb - blur.rgb, sharp.a);\n   vec4 signs = sign(difff);\n   float intensity = " + "u_Intensity" + ";\n   if (length((difff.rgb)) < " + "u_Threshold" + ")\n   \tintensity = 0.0;\n   float lumsharp = dot(sharp.rgb, W);\n   float lumtemp = dot(blur.rgb, W);\n   if ((lumsharp - lumtemp) > 0.0)\n   \tintensity = intensity / 1.0;\n   gl_FragColor = sharp + difff*intensity;\n}\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41147A = GLES20.glGetUniformLocation(this.f15543d, "u_Intensity");
        this.f41149C = GLES20.glGetUniformLocation(this.f15543d, "u_Threshold");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f41147A, this.f41151z);
        GLES20.glUniform1f(this.f41149C, this.f41148B);
    }

    public UnsharpMaskFilter(int i, float f, float f2) {
        this.f41151z = f;
        this.f41150D = i;
        this.f41148B = f2;
    }
}
