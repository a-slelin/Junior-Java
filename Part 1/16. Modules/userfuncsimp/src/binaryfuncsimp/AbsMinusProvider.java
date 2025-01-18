package binaryfuncsimp;

import binaryfuncs.*;

public class AbsMinusProvider implements BinFuncProvider {
    @Override
    public BinaryFunc get() {
        return new AbsMinus();
    }
}
