package com.picture.xyz.comica.imageprocessing.c.j;

import com.picture.xyz.comica.imageprocessing.c.BasicFilter;

/* compiled from: NoFilter */
public class e extends BasicFilter {
    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   gl_FragColor = color;\n}\n";
    }
}
