package com.picture.xyz.comica.imageprocessing.c.i;

import com.picture.xyz.comica.imageprocessing.c.e;

/* compiled from: DarkenBlendFilter */
public class b extends e {
    public static String E = "precision mediump float;\nuniform sampler2D u_Texture0;\nuniform sampler2D u_Texture1;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 color1 = texture2D(u_Texture0,v_TexCoord);\n   vec4 color2 = texture2D(u_Texture1,v_TexCoord);\n   gl_FragColor = vec4(min(color2.rgb * color1.a, color1.rgb * color2.a) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), 1.0);\n}\n";

    public b() {
        super(2);
    }

    /* access modifiers changed from: protected */
    public String i() {
        return E;
    }
}
