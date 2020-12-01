package com.picture.xyz.comica.imageprocessing.p253c.p501i;


import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.i.b */
public class DarkenBlendFilter extends MultiInputFilter {

    /* renamed from: E */
    public static String f41125E = "precision mediump float;\nuniform sampler2D u_Texture0;\nuniform sampler2D u_Texture1;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 color1 = texture2D(u_Texture0,v_TexCoord);\n   vec4 color2 = texture2D(u_Texture1,v_TexCoord);\n   gl_FragColor = vec4(min(color2.rgb * color1.a, color1.rgb * color2.a) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), 1.0);\n}\n";

    public DarkenBlendFilter() {
        super(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return f41125E;
    }
}
