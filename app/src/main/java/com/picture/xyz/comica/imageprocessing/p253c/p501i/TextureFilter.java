package com.picture.xyz.comica.imageprocessing.p253c.p501i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p505d.ImageHelper;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.i.c */
public class TextureFilter extends MultiInputFilter {

    /* renamed from: E */
    private int f41126E;

    /* renamed from: F */
    private Bitmap f41127F;

    public TextureFilter(Context context, int i) {
        super(2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        this.f41127F = BitmapFactory.decodeResource(context.getResources(), i, options);
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41110D.size() < 2 || !aVar.equals(this.f41110D.get(0))) {
            mo53647G();
            mo53648H(aVar, 0);
            mo53648H(this, 1);
        }
        if (this.f41126E == 0) {
            this.f41126E = ImageHelper.m50969a(this.f41127F);
        }
        super.mo24183a(this.f41126E, this, z);
        super.mo24183a(i, aVar, z);
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        int i = this.f41126E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f41126E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nuniform sampler2D u_Texture1;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 color1 = texture2D(u_Texture0,v_TexCoord);\n   vec4 color2 = texture2D(u_Texture1,v_TexCoord);\n   gl_FragColor = color2;\n}\n";
    }
}
