package com.picture.xyz.comica.imageprocessing.p253c.p502j;

import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.j.e */
public class NoFilter extends BasicFilter {
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   gl_FragColor = color;\n}\n";
    }
}
