package com.picture.xyz.comica.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.HashMap;

/* renamed from: com.xinlan.imageeditlibrary.editimage.f.g */
public class TextureCache {

    /* renamed from: c */
    private static TextureCache f33115c = null;

    /* renamed from: d */
    private static int f33116d = -17;

    /* renamed from: a */
    private HashMap<Integer, Bitmap> f33117a;

    /* renamed from: b */
    private Class f33118b;

    public TextureCache() {
        if (this.f33117a == null) {
            int maxMemory = ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8;
            this.f33117a = new HashMap<>();
        }
    }

    /* renamed from: a */
    private void m40392a(int i, Bitmap bitmap) {
        this.f33117a.put(Integer.valueOf(i), bitmap);
    }

    /* renamed from: d */
    public static TextureCache m40393d() {
        if (f33115c == null) {
            f33115c = new TextureCache();
        }
        return f33115c;
    }

    /* renamed from: b */
    public void mo46483b(Bitmap bitmap) {
        m40392a(f33116d, bitmap);
    }

    /* renamed from: c */
    public Bitmap mo46484c(Context context, int i, Bitmap.Config config) {
        Bitmap bitmap = this.f33117a.get(Integer.valueOf(i));
        if (bitmap == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            options.inPreferredConfig = config;
            bitmap = BitmapFactory.decodeResource(context.getResources(), i, options);
            if (bitmap != null) {
                m40392a(i, bitmap);
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    public Bitmap mo46485e() {
        return this.f33117a.get(Integer.valueOf(f33116d));
    }

    /* renamed from: f */
    public Class mo46486f() {
        return this.f33118b;
    }

    /* renamed from: g */
    public void mo46487g(Class cls) {
        this.f33118b = cls;
    }
}
