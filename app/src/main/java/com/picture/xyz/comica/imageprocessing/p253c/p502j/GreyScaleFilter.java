package com.picture.xyz.comica.imageprocessing.p253c.p502j;

import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.j.c */
public class GreyScaleFilter extends BasicFilter {
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nvec3 W = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(u_Texture0,v_TexCoord);\n   float grey =  dot(color.rgb, W);\n   gl_FragColor = vec4(grey, grey, grey, color.a);}\n";
    }
}
