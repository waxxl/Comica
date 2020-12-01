package com.picture.xyz.comica.imageprocessing.p253c.p502j;

import com.picture.xyz.comica.imageprocessing.p253c.CompositeFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BoxBlurFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.j.a */
public class AdaptiveThresholdFilter extends CompositeFilter {
    public AdaptiveThresholdFilter() {
        super(2);
        GreyScaleFilter cVar = new GreyScaleFilter();
        BoxBlurFilter bVar = new BoxBlurFilter();
        cVar.mo24187w(bVar);
        bVar.mo24187w(this);
        cVar.mo24187w(this);
        mo53648H(cVar, 0);
        mo53648H(bVar, 1);
        mo53640J(cVar);
        mo53641K(cVar);
        mo53641K(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nuniform sampler2D u_Texture1;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 luminance = texture2D(u_Texture0,v_TexCoord);\n   vec4 blur = texture2D(u_Texture1,v_TexCoord);\n   gl_FragColor = vec4(vec3(step(blur - 0.05, luminance)), 1.0);\n}\n";
    }
}
