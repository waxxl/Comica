package com.picture.xyz.comica.imageprocessing.c.k;

import android.opengl.GLES20;

import com.picture.xyz.comica.imageprocessing.c.BasicFilter;

/* compiled from: KuwaharaFilter */
public class a extends BasicFilter {
    private int A;
    private float B;
    private float C;
    private int z;

    public a(int i, float f2) {
        this.B = (float) i;
        this.C = f2;
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision highp float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform vec2 u_Size;\nuniform float u_Radius;\nuniform float u_Spacing;\nvoid main(){\n  vec2 uv = v_TexCoord;\n  int radius = int(u_Radius);\n  vec2 spacing = vec2(u_Spacing);\n\tvec2 src_size = vec2 (1.0 / u_Size.x, 1.0 / u_Size.y)*spacing;\n  float n = float((radius + 1) * (radius + 1));\n  int i; int j;\n  vec3 m0 = vec3(0.0); vec3 m1 = vec3(0.0); vec3 m2 = vec3(0.0); vec3 m3 = vec3(0.0);\n  vec3 s0 = vec3(0.0); vec3 s1 = vec3(0.0); vec3 s2 = vec3(0.0); vec3 s3 = vec3(0.0);\n  vec3 c;\n\tfor (j = -radius; j <= 0; ++j)  {\n\t\tfor (i = -radius; i <= 0; ++i)  {\n     \t\tc = texture2D(u_Texture0, uv + vec2(i,j) * src_size).rgb;\n     \t\tm0 += c;\n     \t\ts0 += c * c;\n \t\t}\n\t}\n \tfor (j = -radius; j <= 0; ++j)  {\n \t\tfor (i = 0; i <= radius; ++i)  {\n \t\t\tc = texture2D(u_Texture0, uv + vec2(i,j) * src_size).rgb;\n \t\t\tm1 += c;\n \t\t\ts1 += c * c;\n \t\t}\n \t}\n \tfor (j = 0; j <= radius; ++j)  {\n \t\tfor (i = 0; i <= radius; ++i)  {\n \t\t\tc = texture2D(u_Texture0, uv + vec2(i,j) * src_size).rgb;\n \t\t\tm2 += c;\n \t\t\ts2 += c * c;\n \t\t}\n \t}\n \tfor (j = 0; j <= radius; ++j)  {\n \t\tfor (i = -radius; i <= 0; ++i)  {\n \t\t\tc = texture2D(u_Texture0, uv + vec2(i,j) * src_size).rgb;\n \t\t\tm3 += c;\n \t\t\ts3 += c * c;\n     \t}\n \t}\n \tfloat min_sigma2 = 1e+2;\n \tm0 /= n;\n \ts0 = abs(s0 / n - m0 * m0);\n \tfloat sigma2 = s0.r + s0.g + s0.b;\n \tif (sigma2 < min_sigma2) {\n \t\tmin_sigma2 = sigma2;\n \t\tgl_FragColor = vec4(m0, 1.0);\n \t}\n \tm1 /= n;\n \ts1 = abs(s1 / n - m1 * m1);\n \tsigma2 = s1.r + s1.g + s1.b;\n \tif (sigma2 < min_sigma2) {\n \t\tmin_sigma2 = sigma2;\n \t\tgl_FragColor = vec4(m1, 1.0);\n \t}\n \tm2 /= n;\n \ts2 = abs(s2 / n - m2 * m2);\n \tsigma2 = s2.r + s2.g + s2.b;\n \tif (sigma2 < min_sigma2) {\n \t\tmin_sigma2 = sigma2;\n \t\tgl_FragColor = vec4(m2, 1.0);\n \t}\n \tm3 /= n;\n \ts3 = abs(s3 / n - m3 * m3);\n \tsigma2 = s3.r + s3.g + s3.b;\n \tif (sigma2 < min_sigma2) {\n \t\tmin_sigma2 = sigma2;\n \t\tgl_FragColor = vec4(m3, 1.0);\n \t}\n}\n";
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        this.z = GLES20.glGetUniformLocation(this.f11439d, "u_Radius");
        this.A = GLES20.glGetUniformLocation(this.f11439d, "u_Spacing");
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        GLES20.glUniform1f(this.z, this.B);
        GLES20.glUniform1f(this.A, this.C);
    }
}
