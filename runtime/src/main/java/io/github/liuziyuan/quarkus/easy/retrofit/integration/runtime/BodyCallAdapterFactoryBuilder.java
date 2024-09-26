package io.github.liuziyuan.quarkus.easy.retrofit.integration.runtime;


import io.github.easyretrofit.adapter.simplebody.SimpleBodyCallAdapterFactory;
import io.github.easyretrofit.core.builder.BaseCallAdapterFactoryBuilder;
import retrofit2.CallAdapter;

public class BodyCallAdapterFactoryBuilder extends BaseCallAdapterFactoryBuilder {
    @Override
    public CallAdapter.Factory buildCallAdapterFactory() {
        return SimpleBodyCallAdapterFactory.create();
    }
}
