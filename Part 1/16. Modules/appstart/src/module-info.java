module appstart {
    exports mymodappdemo;

    requires appfuncs;
    requires userfuncs;

    uses binaryfuncs.BinFuncProvider;
}