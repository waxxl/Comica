package com.picture.xyz.comica.comica;

import android.content.Intent;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import com.picture.xyz.comica.p488g.g;

/* renamed from: gr.gamebrain.comica.k */
public class ma extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    String f39821a;

    /* renamed from: b */
    Uri f39822b;

    /* renamed from: c */
    final /* synthetic */ EditActivity f39823c;

    public ma(EditActivity editActivity, Uri uri) {
        this.f39823c = editActivity;
        this.f39822b = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        this.f39821a = new File(this.f39823c.getCacheDir(), q.m48751b("#001+0&;\";i578")).getAbsolutePath();
        try {
            InputStream openInputStream = this.f39823c.getContentResolver().openInputStream(this.f39822b);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f39821a));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    openInputStream.close();
                    return null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(Void voidR) {
        int i = 0;
        try {
            int attributeInt = new ExifInterface(this.f39821a).getAttributeInt(g.m48767a("[`}wzfuf}}z"), 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this.f39823c.getApplicationContext(), ImageviewActivity.class);
        intent.putExtra(q.m48751b("7>37"), this.f39821a);
        intent.putExtra(g.m48767a("{`}wzfuf}}z"), i);
        intent.putExtra(q.m48751b("\";.+"), true);
        this.f39823c.startActivityForResult(intent, 100);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
    }
}
