#include <jni.h>
#include <string>
#include <GLES2/gl2.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_picture_xyz_comica_activity_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    //glClear(GL_COLOR_BUFFER_BIT);


    return env->NewStringUTF(hello.c_str());
}
