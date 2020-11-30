package com.picture.xyz.comica.imageprocessing.c.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.c.e;
import com.picture.xyz.comica.imageprocessing.d.ImageHelper;
import com.picture.xyz.comica.imageprocessing.e.a;

/* compiled from: TextureFilter */
public class c extends e {
    private int E;
    private Bitmap F;

    public c(Context context, int i) {
        super(2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        this.F = BitmapFactory.decodeResource(context.getResources(), i, options);
    }

    public void a(int i, a aVar, boolean z) {
        if (this.D.size() < 2 || !aVar.equals(this.D.get(0))) {
            G();
            H(aVar, 0);
            H(this, 1);
        }
        if (this.E == 0) {
            this.E = ImageHelper.a(this.F);
        }
        super.a(this.E, this, z);
        super.a(i, aVar, z);
    }

    public void c() {
        super.c();
        int i = this.E;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.E = 0;
        }
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "precision mediump float;\nuniform sampler2D u_Texture0;\nuniform sampler2D u_Texture1;\nvarying vec2 v_TexCoord;\nvoid main(){\n   vec4 color1 = texture2D(u_Texture0,v_TexCoord);\n   vec4 color2 = texture2D(u_Texture1,v_TexCoord);\n   gl_FragColor = color2;\n}\n";
    }
}
