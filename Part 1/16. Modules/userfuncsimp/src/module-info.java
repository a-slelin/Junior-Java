module userfuncsimp {
    requires userfuncs;

    provides binaryfuncs.BinFuncProvider with binaryfuncsimp.AbsPlusProvider,
            binaryfuncsimp.AbsMinusProvider;
}