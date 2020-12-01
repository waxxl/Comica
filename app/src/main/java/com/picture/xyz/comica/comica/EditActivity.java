package com.picture.xyz.comica.comica;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Bundle;
import android.util.Log;
import com.picture.xyz.comica.p243f.p244a.p245a.C4230g;
import com.picture.xyz.comica.p243f.p244a.p245a.j;
import com.picture.xyz.comica.p243f.p244a.p245a.l;
import com.picture.xyz.comica.p243f.p244a.p245a.u;
import com.picture.xyz.comica.p488g.g;

/* renamed from: gr.gamebrain.comica.EditActivity */
/* compiled from: ma */
public class EditActivity extends Activity  {



    /* renamed from: e */
    private /* synthetic */ void m48713e() {
        C4230g gVar = new C4230g((EGLContext) null, 2);
        l cVar = new l(gVar, 1, 1);
        cVar.mo51913b();
        String glGetString = GLES20.glGetString(7939);
        Log.e(u.m48672a("h%Y8C.D2C."), glGetString);
        g.m48768b(glGetString);
        cVar.mo51916e();
        gVar.mo24148f();
    }

    /* renamed from: f */




    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    public void mo51962g(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra(j.m48668a("\u0002]\u0007A\fZ\u0007\u001d\n]\u0017V\rGMV\u001bG\u0011RM`7a&r."));
        if (uri == null) {
            uri = intent.getData();
        }
        boolean z = true;
        if (uri != null) {
            try {
                String[] strArr = {u.m48672a("\u0002I<Y<"), j.m48668a("\fA\nV\rG\u0002G\n\\\r")};
                Cursor query = getContentResolver().query(uri, strArr, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    query.moveToFirst();
                    String string = query.getString(query.getColumnIndex(strArr[0]));
                    int i = query.getInt(query.getColumnIndex(strArr[1]));
                    query.close();
                    if (string != null) {
                        try {
                            Intent intent2 = new Intent(getApplicationContext(), ImageviewActivity.class);
                            intent2.putExtra(u.m48672a("]<Y5"), string);
                            intent2.putExtra(j.m48668a("\fA\nV\rG\u0002G\n\\\r"), i);
                            intent2.putExtra(u.m48672a("H9D)"), true);
                            startActivityForResult(intent2, 100);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            new ma(this, uri).execute(new Void[0]);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        z = false;
        if (z) {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if (!u.m48672a("L3I/B4IsD3Y8C)\u0003<N)D2Csh\u0019d\t").equals(action) || type == null) {
            if (u.m48672a("L3I/B4IsD3Y8C)\u0003<N)D2Cs~\u0018c\u0019").equals(action) && type != null && type.startsWith(j.m48668a("Z\u000eR\u0004VL"))) {
                mo51962g(intent);
            }
        } else if (type.startsWith(j.m48668a("Z\u000eR\u0004VL"))) {
            mo51962g(intent);
        }
    }
}
