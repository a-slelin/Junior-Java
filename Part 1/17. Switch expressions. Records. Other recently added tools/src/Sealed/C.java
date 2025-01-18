package Sealed;

// Подкласс А, который будет иметь только 3 подкласса указанные в сигнатуре
public sealed class C extends A permits E, F, G {
}
