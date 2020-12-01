package com.picture.xyz.comica.comica;

import android.graphics.PointF;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import java.util.HashMap;
import java.util.List;

/* renamed from: gr.gamebrain.comica.h */
public class Face2 {

    /* renamed from: a */
    float f15529a;

    /* renamed from: b */
    PointF f15530b;

    /* renamed from: c */
    float f15531c;

    /* renamed from: d */
    PointF f15532d;

    /* renamed from: e */
    PointF f15533e;

    /* renamed from: f */
    PointF f15534f;

    /* renamed from: g */
    PointF f15535g;

    /* renamed from: h */
    PointF f15536h;

    /* renamed from: i */
    PointF f15537i;

    public Face2(int i, int i2, int i3, int i4, Face face) {
        HashMap hashMap = new HashMap();
        List<Landmark> c = face.getLandmarks();
        int i5 = 0;
        while (i5 < c.size()) {
            Landmark landmark = c.get(i5);
            PointF a = landmark.getPosition();
            m21131e(a, (float) i, (float) i2, i3, i4);
            i5++;
            hashMap.put(Integer.valueOf(landmark.getType()), a);
        }
        this.f15537i = (PointF) hashMap.get(1);
        this.f15534f = (PointF) hashMap.get(7);
        PointF pointF = this.f15534f;
        float f = pointF.x;
        PointF pointF2 = this.f15537i;
        this.f15533e = new PointF((f + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
        PointF pointF3 = (PointF) hashMap.get(10);
        PointF pointF4 = (PointF) hashMap.get(4);
        new PointF((pointF3.x + pointF4.x) / 2.0f, (pointF3.y + pointF4.y) / 2.0f);
        PointF pointF5 = (PointF) hashMap.get(5);
        PointF pointF6 = (PointF) hashMap.get(11);
        PointF pointF7 = new PointF((pointF6.x + pointF5.x) / 2.0f, (pointF6.y + pointF5.y) / 2.0f);
        this.f15536h = pointF7;
        this.f15532d = mo24154c(this.f15533e, pointF7, 2.1f);
        this.f15530b = mo24154c(this.f15533e, pointF3, 1.4f);
        this.f15535g = mo24154c(this.f15533e, pointF4, 1.4f);
        float f2 = pointF3.x;
        float f3 = pointF4.x;
        float f4 = pointF3.y;
        float f5 = pointF4.y;
        float sqrt = (float) Math.sqrt((double) (((f2 - f3) * (f2 - f3)) + ((f4 - f5) * (f4 - f5))));
        this.f15529a = (sqrt / 3.0f) + 0.1f;
        this.f15531c = sqrt * 1.2f;
    }

    /* renamed from: d */
    public static String m21130d(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 'r');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ 3);
        }
        return new String(cArr);
    }

    /* renamed from: e */
    private /* synthetic */ void m21131e(PointF pointF, float f, float f2, int i, int i2) {
        float f3 = pointF.x / f;
        pointF.x = f3;
        float f4 = pointF.y / f2;
        pointF.y = f4;
        if (i2 == 3) {
            if (i == i2) {
                pointF.x = 1.0f - f3;
                pointF.y = 1.0f - f4;
            } else if (i == 2) {
                pointF.x = f4;
                pointF.y = 1.0f - f3;
            } else if (i == 0) {
                pointF.x = 1.0f - f4;
                pointF.y = f3;
            }
        } else if (i2 != 1) {
        } else {
            if (i == i2) {
                pointF.x = f3;
                pointF.y = 1.0f - f4;
            } else if (i == 2) {
                pointF.x = f4;
                pointF.y = f3;
            } else if (i == 0) {
                pointF.x = 1.0f - f4;
                pointF.y = 1.0f - f3;
            }
        }
    }

    /* renamed from: a */
    public float mo24152a() {
        return this.f15529a;
    }

    /* renamed from: b */
    public PointF mo24153b() {
        return this.f15534f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public PointF mo24154c(PointF pointF, PointF pointF2, float f) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return new PointF(f2 + ((pointF2.x - f2) * f), f3 + ((pointF2.y - f3) * f));
    }

    /* renamed from: f */
    public PointF mo24155f() {
        return this.f15533e;
    }

    /* renamed from: g */
    public PointF mo24156g() {
        return this.f15532d;
    }

    /* renamed from: h */
    public PointF mo24157h() {
        return this.f15530b;
    }

    /* renamed from: i */
    public PointF mo24158i() {
        return this.f15535g;
    }

    /* renamed from: j */
    public float mo24159j() {
        return this.f15531c;
    }

    /* renamed from: k */
    public PointF mo24160k() {
        return this.f15537i;
    }

    /* renamed from: l */
    public PointF mo24161l() {
        return this.f15536h;
    }
}
