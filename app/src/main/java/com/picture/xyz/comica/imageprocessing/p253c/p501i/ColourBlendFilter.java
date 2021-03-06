package com.picture.xyz.comica.imageprocessing.p253c.p501i;


import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.i.a */
public class ColourBlendFilter extends MultiInputFilter {

    /* renamed from: E */
    public static String f41124E = "precision mediump float;\nuniform sampler2D u_Texture0;\nuniform sampler2D u_Texture1;\nvarying vec2 v_TexCoord;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(u_Texture0,v_TexCoord);\n   vec4 color2 = texture2D(u_Texture1,v_TexCoord);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color2.rgb, lum(color1.rgb)) * color2.a, color1.a);\n}\n";

    public ColourBlendFilter() {
        super(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return f41124E;
    }
}
