#include <jni.h>
#include <iostream>

extern "C" JNIEXPORT void JNICALL Java_test_NATIVE_Main_Method(JNIEnv *env, jclass cls) {
    std::cout << "Hello from C++!" << std::endl;
}