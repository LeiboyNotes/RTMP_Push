#include <jni.h>
#include <string>

#include <rtmp.h>
#include <x264.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_zl_push_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    char version[50];
    sprintf(version,"rtmp version:%d",RTMP_LibVersion());
//    return env->NewStringUTF(hello.c_str());
x264_picture_t *picture = new x264_picture_t;
    return env->NewStringUTF(version);
}
