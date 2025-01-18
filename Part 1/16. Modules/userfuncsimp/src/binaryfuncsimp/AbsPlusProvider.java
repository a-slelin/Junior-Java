package binaryfuncsimp;

import binaryfuncs.BinFuncProvider;
import binaryfuncs.BinaryFunc;

public class AbsPlusProvider implements BinFuncProvider {
    @Override
    public BinaryFunc get() {
        return new AbsPlus();
    }
}
