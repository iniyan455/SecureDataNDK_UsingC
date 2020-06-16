#include <jni.h>
#include<stdio.h>
#include<string.h>
#include <android/log.h>


JNIEXPORT jstring JNICALL
Java_com_digitap_securedata_MainActivity_getNativeKey1(JNIEnv *env, jobject thiz) {
    // TODO: implement getNativeKey1()
    return (*env)->  NewStringUTF(env, "iniyan");

}



JNIEXPORT jstring JNICALL
Java_com_digitap_securedata_MainActivity_getNativeKey2(JNIEnv *env, jobject thiz) {
    return (*env)->  NewStringUTF(env, "ashok");

}
