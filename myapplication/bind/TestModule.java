package com.xc.myapplication.bind;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class TestModule {

    @Binds
   abstract AInterface bindAInterface(AInterfaceImp01 aInterfaceImp01);

    @Provides
   static AInterfaceImp01 provideAInterfaceImp01() {
        return new AInterfaceImp01();
    }

    @Provides
    static AInterfaceImp02 provideAInterfaceImp02() {
        return new AInterfaceImp02();
    }
}
