package com.picture.xyz.comica.imageprocessing.c.j;

import com.picture.xyz.comica.imageprocessing.c.b;

/* compiled from: AdaptiveThresholdFilter */
public class a extends b {
    public a() {
        super(2);
        c cVar = new c();
        com.picture.xyz.comica.imageprocessing.c.l.b bVar = new com.picture.xyz.comica.imageprocessing.c.l.b();
        cVar.w(bVar);
        bVar.w(this);
        cVar.w(this);
        H(cVar, 0);
        H(bVar, 1);
        J(cVar);
        K(cVar);
        K(bVar);
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nuniform sampler2D u_Texture1;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 luminance = texture2D(u_Texture0,v_TexCoord);\n   vec4 blur = texture2D(u_Texture1,v_TexCoord);\n   gl_FragColor = vec4(vec3(step(blur - 0.05, luminance)), 1.0);\n}\n";
    }
}
