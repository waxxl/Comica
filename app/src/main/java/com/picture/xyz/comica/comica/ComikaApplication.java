package com.picture.xyz.comica.comica;

import android.app.Application;

import java.util.ArrayList;

/* renamed from: gr.gamebrain.comica.ComikaApplication */
/* compiled from: e */
public class ComikaApplication extends Application {

    /* renamed from: d */
    public static String f15520d = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmeklngOD7JtZ8Oj2GgtTtAGo8FFhP4hRoeAd90JrMAjpDegc5hFJz7BiulR5A3Hj4pQ7vvoSChFlXzL8kYOmMVqolESLbczbYbr14qd/HASp6MRa2zoxQRSdWK7DZYTG61Y5NsfT48snh5B6y6t4DPzmOiWBN9GgRfWzc4KsD7yoM+WCpU7qL8rFQSvtpxxQvzCoYuPrm8auf2vr1XRjd8OBzW6vXZQwi7cLYdxKqI5xjyMRAcYqf6oJhr1bUDUUnstltO3u6S94/wndRcEwoWxakoysI/0Ax3WfSOZdO4I9Fnsh/aJOBuNTktFiaq0iKXAiUzhuz+h3OFO4dOAmEwIDAQAB";

    /* renamed from: e */
    public static C4231a f15521e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ArrayList<C11207c> f15522a = new ArrayList<>();

    /* renamed from: b */
    private C4233l f15523b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f15524c;

    /* renamed from: gr.gamebrain.comica.ComikaApplication$a */
    /* compiled from: e */
    public enum C4231a {
        f15528d,
        f15525a,
        f15526b
    }

    static {
        C4231a aVar = C4231a.f15525a;
    }

    public void onCreate() {
        super.onCreate();
        ca.m21146e();
        C4233l lVar = new C4233l(this, getApplicationContext());
        this.f15523b = lVar;
        lVar.enable();
    }
}
